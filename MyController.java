package com.example.demo;

import java.io.Serial;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class MyController {

    /*private String navbar() {
        return """
            <style>
                body { 
                font-family: Arial, sans-serif;
                }
                .navbar {
                    background-color: #d3a284;
                    padding: 10px;
                    display: flex;              
                    justify-content: center;   
                    align-items: center;   
                }
                .navbar a {
                    color: black;
                    text-decoration: none;
                    margin-right: 15px;
                    font-weight: bold;
                }
                .navbar a:hover {
                    text-decoration: underline;
                }
            </style>

            <div class="navbar">
                <a href="java">Home</a>
                <a href="about">About</a>
                <a href="gallery">Gallery</a>
                <a href="help">Help</a>
                <a href="contact">Contact</a>
            </div>
        """;
    }*/

    @RequestMapping("java")
    public String home() {
        return "Home";
    }

    @RequestMapping("about")
    public String about(HttpSession session) {

        List<String> friends = List.of(
                "Rahul",
                "Amit",
                "Sneha",
                "Priya",
                "Kiran"
        );
        
        List<Integer> age = List.of(
                24,
                20,
                18,
                30,
                12
          );


        session.setAttribute("age", age);
        return "About";
    }

    @RequestMapping("gallery")
    public String gallery() {
        return  "Gallery";
    }

    @RequestMapping("help")
    public String help() {
        return  "Help";
    }

    @RequestMapping("contact")
    public String contact() {
        return "Contact";
    }
    
    @RequestMapping("calculator")
    public String calculator() {
        return "Calculator";
    }
    @RequestMapping("hello")
    public String Hello(ServletRequest request,HttpSession session) {
    	String name=request.getParameter("name");
    	int age=Integer.parseInt(request.getParameter("age"));
    	
    	System.out.println("Name:"+name);
    	System.out.println("Age:"+age);
    	
    	session.setAttribute("name", name);
    	session.setAttribute("age", age);

        return "Result";
    }
    
    @RequestMapping( "calculate")
    public String Add(ServletRequest request,HttpSession session) {
    	int n1=Integer.parseInt(request.getParameter("firstNo"));
    	int n2=Integer.parseInt(request.getParameter("secondNo"));
    	String operation= request.getParameter("operation");
    	int c=0;
    	
    	
    	
    	switch (operation) {
		case "add": {
			
			c=n1+n2;
			break;
		}
        case "sub": {
			
			c=n1-n2;
			break;
		}
       case "mul": {
	 
	        c=n1*n2;
	        break;
       }
       case "div": {
	
	      c=n1 / n2;
	      break;
      }
      case "mod": {
	
	      c= n1 % n2;
	      break;
       }
    	}
      
      session.setAttribute("result", c);
      return "Result"; 
		
    }
    
    @RequestMapping("register")
    public String register() {
    	return "Registration";
    }
}
