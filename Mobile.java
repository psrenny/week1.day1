package week1.day1;

public class Mobile {
	
	public String sendMsg()
	{
		String STR = "Hope you are doing good";
		return STR;
	}
	
	public void makeCall(int Number)
	{
		System.out.println("Calling this number "+Number+" from my mobile");
	}
	
	public void saveContact()
	{
		String Name = "David";
		int Num = 12123123;
		char Type = 'M';
		System.out.println("I have saved contact Name "+Name+" and Number "+Num+" of type "+Type);
	}

	public static void main(String[] args) {
		Mobile Obj = new Mobile();
		System.out.println(Obj.sendMsg());
		Obj.makeCall(23235233);
		Obj.saveContact();

	}

}
