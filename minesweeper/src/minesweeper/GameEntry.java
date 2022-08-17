package minesweeper;

public class GameEntry {

	String name, level;
	int score;
	public GameEntry() {
		this("Unkown, 0 , N/A");
	}
	
	public GameEntry(String input) {
		String[] inputArray = input.split(", ");
		name = inputArray[0];
		score = Integer.parseInt(inputArray[1]);
		level = inputArray[2];
	}
	public boolean equals(GameEntry x) {
		if(this.getClass() != x.getClass()) {
			return false;
		}
		return this.getName().equals(x.getName()) && this.getLevel().equals(x.getLevel());
	}

	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public String getLevel() {
		return level;
	}
	public void setName(String input) {
		name = input;
	}
	public void setLevel(String input) {
			level = input;
	}
	public void setScore(int input) {
		score = input;
	}
	
	public String toString() {
		return name + ", " + score + ", " + level;
	}
}
