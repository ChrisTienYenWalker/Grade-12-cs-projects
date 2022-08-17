/**
 * stringMainpulation_UI.java
 * Name: Chris Walker
 * Date: March 8, 2022
 *
 *     Purpose: store student data inside of files in object and string form
 *     
 *     functions: 
 *     StudentIO(): constructor
 *     fileReadMethod(): sets array saveRecord to information in a file
 *     getStudentRecord(): returns the last created object in saveRecord
 *     setStudentRecord():creates a new object (StudentRecord) in array saveRecord
 *     setIncreaseCount(): increase variable counter by 1
 *     toString(): output all data from saveRecord
 *     writeFileMethod(): write saveRecord info into a file
 *     writeObjectMethod() write saveRecord info in object form into a file
 *     objectInputMethod(): read object file and assigns value to saveObjRecord array
 *     getCounter(): returns counter value
 *     getSaveObjRecord(): returns object in array saveObjRecord
 *     
 */

package assignment4;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class StudentIO {
	
	//making arrays and counter variable
	private StudentRecord[] saveRecord;
	private StudentRecord[] saveObjRecord;
	private int counter;
	
	
	//constructor method
	public StudentIO() {
		
		// a max of ten students in the system
		saveRecord = new StudentRecord[10];
		saveObjRecord = new StudentRecord[10];
		counter = 0;
	}
	
	
	// reads the file and sets the information into the array of saveRecord 
	public void fileReadMethod(File fileName) {
		try
		{
			
			// read files and assign values to line
			BufferedReader read = new BufferedReader(new FileReader(fileName));
			String line;
			
			//Reading the whole file and printing to console.
			while((line = read.readLine()) !=null) {
				// creating new objects located within array
				saveRecord[counter] = new StudentRecord(line);
				
				//counter increase by 1
				setIncreaseCount();
				}
			read.close(); //Closing the input stream.
			
		} catch(FileNotFoundException e)	{
			//Error when opening a file has failed.
			System.out.println("Error: Cannot open file for reading.");
			
		} 	catch(EOFException e) {
			//Error if attempting to read more data than exists in the file.
			System.out.println("Error: EOF encountered, file may be corrupted.");
			
		} catch(IOException e) {
			//Error when i/o operation has failed to execute.
			System.out.println("Error: Cannot read from file.");
		}
	}

	// get the newest object created in the array saveRecord
	public StudentRecord getStudentRecord() {
		return saveRecord[counter];
	}

	//create a new studentRecord
	public void setStudentRecord() {
		saveRecord[counter] = new StudentRecord();		
	}
	
	// increase counter by 1
	public void setIncreaseCount() {
		counter++;
	}
	
	// output all information in the array SaveRecord
	public String toString() {
		String output = "";
		for(int i = 0; i < counter; i++ ) {
			output = output+saveRecord[i]+"\n";
		}
		return output;
	}

	// writes saveRecord array into a file called studentRecBackup.dat (txt version)
	public void writeFileMethod(File backFile) {
		File prFile = new File("studentRecBackup.dat");
		
		
		try{
			
			// if file doesn't exists, then create it
			if (!prFile.exists()) {
				prFile.createNewFile();
			}
			
			//set where it is writing to 
			PrintWriter out1 = new PrintWriter(new FileWriter(backFile)); 
                      
			//writes each object in array 
			for(int i = 0; i < counter; i++) {
				out1.println(saveRecord[i]);
			}
			
            out1.close(); 
            
            // error handling
        } catch (FileNotFoundException e) { 
            System.out.println("Error: Cannot open file for writing."); 
        } catch (IOException e) { 
            System.out.println("Error: Cannot write to file."); 
        } 		
	}

	// writes saveRecord array to studentInfo.dat (object verision)
	public void writeObjectMethod(File newFile) {		
		
		File pFile = new File("studentInfo.dat");
		
		try
		{
			if(!pFile.exists()) {
				pFile.createNewFile();
			}
			//Making output stream write objects to studentInfo.dat 
			ObjectOutputStream studentData = new ObjectOutputStream(new FileOutputStream(newFile));
		
			//Getting the saveRecord object written to studentInfo.dat.
			studentData.writeObject(saveRecord); 
			
			//Flush buffered data of object to file and then closing the output stream.
			studentData.flush();
			studentData.close();
			
		} catch(FileNotFoundException e) {
			//Error when opening a file has failed.
			System.out.println("Error: Cannot open file for writing.");
			
		} catch(IOException e) {
			//Error when i/o operation has failed to execute.
			System.out.println("Error: Cannot write to file");
			
		}
	}

	// reads file that contains information in object form then places that infomation into saveObjRecord array
	public void objectInputMethod(File newFile) {
		
		try
		{
			//Making input stream read objects from StudentData.
			ObjectInputStream inFromStudentData = new ObjectInputStream( new FileInputStream(newFile));
			
			//Reading the object's data from the file and printing it to the console. 
			saveObjRecord=(StudentRecord[])inFromStudentData.readObject(); 
			
			inFromStudentData.close(); //Closing the input stream.
			
		} catch(FileNotFoundException e) {
			//Error when opening a file has failed.
			System.out.println("Error: Cannot open file for reading.");
			
		} catch(EOFException e) {
			//Error if attempting to read more data than exists in the file.
			System.out.println("Error: EOF encountered, file may be corrupted.");
			
		} catch(IOException e) {
			//Error when i/o operation has failed to execute.
			System.out.println("Error: Cannot read from file.");
			
		} catch(ClassNotFoundException e) {
			//Error when the class of the serialized object cannot be found.
			System.out.println("Error: Class of serialized object cannot be found.");
		}
		
	}

	// gets the counter number
	public int getCounter() {
		return counter;
	}

	// returns the object in saveObjRecord array at int they enter
	public StudentRecord getSaveObjRecord(int c) {
		return saveObjRecord[c];
	}
}

