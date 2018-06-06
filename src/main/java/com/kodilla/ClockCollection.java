package com.kodilla;

import java.util.*;
import java.lang.*;
import java.time.*;

class Clock
{
	private LocalTime timeValue;
	
	public Clock(int hourValue, int minuteValue, int secondValue)
	{
		this.timeValue = LocalTime.of(hourValue, minuteValue, secondValue);
	}
	
	public Clock()
	{
		this.timeValue = LocalTime.now();
	}
	
	public LocalTime getTimeValue()
	{
		return this.timeValue;
	}
	
	public void timeChanger(int a, int b)
	{
		timeValue = timeValue.plusHours(a).plusMinutes(b);
		
	}
	
	public void timeChanger(int a)
	{
		timeValue = timeValue.plusMinutes(a);
		
	}
	
	public String toString()
	{
		return this.timeValue.toString();
	}
}


class Program
{
	public static void main(String[] args)
	{
		Clock timePiece1 = new Clock();
		Clock timePiece2 = new Clock(8, 18, 56);
		Clock timePiece3 = new Clock(19, 59, 23);
		Clock timePiece4 = new Clock(15, 35, 33);
		Clock timePiece5 = new Clock(10, 02, 01);
		
		List<Clock> listOfClocks = new LinkedList<Clock>();
		listOfClocks.add(timePiece1);
		listOfClocks.add(timePiece2);
		listOfClocks.add(timePiece3);
		listOfClocks.add(timePiece4);
		listOfClocks.add(timePiece5);
		
		System.out.println(listOfClocks);
		
		timePiece1.timeChanger(14, 52);
		timePiece1.timeChanger(14);
		
		System.out.println(listOfClocks);
	}
}