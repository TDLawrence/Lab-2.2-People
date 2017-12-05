package src;
public class Classroom {
private Student[] students;
private Teacher teacher;

public Classroom(Student[] students, Teacher teacher)
{
	this.students = students;
	this.teacher = teacher;
	Runner b=new Runner();
	this.teacher=b.randomTeacher(teacher);
	this.students=new Student[34];
	this.students[0]=b.randomStudent(students);
	this.students[1]=b.randomStudent(students);
	this.students[2]=b.randomStudent(students);  
	this.students[3]=b.randomStudent(students);
	this.students[4]=b.randomStudent(students);
	this.students[5]=b.randomStudent(students);
	this.students[6]=b.randomStudent(students);
	this.students[7]=b.randomStudent(students);
	this.students[8]=b.randomStudent(students);
	this.students[9]=b.randomStudent(students);
	this.students[10]=b.randomStudent(students);
	this.students[11]=b.randomStudent(students);
	this.students[12]=b.randomStudent(students);
	this.students[13]=b.randomStudent(students);
	this.students[14]=b.randomStudent(students);
	this.students[15]=b.randomStudent(students);
	this.students[16]=b.randomStudent(students);
	this.students[17]=b.randomStudent(students);
	this.students[18]=b.randomStudent(students);
	this.students[19]=b.randomStudent(students);
	this.students[20]=b.randomStudent(students);
	this.students[21]=b.randomStudent(students);
	this.students[22]=b.randomStudent(students);
	this.students[23]=b.randomStudent(students);
	this.students[24]=b.randomStudent(students);
	this.students[25]=b.randomStudent(students);
	this.students[26]=b.randomStudent(students);
	this.students[27]=b.randomStudent(students);
	this.students[28]=b.randomStudent(students);
	this.students[29]=b.randomStudent(students);
	this.students[30]=b.randomStudent(students);
	this.students[31]=b.randomStudent(students);
	this.students[32]=b.randomStudent(students);
	this.students[33]=b.randomStudent(students);
}

public String getSubject() {
	if(this.teacher!=null)
	{return this.teacher.getSubject();}
	else
	{return "Unknown";}
}

public double classAverage()
{
	double sum = 0;
	if (students!=null) {
		for (int n = 0; n < students.length; n++) {
			if (students[n]!=null) {
				sum = sum + students[n].getGpa();
			}
		}
		return sum / students.length;
	}
    return sum;
}
public void printClass()
{
String x=this.teacher+", "+ getSubject();
System.out.println(x);
{for(int n=0;n<students.length;n++)
 {
	System.out.println(students[n]);
 }
}
}

	public String[] sortStudents() {
		
	}
}


