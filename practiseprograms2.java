package programs;

public class practiseprograms2 {
	public int prime(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count+=1;
				}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Write a Java Program to find whether the number is Prime or not 
		int n=15,count;
		practiseprograms2 obj =new practiseprograms2();
		
		count =obj.prime(n);
		if(count==0) {
			System.out.println(n +" is a prime number");
		}
		else {
			System.out.println(n +" is not a prime number");
		}
		

	}

}
