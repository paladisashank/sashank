
public class Student 
{
	int id;
	String name;
	int salary;
	
	Student(int i,String n,int sa)
	{
		id = i;
		name = n;
		salary = sa;
	}
	public void showInfo()
	{
		System.out.println(id+","+name+","+salary);
	}

public static void main(String[] args) 
	{
		Student s = new Student(585,"dsfsf",78668);
		Student s1 = new Student(63,"gdg",765463);
	
	s.showInfo();
	s1.showInfo();
		
	
		
	}		
	
}

