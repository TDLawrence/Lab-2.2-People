package src;

public class Runner {
     private static String[] firstNames;
    
     private static String[] familyNames;
     
     private static Student[] students;
     
     private static Teacher teacher;
     
     private static String subject;
     
     Teacher teacher1 = new Teacher(8, "Joe", "Doe", 200.0, "math", "Mr.");
     Student student1 = new Student(5, "Ava", "DiPietro", 140.0 , 99.5 , 208203240, 12);
  
     
   
	public static void main(String[] args) {
		 firstNames=new String[5];
		 familyNames=new String [5];
		 firstNames[0]="Tyson";
		 familyNames[0]="Lawrence";
		 firstNames[1]="Ava";
		 familyNames[1]="DiPietro";
		 firstNames[2]="Nathan";
		 familyNames[2]="Levin";
		 firstNames[3]="Joe";
		 familyNames[3]="Doe";
		 firstNames[4]="Amy";
		 familyNames[4]="Chen";
		 
		   Classroom classroom1 = new Classroom(students,teacher,subject);
		   classroom1.printClass();
		   classroom1.classAverage();

		//Classroom.printClass();
		//Classroom.classAverage();
		 
	}
    public Student randomStudent()
    {
    	
    }
	

}
