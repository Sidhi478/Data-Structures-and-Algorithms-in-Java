package OOPS;

public class Getterssetters_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank s1 = new bank("Sidhika");
		bank s2= new bank();
		bank s3 = new bank(34);
		
		bank p1= new bank("dangwal");
		

	}
	

}

class bank {
	String name;
	int roll;
	
	bank(String name){//constructors 
		this.name=name;	
	}
	bank(){
		System.out.println("constructor is called.."); // constructor
	}
	bank(int roll){
		this.roll=roll; // constructor
	}
}

class bank{
	String names;
	int age;
	
	bank(){
		System.out.println("contructor is called");
	}
}
