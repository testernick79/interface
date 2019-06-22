package com.nickfonseca.finalProjectJava;

public class Tasker {
	private String name;
	private boolean complete;
	
	public Tasker(String name) {
		this.name = name;
		this.complete = false;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean getComplete() {
		return this.complete;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
	@Override
	public String toString() {
		return this.name + (this.complete ? "(Task Done)" : "");
	}

}
