/**
 * stringMainpulation_UI.java
 * Name: Chris Walker
 * Date: March 8, 2022
 *
 *     Purpose: create a blueprint for student information
 *     
 *     functions:
 *		StudentRecord(): initializes information given through a line in a txt file then splits that information and assigns it to variables
 *		default is unkown, unkown, unkown, 0, 0, 0, 0, 0
 *
 *	 	calcAver(): adds all the marks and divides by 4 to get the total mark average
 *
 *		Setters(): sets new data to variables 
 *		Getters(): gets requested variables
 *		toString(): returns data all in one line with a ", " between each returned variable(will be added to a file)
 *		
 *
 * */

package assignment4;

import java.io.Serializable;

public class StudentRecord implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	// variables
	private String firstName, lastName, address;
	private int grade, mathMark, engMark, sciMark, compMark;
	
	// default constructor
	public StudentRecord(){
		this("unkown, unkown, unkown, 0, 0, 0, 0, 0");
	}
	
	// constructor
	// brings in a string
	public StudentRecord(String input) {
		
		// splits the string into an array
		String inputArray[] = input.split(", ");
		
		// takes the array values and assigns them to variables
		this.firstName = inputArray[0].trim();
		this.lastName = inputArray[1].trim();
		this.address = inputArray[2].trim();
		this.grade = Integer.parseInt(inputArray[3].trim());
		this.mathMark = Integer.parseInt(inputArray[4].trim());
		this.engMark = Integer.parseInt(inputArray[5].trim());
		this.sciMark = Integer.parseInt(inputArray[6].trim());
		this.compMark = Integer.parseInt(inputArray[7].trim());		
	}
	
	// calculates average to two decimal places
	public double calcAver() {
		//adds all marks up then divides by 4
		return (double)(mathMark + engMark + sciMark + compMark)/4;
	}
	
	//takes in a full name and then sets firstName and lastName to the respective variables
	// ex. name = jim long 
	// firstName = jim 
	// lastName = long
	public void setName(String name) {
		String[] names = name.split(" ");
		this.firstName = names[0];
		this.lastName = names[1];
	}
	
	// sets grade
	public void setGrade(int mark) {
		this.grade = mark;
	}
	
	// sets mathMark
	public void setMathMark(int mark) {
		this.mathMark = mark;
	}
	
	// sets sciMark
	public void setSciMark(int mark) {
		this.sciMark = mark;
	}
	
	// sets engMark
	public void setEngMark(int mark) {
		this.engMark = mark;
	}
	
	// sets compMark
	public void setCompMark(int mark) {
		this.compMark = mark;
	}
	
	//returns grade
	public int getGrade() {
		return grade;
	}
	
	// returns mathMark
	public int getMathMark() {
		return mathMark;
	}
	
	// returns sciMark
	public int getSciMark() {
		return sciMark;
	}
	
	// returns engMark
	public int getEngMark() {
		return engMark;
	}
	
	// returns compMark
	public int getCompMark() {
		return compMark;
	}
	
	// returns a line of informations to be thrown in a file
	// ex. jim, jeff, 123 Address St., 5, 70, 50, 80, 60 
	public String toString() {
		return firstName + ", " + lastName + ", " + address + ", " + grade + ", " +mathMark + ", "+sciMark+ ", " + engMark + ", " + compMark;
	}
}
