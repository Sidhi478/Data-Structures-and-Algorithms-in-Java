package OOPS;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queen q = new Queen();
		q.moves();
		

	}

}
interface Herbivore{ //using multiple inheritance
	
}

interface Carnivore{
	
}
class Bear implements Herbivore,Carnivore{
	
}
interface ChessPlayer {
	void moves();
}

class Queen implements ChessPlayer{
	public void moves() {
		System.out.println("up,down,left,right,diagonal(in all directions)");
		
		}
}
class Rook implements ChessPlayer{
	public void moves() {
		System.out.println("up,down,right,left");
	}
}