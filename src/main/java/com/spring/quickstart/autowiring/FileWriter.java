package com.spring.quickstart.autowiring;

public class FileWriter implements LogWriter{
	public void writeLog(String text){
		System.out.println("FileWriter : " + text);
	}

//	@Override
//	public String toString() {
//		return "FileWriter []";
//	}
}