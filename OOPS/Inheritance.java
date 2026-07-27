package OOPS;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fish Shark=new Fish();
		//Shark.eat();
		dog dobby = new dog();
		dobby.eat();
		dobby.legs = 4;
		System.out.println(dobby.legs);
	}
	

}

  
 class Animals{
	 String color;
	 void eat() {
		 System.out.println("eats");
		 
	 }
	 void breathe() {
		 System.out.println("breathe");
	 } 
 }
 
 class Mammels extends Animals{ //multilevel  inheritance 
	 int legs;
 }
 
 class dogs extends Mammels{
	 String breed;
 }
 class  bird extends Animals{
	 void fly() {
		 System.out.println("fly");
	 }
	 
 }
 // derived class
 //class Fish extends Animal{
	// int fins;
	// void swim() {
		/// System.out.println("swims in water");
	 //}
 //}