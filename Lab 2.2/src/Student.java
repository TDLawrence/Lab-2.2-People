package src;

public class Student extends Person {
	private double gpa;
	private int osis;
	private int grade;
	
	public Student(int height,String firstName,String familyName,double weight,double gpa,int osis, int grade) {
		super(height, firstName, familyName, weight);
		this.gpa = gpa;
		this.osis = osis;
		this.grade = grade;
	}

	public double getGpa() {
		return gpa;
	}

	public int getOsis() {
		return osis;
	}

	public int getGrade() {
		return grade;
	}
	public String toString() {
		return familyName + ", " + firstName;
	}
}

