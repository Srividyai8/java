package javapractise;
import java.util.Scanner;
public class multiplepara {
	public int sum(int a,int b,int c) {
		return a+b+c;
	}
	public int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int x,y,z,a,b,c,d;
		System.out.println("enter 3 numbers to get the sum");
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		multiplepara obj =new multiplepara();
		System.out.println(obj.sum(x, y, z));
		System.out.println("enter 4 numbers to get the sum");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		d=in.nextInt();
		System.out.println(obj.sum(a,b,c,d));
		

	}

}
