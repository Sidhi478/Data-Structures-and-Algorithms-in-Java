package mypackage;

import java.util.Objects;

public class Student implements Comparable<Student> {
	String name;
	int Rollno;
    public Student(String name,int Rollno) {
    	this.name=name;
    	this.Rollno=Rollno;
    	
    }
	@Override
	public String toString() {
		return "Student [name=" + name + ", Rollno=" + Rollno + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Rollno == other.Rollno;
	}
	@Override
	public int compareTo(Student that) { // alt + shift + s press v then methods generate compare to// TODO Auto-generated method stub
		return this.Rollno-that.Rollno;
		// if name wise sort than it is a string method 
		// we need to write like this 
		// return this.name.compareTo(that.name);
		
	}
	
	
	
	
	

}
