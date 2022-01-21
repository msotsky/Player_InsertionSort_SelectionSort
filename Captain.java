public class Captain extends Player{

	private int years;

	public Captain(String name, int years){
		super(name);
		this.years = years;
	}

	public void setYears(int newYears){
		years = newYears;
	}

	public int getYears(){
		return years;
	}

	public double salary(int gamesWon){
		return super.salary(gamesWon) + 1000*years;
	}

	public String toString(){
		return super.toString() + " Teams played on: " + years;
	}
}