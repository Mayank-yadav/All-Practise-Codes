class Library{
	int lib_id;
	String lib_address;
	Student student;
	//Books b;
	public Library( int lib_id,String lib_address,Student student){
		this.lib_id=lib_id;
		this.lib_address=lib_address;
		this.student=student;
		//b=new Books();
	}
	void display(){
		System.out.println("Library id is:"+lib_id);
		//System.out.println("Library address is:"+lib_address);
		//System.out.println("Student id is:"+student.id);
		System.out.println("Student name is:"+student.name);
		System.out.println("Student address is:"+student.address);

}
	public static void main(String... args){
		Student s1=new Student(101,"mayank","xyz");
		Student s2=new Student(201,"ram","abc");
	
		Library l1=new Library(001,"lib1",s1);
		Library l2=new Library(002,"lib2",s2);
		
		l1.display();
		l2.display();
		
		
		
	}
		
}