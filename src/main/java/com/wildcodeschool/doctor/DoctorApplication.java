package com.wildcodeschool.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication

public class DoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}
	 @RequestMapping("/")
	    @ResponseBody
	    public String index() {
	    	return "<ul><li><a href='/doctor/1'>William Hartnell</a></li>"
	    			+ "<li><a href='/doctor/2'>Patrick Troughton</a></li>"
	    			+ "<li><a href='/doctor/3'>Jon Pertwee</a></li>"
	    			+ "<li><a href='/doctor/4'>Tom Baker</a></li></ul>";    
	    	}
	 
	 @RequestMapping(value = "/doctor", method = RequestMethod.GET)
	   public String redirect() {
	      return "redirect:/";
	   }
	 @RequestMapping("/doctor/1")
	    @ResponseBody
	    public String doctor1() {
	    	return "<h1>William Hartnell</h1>";    
	    	}
	 @RequestMapping("/doctor/2")
	    @ResponseBody
	    public String doctor2() {
	    	return "<h1>Patrick Troughton</h1>";    
	    	}
	 @RequestMapping("/doctor/3")
	    @ResponseBody
	    public String doctor3() {
	    	return "<h1>Jon Pertwee</h1>";    
	    	}
	 @RequestMapping("/doctor/4")
	    @ResponseBody
	    public String doctor4() {
	    	return "<h1>Tom Baker</h1>";    
	    	}
}
