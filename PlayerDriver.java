
public class PlayerDriver{

	public static void main(String[] args){

		Player p1 = new Player("John");
		Player p2 = new Captain("Sarah", 3);
		Captain c1 = new Captain("Jane", 5);
		Player c2 = new Captain("John", 2);

		Player[] team = {p2, c2, c1, p1};
		
		for(Player temp : team){
			System.out.println(temp);
		}

		//-----------------------------------
		Sorter<Player> sort = new Sorter<>();
		//sort.selectionSort(team);
		sort.insertionSort(team);

		System.out.println("\nSORTED: ");

		for(Player x : team){
			System.out.println(x);
		}
		//-----------------------------------
		
	}
}