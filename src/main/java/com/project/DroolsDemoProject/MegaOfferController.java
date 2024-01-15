package com.project.DroolsDemoProject;

import java.io.IOException;
import java.text.ParseException;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class MegaOfferController {
	@Autowired
	private KieSession session;
	
	private DroolConfig config = new DroolConfig();

	@PostMapping("/order")
	public Order orderNow(@RequestBody Order order) throws ParseException {
//		order.setDate(order.getDate());
//		System.out.println("Date: "+order.getDate());
		System.out.println("Order Starts");
		try {
			session = config.getKieSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		session.insert(order);
//		System.out.println("Order: "+ order.getCardType()+", "+order.getDiscount());
//		System.out.println("SESSION: "+session);
		session.fireAllRules();
		System.out.println();
		return order;
	}

}
