import java.util.Scanner;

public class Hello406{

	public static void main(String[] args)
	{
	System.out.println("What is your name?");
	Scanner receiveInput = new Scanner(System.in);
	String myName = receiveInput.next();
	System.out.println(myName);
	}
}
