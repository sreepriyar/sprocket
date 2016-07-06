package org.sprotekex.DemoStockSpring.DB;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.sprotekex.DemoStockSpring.model.SprocketDetail;
import org.sprotekex.DemoStockSpring.model.UserSprocket;

public class SprocketDAO {
	private static HashMap<String,UserSprocket> sprocketList = new HashMap<String,UserSprocket>();
	
	public static HashMap<String,UserSprocket> getAllUserSprockets(){
		
		UserSprocket sprocket = new UserSprocket("user1",20,20.1,getDetail("user1"));
		UserSprocket sprocket1= new UserSprocket("user2",50,900.1,getDetail("user2"));
		sprocketList.put("user1", sprocket );
		sprocketList.put("user2", sprocket1);
		return sprocketList;
	}
	
	private static ArrayList<SprocketDetail> getDetail(String userId){
		ArrayList<SprocketDetail> details = new ArrayList<SprocketDetail>();
		if(userId.equals("user1")){
			details.add(new SprocketDetail(new Date(),"BUY", 15,5,75));
			details.add(new SprocketDetail(new Date(),"BUY", 20,5,100));
			details.add(new SprocketDetail(new Date(),"SELL", 10,5,50));
		}else{
			details.add(new SprocketDetail(new Date(),"BUY", 2,5,10));
			details.add(new SprocketDetail(new Date(),"BUY", 10,5,50));
			details.add(new SprocketDetail(new Date(),"SELL", 6,5,30));
		}
		return details;
	}
}
