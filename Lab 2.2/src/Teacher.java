package src;

public class Teacher extends Person {
	private String subject;
	private String title;//Mr.,Ms.,Mx.,Mrs.
	
	public Teacher(int height,String firstName,String familyName,double weight,String subject, String title)
	{super(height, firstName, familyName, weight);
	 this.subject=subject;
	 this.title=title;	
	}

	public String getSubject() {
		if (subject!=null)
		{return subject;}
		else
		{return "Unknown";}
	}

	public String getTitle() {
		return title;
	}
	public String toString() {
		return title + " " + familyName;	
	}
}
