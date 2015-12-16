package org.company;

public class MyDate{
private int day=1;
private int month=1;
private int year=2000;
private MyDate date;

	public MyDate(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public MyDate(MyDate date){
		this.day=date.day;
		this.month=date.month;
		this.year=date.year;
	}

	public String toString(){
		return day+"-"+month+"-"+year;
	}
	
	public MyDate addDays(int moreDays){
			this.day+=moreDays;
			
		  /*  if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
				if(this.day>31)
			{
				
				
			}
			}
			else{
				
				
			}
			*/
		return this;
	}

	

}