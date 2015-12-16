class Test{
	
public static void main(String... args){
		Student s1=new Student(101,"mayank","xyz");
		Student s2=new Student(201,"ram","abc");
	
		Library l1=new Library(001,"lib1",s1);
		Library l2=new Library(002,"lib2",s2);
		
		l1.display();
		l2.display();
		Books b=new Books();
		b.display();
}}