package com.udemy.springdemo;

public class GolfCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public GolfCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Hit 100 line drives";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " Enjoy it!!!";
	}

}
