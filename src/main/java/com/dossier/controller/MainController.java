package com.dossier.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
	static Logger logger = LoggerFactory.getLogger(MainController.class);



    @RequestMapping(value="/test", method=RequestMethod.GET)
	public @ResponseBody String handletest() {
    	return "hello";
	}
    
 
}
