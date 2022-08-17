package minesweeper;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DisplayScore {
	ArrayList<GameEntry> gameData;
	
	public DisplayScore() {
		 gameData = new ArrayList<GameEntry>();
	}
	
	public void fileReadMethod(File fileName) {
		try
		{
			
			// read files and assign values to line
			BufferedReader read = new BufferedReader(new FileReader(fileName));
			String line;
			
			//Reading the whole file and printing to console.
			while((line = read.readLine()) !=null) {
				// creating new objects located within array
				gameData.add(new GameEntry(line));
				
				}
			scoreRanking();
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
	


	public void list() {
		
	    Iterator<GameEntry> currentData = gameData.iterator();

		while(currentData.hasNext()) {
			  System.out.println(currentData.next());
			}
		
	}
	
	public void scoreRanking() {
		for(int i = 0; i < gameData.size() - 1; i++ ) {
			int a = i;
			for(int j = i + 1; j < gameData.size(); j++ ) {
				if(gameData.get(a).score > gameData.get(j).score) {
					a = j;
				}
			}
			GameEntry b = gameData.get(i);
			gameData.set(i, gameData.get(a));
			gameData.set(a, b);
		}
	}

	public void newPlayer(String string, int score, String string2) {
		scoreRanking();
		for(int i = 0; i < gameData.size() - 1; i++){
			if(gameData.get(i).score > score) {
				gameData.add(i, new GameEntry(string+", " + score + ", "+ string2));
				break;
			}
		}
		
	}
	
	public void nameRanking() {
		for(int i = 0; i < gameData.size() -1; i++) {
			for(int j = 0; j < gameData.size() - 1 - i; j++) {
				int compare = gameData.get(j).name.compareToIgnoreCase(gameData.get(j + 1).name);
				if(compare > 0) {
					GameEntry a = gameData.get(j);
					gameData.set(j, gameData.get(j+1));
					gameData.set(j + 1, a);
				}
			
			}
		}
	}
	
	public void removePlayer() {
		GameEntry tempObj = new GameEntry("hi, 0, Expert");
		boolean a = gameData.get(0).equals(tempObj);
	}
	
	}
