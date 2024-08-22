package javapractise;
class people{
	public void print() {
		System.out.println("people are talking ");
	}
}
class girls extends people{
	public void print(){
		System.out.println("Girls are sleeping ");
	}
}
public class over_riding {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		girls obj= new girls();
		obj.print();
	}

}
