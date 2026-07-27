package OOPS;

public class OOPS_java {
	public static void main(String args[]) {
		Pen p1=new Pen(); // created a pen object called p1;
		p1.setColor("blue");
		System.out.println(p1.getColor());
		p1.setTip(5);
		System.out.println(p1.getTip());
		
		BankAccount myAcc = new Bank();
		myAcc.username = "sidhika dangwal";
		myAcc.SetPassword= "acbdgr";
	}

}

class BankAccount{
	public String username;
	private String password;
	public void setPassword(String pwd) {
		password = pwd;
	}
}

class Pen{
	private String color;
	private int tip;
	
	String getColor() {
		return this.color; //getters
	}
	
	int getTip() {
		return this.tip; //getters
	}
	
	void setColor(String newColor) { //setters
		this.color=newColor;
	}
	
	void setTip(int tip) {
		this.tip=tip;  //setters
	}
}

class bank{
	String name;
	int marks;
	int age;
	
	void calcpercentage(int phy , int chem , int english) {
		percentage= (phy +chem+english)/3;
	}
}
 