package OOPS;

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Horse h= new Horse();
		 h.eat();
		 h.Walk();
		 h.changecolor();
		 Chicken c = new Chicken();
		 c.eat();
		 c.Walk();
		 // we cannot make objects for abstract classes 

	}

}
 abstract class Animal{ //non abstract method 
	 String color;
	 
	 Animal(){ // it initializes its child class variables 
		 color="brown";
		 
	 }
	 void eat() {
		 System.out.println("animal eats");
	 }
	 
	 abstract void Walk(); //abstract method we have not written implementation here so in subclasses we need to write implementation
	// in abstract mehtod here in animals only the idea of implementation is given in form of function for each and every animal  no implementation given	
}

 class Horse extends Animal{
	 void changecolor() {
		 color = "dark brown";
	 }
	 void Walk() {
		 System.out.println("walks on 4 legs");  // implementation written
	 }
	 
 }
 class Chicken extends Animal{
	 void changecolor() {
		 color="yellow";
	 }
	 void Walk() {
		 System.out.println("walks on 2 legs");
	 }
 }
 
