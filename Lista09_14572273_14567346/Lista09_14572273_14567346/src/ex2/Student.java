package ex2;

public class Student {
	private String name;
	private int rollNo;

	Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	public boolean equals(Object s) {
		return ((Student)s).name.equals(this.name) && ((Student)s).rollNo == this.rollNo;
	}
	
	@Override
	public String toString() {
		return "Student: " + name + " ID: " + rollNo;
	}
	
}
