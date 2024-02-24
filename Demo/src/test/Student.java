package test;

import java.util.Comparator;

public class Student {

	private String name;
	private int rollNumber;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public static class RollNumberComparator implements Comparator<Student>
	{
		public int compare(Student student1,Student student2)
		{
			return Integer.compare(student1.getRollNumber(), student2.getRollNumber());
		}
	}

	

	
	

}
