package src;
public abstract class Person {
String firstName;
String familyName;
double weight;
int height;

public Person(int height,String firstName,String familyName,double weight)
{this.height=height;
 this.weight=weight;
 this.firstName=firstName;
 this.familyName=familyName;
}

public String getFirstName() {
	if(firstName!=null)
	{return firstName;}
	else
	{return "Not a person";}
}

public String getFamilyName() {
	if(familyName!=null)
	{return familyName;}
	else
	{return "Not a person";}
}

public double getWeight() {
	return weight;
}

public double getHeight() {
	return height;
}

public abstract String toString();
}
