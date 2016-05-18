package com.spring.quickstart.autowiring;

public class Logger {
	
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	public Logger(){
		System.out.println("Logger No-arg constructor...");
	}
	
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter){
		System.out.println("Logger parameterized constructor...");
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text){
		fileWriter.writeLog(text);
	}
	
	public void writeConsole(String text){
		consoleWriter.writeLog(text);
	}

	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		System.out.println("setting consoleWriter");
		this.consoleWriter = consoleWriter;
	}

	public void setFileWriter(FileWriter fileWriter) {
		System.out.println("setting fileWriter");
		this.fileWriter = fileWriter;
	}

	@Override
	public String toString() {
		return "Logger [consoleWriter=" + consoleWriter + ", fileWriter=" + fileWriter + "]";
	}
	
}
