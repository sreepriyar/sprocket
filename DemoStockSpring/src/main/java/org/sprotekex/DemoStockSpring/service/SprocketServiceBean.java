package org.sprotekex.DemoStockSpring.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.sprotekex.DemoStockSpring.DB.SprocketDAO;
import org.sprotekex.DemoStockSpring.model.UserSprocket;

@Service
public class SprocketServiceBean implements SprocketService {
	HashMap<String,UserSprocket> allSprockets = new HashMap<String,UserSprocket>();
	
	
	public SprocketServiceBean(){
		allSprockets=SprocketDAO.getAllUserSprockets();
		
	}
	
	
	@Override
	public UserSprocket getSprocketsByUser(String userId) {
		return allSprockets.get(userId);
	}


	
}
