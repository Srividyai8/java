package programs;

public class practise3 {
	public int palindrome(int n) {
		int r,reverse=0;
		while(n!=0) {
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
			
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java Program to check the number is Palindrome or not
		int n=1234321,result;
		practise3 obj = new practise3();
		result = obj.palindrome(n);
		if(result==n) {
			System.out.println(n + " is a palindrome");
		}
		else {
			System.out.println(n +" is not a palindrome");
		}
		
	}

}
