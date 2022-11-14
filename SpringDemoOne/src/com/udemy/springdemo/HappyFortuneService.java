package com.udemy.springdemo;

import java.util.ArrayList;
import java.util.Collections;

public class HappyFortuneService implements FortuneService {

	ArrayList<String> todaysFortune = new ArrayList<String>();
	
	public HappyFortuneService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getFortune() {
		
		// return a random fortune from the array
		todaysFortune.add("Today is your lucky day!");
		todaysFortune.add("I see great things for you!");
		todaysFortune.add("You will have great health!");
		
		Collections.shuffle(todaysFortune);
		
		return todaysFortune.get(0);
	}

}
