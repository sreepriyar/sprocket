package org.sprotekex.DemoStockSpring.service;

import org.sprotekex.DemoStockSpring.model.UserSprocket;

public interface SprocketService {
	
	UserSprocket getSprocketsByUser(String userId);

}
