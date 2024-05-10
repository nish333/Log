package com.example.demo.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class Log4j 
{	
   	private static Logger log=LogManager.getLogger(Log4j.class);
	@GetMapping("/logo")
	public String method() 
	{
		log.info("Log is present");
		log.debug("Debug is Working now");
		return ("Nishanth");
	}
}

