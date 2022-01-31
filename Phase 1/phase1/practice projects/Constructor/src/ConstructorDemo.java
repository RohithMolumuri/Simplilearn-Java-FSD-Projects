import java.util.Scanner;
class User //SubClass
{
	String userName,passWord;
	//Instance variables memory in object
	User(String a,String b)
		//a,b are Local variables memory in Method_frame
	{
		userName=a;
		passWord=b;
	}
//Constructor loading the data from Local to Instance Variables 
	void getUser()
	{
		System.out.println("====UserDetails====");
		System.out.println("UserName:"+userName);
        System.out.println("PassWord:"+passWord);
	}
}
class ConstructorDemo //MainClass 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the UserName:");
		String uN = s.nextLine();
        System.out.println("Enter the PassWord:");
		String pW = s.nextLine();
           //uN and pW are Local variables
		User u = new User(uN,pW);//Constructor_call
        u.getUser();
	}
}
