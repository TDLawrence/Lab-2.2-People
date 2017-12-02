package src;
import java.util.Random;

public class Runner {  
     private static Student[] students;
     
     private static Teacher teacher;
     
  
  
   
	public static void main(String[] args) {
		   Classroom classroom1 = new Classroom(students,teacher);
		   classroom1.printClass();
		   System.out.println(classroom1.classAverage());
	}
    public Student randomStudent(Student[]students)
    {Random gpa=new Random();
     Random osis=new Random();
     Random grade=new Random();
     double value=0;
     int level=0;
     int id=0;
     String lastName[]= {"Lawrence","DiPietro","Chen","Bosompem","Buan","Moore"};
     String firstName[]= {"Tyson","Ava","Keziah","Amy","Christopher","Mimi","Mariecia"};
     for (int counter=1;counter<=34;counter++)
      {value=gpa.nextInt(101); 	
       level=1+grade.nextInt(12);
       id=100000000+osis.nextInt(1000000);
      }
     Student studentx=new Student(5,firstName[new Random().nextInt(firstName.length)],
    		        lastName[new Random().nextInt(lastName.length)],140.0,value,id,level);
     return studentx;
    }
    public Teacher randomTeacher(Teacher teacher){
     String subject[]= {"Computer Science","Civil Engineering","Algebra","Public Speaking","Music","Art","Mathematics","Science","History","Nepali"};
     String title[]= {"Mr.","Mrs.","Dr.","Prof."};
     String lastName[]= {"Levin","Boulis","Brown","Forbes","Splane","Lett","Sanderson"};
     String firstName[]= {"Nathan","Michael","James","Bob","David","M. Stephen","Mark"};
    Teacher teacherx=new Teacher(5,firstName[new Random().nextInt(firstName.length)],
    		        lastName[new Random().nextInt(lastName.length)],140.0,subject[new Random().nextInt(subject.length)],title[new Random().nextInt(title.length)]);
     return teacherx;
    }
	

}
