package javapractise;
import java.util.Scanner;
public class simpleinterest {
	public float si(int p,int r,int t) {
		return (p*t*r)/100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p;
		int t;
		int r;
		System.out.println("enter principle amount:");
		p=sc.nextInt();
		System.out.println("enter rate:");
		r=sc.nextInt();
		System.out.println("enter time period:");
		t=sc.nextInt();

		
		simpleinterest obj=new simpleinterest();
		System.out.println("Simple interest:"+obj.si(p,r,t));

	}

}
