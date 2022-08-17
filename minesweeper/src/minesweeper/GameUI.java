package minesweeper;
import java.io.File;
import java.util.Scanner;
public class GameUI {
	public static void main(String args[]) {
		DisplayScore infoDisplayScore = new DisplayScore();
		Boolean stillPlaying = true;
		
		Scanner input= new Scanner(System.in);

//		System.out.print("What file would you like to read: ");
//		String fileInput = input.nextLine();
//		if(fileInput != "MineSweeperScores.txt") {
//			System.out.println("Couldn't fine the file. Using mineSweeperScore.txt");
//			fileInput = "MineSweeperScores.txt";
//		}
		
		File currFile = new File("MineSweeperScores.txt");
		infoDisplayScore.fileReadMethod(currFile);
		
//		do {
//			System.out.println("Enter a number: \n 1: names Ranking, 2: score Ranking, 3: top scores, 4: add score, 5: delete score, 9: delete");
//			int choice = input.nextInt();
//			switch(choice){
//			case 1:
//				infoDisplayScore.nameRanking();
//				infoDisplayScore.list();
//				break;
//			case 2:
//				infoDisplayScore.scoreRanking();
//				infoDisplayScore.list();
//				break;
//			case 3:
//				System.out.println(infoDisplayScore);
//				break;
//			case 4: 
//				infoDisplayScore.newPlayer("heff", 5, "Expert");
//				break;
//			case 5: 
//				infoDisplayScore.removePlayer("-X-", "Beginner");
//				break;
//			case 9:
//				stillPlaying = false;
//				break;
//			}
//				
//		}while(stillPlaying);
//		infoDisplayScore.nameRanking();
//		infoDisplayScore.newPlayer("heff", 5, "Expert");
		infoDisplayScore.list();
		System.out.println();
//		infoDisplayScore.removePlayer();
		infoDisplayScore.nameRanking();
		infoDisplayScore.list();
//		System.out.print(infoDisplayScore);;

		
//		infoDisplayScore.list();
//		do {
//			
//			stillPlaying = 9;
//		}while(stillPlaying != 9);
	}
}