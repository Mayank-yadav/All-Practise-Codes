
public class Test {
	

	public static void main(String[] args) {
		System.out.println("Inside main");
		Multiplication obj=new Multiplication();
		int result=obj.multiply(2, 3);
		System.out.println(result);
	}
}

class Multiplication {
	int multiply(int a,int b){
		System.out.println("Multiplication method");
		int result=a*b;
		return result;
		
	}
}