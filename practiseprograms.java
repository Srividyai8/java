package programs;

public class practiseprograms {
	public void swap(int a,int b) {
		int c=a;
			a=b;
			b=c;
			System.out.println("the numbers after swaping:");
			System.out.println(a);
			System.out.println(b);	
	}
	public void swap1(int x,int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("the numbers after swaping without third variable:");
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Write a program to swap two numbers in Java with and without using third variable.
		
		int c=98,d=36;
		System.out.println("the numbers before swaping:");
		System.out.println(c);
		System.out.println(d);	
		practiseprograms obj =new practiseprograms();
		obj.swap(c,d);
		obj.swap1(c, d);
		
		
	}

}
