package org.sprotekex.DemoStockSpring.api;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sprotekex.DemoStockSpring.model.UserSprocket;

import org.sprotekex.DemoStockSpring.service.SprocketService;;

@RestController
public class SprocketController {
    @RequestMapping("/Sprocket/{userId}")
    public UserSprocket getSprocketsByUser(@PathVariable("userId")String userId) {
    	 return sprocketService.getSprocketsByUser(userId);
    }
    
    @Autowired
    private SprocketService sprocketService;
}