package javapractise;
import java.util.Scanner;
public class studentdetails {
	public void print(String name,String branch,int roll,String email) {
		System.out.println("Name:"+name+"\nBranch:"+branch+"\nroll:"+roll+"\nEmail:"+email);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,branch,email;
		int roll;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of the Student:");
		name =in.nextLine();
		System.out.println("Enter Branch:");
		branch=in.nextLine();
		System.out.println("Enter rollno:");
		roll =in.nextInt();
		System.out.println("Enter Email:");
		email=in.next();
		studentdetails obj=new studentdetails();
		obj.print(name, branch, roll, email);
	}

}
