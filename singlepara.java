package javapractise;

public class singlepara {
	public String  name(String x) {
			System.out.println(x);
			return x;
		}
	public String  name(String x,String dept) {
		System.out.println("Name: "+x+"\ndepartment:"+dept );
		return x + dept;
	}
		public static void main(String[] args) {
			
			singlepara obj =new singlepara();
			obj.name("srividya");
			obj.name("srividya","CSE");
			System.out.println(obj.name("srividya") );
			System.out.println(obj.name("srividya","cse") );
	}

}
