package com.stackroute.findmeclinic.notificationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.findmeclinic.notificationservice.model.Notification;
import com.stackroute.findmeclinic.notificationservice.service.Notificationservice;
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/v1/notify")
public class NotificationController {
	/* @MessageMapping("/hello")
	    @SendTo("/topic/greetings")
	    public String sendNotification(String name) throws Exception {
//	        Thread.sleep(1000); // simulated delay
		 System.out.println("name is"+ name);
		 return name;
//	        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	    }*/
	
	
	
	private Notificationservice notificationService;
	
	@Autowired
	public NotificationController(Notificationservice notificationService)
	{
		this.notificationService=notificationService;
	}
	
	@PostMapping()
	public ResponseEntity<?> getNotication( @RequestBody Notification notification){
		System.out.println("notification object"+ notification);
		ResponseEntity<?> responseEntity = null;
		notificationService.sendNotification(notification);
		return responseEntity;
	}
	
	
}
