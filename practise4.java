package programs;

public class practise4 {
	public int fact(int a){
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Write a Java Program to find the factorial of a given number 
		int a=5,factorial;
		practise4 obj=new practise4();
		factorial=obj.fact(a);
		System.out.println(factorial);
		int f=12;
		System.out.println(Math.sqrt(f));
		String c ="srividya";
		System.out.println(c.toUpperCase());
		String d="AKHILA";
		System.out.println(d.toLowerCase());
		String e="srividya";
		System.out.println(e.length()); 

}
}
