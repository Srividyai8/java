package javapractise;
class sister{
	int bonus=18000;
}
class brother extends sister{
	int salary=25000+bonus;
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		brother obj=new brother();
		System.out.println("salary :"+obj.salary+"\nBonus:"+obj.bonus);

	}

}
