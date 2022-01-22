package week1.day1;

public class Student {
    
	String Name = "Renny";
	private int RollNo = 1881;
	
	public void College()
	{
		String ColName = "St.Joseph's Eng college";
		System.out.println("Student belong to College:"+ColName);
	}
	public static void main(String[] args) {
        Student Obj = new Student();
        System.out.println("Student Name is:"+Obj.Name);
        System.out.println("Student Roll Number is:"+Obj.RollNo);
        Obj.College();
	}

}
