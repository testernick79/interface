package com.nickfonseca.finalProjectJava;

import java.util.ArrayList;
import java.util.Scanner;
//import com.sun.java_cup.internal.runtime.Scanner;

public class finalProjectApplication {
	//list of tasks = an array
	static ArrayList<Tasker> task;
	static Scanner sc;

	public static void main(String[] args) {
		task = new ArrayList<Tasker>();
		
		sc = new Scanner(System.in);
		
		//default added tasks
		task.add(new Tasker("Install new faucet"));
		task.add(new Tasker("Paint wall in studio"));
		
		boolean running = true;
		
		do {
			displayMenu();
			int menuChoice = readChoice();
			
			switch(menuChoice) {
			case 1:				
				listTasks();
				System.out.println("Item to add: ");
				String AddId = sc.nextLine();
				addTask(AddId);
				break;
			case 2:
				listTasks();
				System.out.println("Item to remove: ");
				int RemoveId = readChoice();
				removeTask(RemoveId);
				break;
			case 3:
				listTasks();
				System.out.println("Items Not Done: ");
				int CompleteId = readChoice();
				completeTask(CompleteId);
				break;
			case 4:
				listTasks();
				break;
			case 0:
				running = false;
				System.out.println("--EXIT PROGRAM--");
				break;
				default:
					System.out.println("Unknown input, Try again!");
			}
			
			//running = false;
		} while(running);
		

		
		//loop until user exits
		//display menu = sysout 
		//1: add a task
		//2: remove task
		//3: mark as complete
		//4: list tasks
		//user prompt: = scanner

	}
	public static void displayMenu(){
		System.out.println("--Tasker Task Manager--");
		System.out.println("1: add a task");
		System.out.println("2: remove a task");
		System.out.println("3: mark task complete");
		System.out.println("4: list task");
		System.out.println("0: quit");
		System.out.println("Choose an option: ");
		
	}
	public static int readChoice() {
		int result = sc.nextInt();
		sc.nextLine();
		return result;
	}
	public static void listTasks() {
		System.out.println("-->>Tasks<<--");
		for(int i = 0; i < task.size(); i++) {
			System.out.println(i + 1 + "* " + task.get(i).toString());
		}
	}
	public static void completeTask(int id) {
		task.get(id-1).setComplete(true);
	}
	public static void removeTask(int id) {
		task.remove(id-1);
	}
	public static void addTask(String name) {
		task.add(new Tasker(name));
	}

}
