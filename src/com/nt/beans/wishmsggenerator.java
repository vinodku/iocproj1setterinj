package com.nt.beans;

import java.util.Date;

public class wishmsggenerator {
	private Date date;
	//setter method

	public void setDate(Date date) {
		this.date = date;
	}
	//b.method
	public String generatorwishmsg(String uname) {
		int hour=0;
		//get current hours of the day
		System.out.println("date=="+date);
		hour=date.getHours();
		//write b.logic
		if(hour<=12)
			return "gud mrng"+uname;
		else if(hour<=16)
		return  "gud afternoon"+"   "+uname;
		else if(hour<=20)
			return "gud evng"+uname;
		else
			return "gud nt"+uname;
		
		}//method
}//class