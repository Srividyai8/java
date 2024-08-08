package programs;

public class javaprogram {
	public int addition(int x,int y) {
		int result =x+y;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		int y=5;
		javaprogram myObj = new javaprogram();
		int ret = myObj.addition(x,y);
		System.out.println(ret);
	}

}
