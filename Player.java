public class Player implements Comparable<Player>{

	private String name;
	private int jerseyNum;
	private static int jersey = 15;

	public Player(String name){
		this.name = name;
		jerseyNum = jersey;
		jersey++;
	}

	public String getName(){
		return name;
	}

	public int getJersey(){
		return jerseyNum;
	}

	public double salary(int gamesWon){
		return gamesWon * 1500;
	}
	//----------------------------------------
	public int compareTo(Player other){
		if(this.name.compareTo(other.name) != 0){
			return this.name.compareTo(other.name);
		}else{
			return this.jerseyNum - other.jerseyNum;
		}
	}
	//----------------------------------------
	
	public String toString(){
		return name + " " + jerseyNum;
	}

}