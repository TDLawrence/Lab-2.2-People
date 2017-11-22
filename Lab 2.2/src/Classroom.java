package src;
public class Classroom {
private Student[]students;
private Teacher teacher;

public Classroom(Student[] students, Teacher teacher, String subject)
{
	this.students = students;
	this.teacher = teacher;
	
}

public String getSubject() {
	return this.teacher.getSubject();
}

public double classAverage()
{
	double sum = 0;
	for (int n = 0; n <= students.length; n++) {
		sum = sum + students[n].getGpa();
	}
	return sum / students.length;
}

}
