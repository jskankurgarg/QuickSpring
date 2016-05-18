package com.spring.quickstart.autowiring;

public class ConsoleWriter implements LogWriter{
	public void writeLog(String text){
		System.out.println("ConsoleWrite : " + text);
	}

	@Override
	public String toString() {
		return "ConsoleWriter []";
	}
	
}
