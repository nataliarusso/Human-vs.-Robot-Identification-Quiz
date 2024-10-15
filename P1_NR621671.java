/* 	
 * ICSI/IECE 201 Introduction to Computer Science

 * Fall 2024
 *
 * Lab class <10:35>
 * <Natalia Russo>
 * <NR621671>
 * <ngrusso@albany.edu>
 * 
 * Project 1
 * <This project asks a series of questions to determine if the user is alive or a robot.>
 * 
 * The program was tested with the following inputs:
 * 
 * Question 1 <yes>
 * Question 2 <charging>
 * Question 3 <yes>
 * Question 4 <electricity>
 * Question 5 <yes>
 *    ...  
 * Level of confidence: 92%
 *
 * Results: alive 74 %, machine 54 %  
 * 
*/


import java.util.Scanner;
import java.util.Random;


public class P1_NR621671 {
	
	public static void main(String[] args) {
		Scanner scnr= new Scanner (System.in);
		Random random=new Random();
		
		while (true) {
			int humanScore=0;
			int robotScore=0;
			int totalHuman=100;
			int totalRobot=100;
		
		//Question #1
		while(true) {
		System.out.print("Are you a human? (yes/no)");
		String question1 =scnr.nextLine();
		System.out.println(question1.toLowerCase());
		
		if (question1.equalsIgnoreCase("yes")) { 
		humanScore+=20;
		break; 
		} else if(question1.equalsIgnoreCase("no")) { 
			robotScore+=20;
			break; 
		} else {
		System.out.println("Invalid input, try again.");

		
		}
	}
	
		//Question #2
		while(true) {
		System.out.print("Do you prefer grilled cheese or charging?");
		String question2 =scnr.nextLine();
		System.out.println(question2.toLowerCase());
		
		if (question2.equalsIgnoreCase("grilled cheese")) { 
		humanScore+=15;
		break;
		} else if(question2.equalsIgnoreCase("charging")) {
		robotScore+=20;
		break;
			
		} else {
		System.out.println("Invalid input, try again.");
		
		}}
		
		//Question #3
		while(true) {
		System.out.print("Have you been in love? (yes/no)");
		String question3 =scnr.nextLine();
		System.out.println(question3.toLowerCase());
		if (question3.equalsIgnoreCase("yes")) {
		humanScore+=20;
		break;
		} else if (question3.equalsIgnoreCase("no")) {
		robotScore+=5;
		break;
		} else {
		System.out.println("Invalid input, try again.");
		
			}}
		
		//Question #4
		while(true) {
		System.out.print("Do you require electricity or sleep?");
		String question4 =scnr.nextLine();
		System.out.println(question4.toLowerCase());
		if (question4.equalsIgnoreCase("sleep")) {
		humanScore+=15;
		break;
		}else if (question4.equalsIgnoreCase("electricity")) {
		robotScore+=30;
		break;
		} else {
		System.out.println("Invalid input, try again.");
		
		}}
		
		//Question $5
		while(true) {
		System.out.print("Do you shower? (yes/no)");
		String question5 =scnr.nextLine();
		System.out.println(question5.toLowerCase());
		if (question5.equalsIgnoreCase("yes")) {
		humanScore+=30;
		break;
		}else if (question5.equalsIgnoreCase("no")) {
		robotScore+=25;
		break;
		} else {
		System.out.println("Invalid input, try again.");
	
		

		}}
		//confidence level calculator 
	    int confidence=-1;
	    while (confidence<0 || confidence>100) {
		System.out.print("How confident are you in your answers on a scale of 0-100? ");
		confidence=scnr.nextInt();
		scnr.nextLine();
		
		 if (confidence<0 || confidence>100) {
		System.out.println("Error. Enter a number 0-100. ");
			}
			
		 //calculating results
		}
		System.out.println("Calculating results...");
		//calculating certainty
		int uncertainty=(100-confidence);
		int adjust= uncertainty/2;
		boolean increase = random.nextBoolean();
		
		adjust= increase? adjust : -adjust;
		
	
		int finalHuman=Math.max(0,  Math.min(100,  (humanScore*100)/totalHuman+adjust));
		int finalRobot=Math.max(0,  Math.min(100,  (robotScore*100)/totalRobot+adjust));
		
		
		//final score
		if (humanScore>robotScore) {
		System.out.println("Congrats! You're " + finalHuman + "% human, and only " + finalRobot+ "% robot.");
		
		} else if (robotScore>humanScore) {
		System.out.println("Uh oh... You're " + finalRobot + "% robot, and only " + finalHuman+ "% human.");
		
		} else {
		System.out.println("Uncertainty level is high.. would you like to retake the quiz?");
		}
		
		//redo quiz
		System.out.print("To retake the quiz enter (Y/N).");
		String redo =scnr.nextLine().toLowerCase();
		
		if (redo.equals("y")) {
			continue;
		}else if (redo.equals("n"))
		{System.out.println("Thanks for playing! Have a good day.");
		break;
		} else {
		System.out.println("Please enter a valid input. (Y/N)");
		}
	}}
}

	
