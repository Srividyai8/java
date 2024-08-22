package javapractise;

public class practise {
	public int  div(int x,int y) {
		return x/y;
	}
	public float div(float x,float y) {
		return x/y;
	}
	public double div(double x,double y) {
		return x/y;
	}

	public static void main(String[] args) {
		int x=9,y=3;
		float a=3.9f,b=2.2f;
		double c=56.82,d=9.10;
		
		practise obj =new practise();
		System.out.println(obj.div(x, y));
		System.out.println(obj.div(a,b));
		System.out.println(obj.div(c,d));

		

	}

}
