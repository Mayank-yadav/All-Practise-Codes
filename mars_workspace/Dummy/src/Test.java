import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Client implements Serializable{

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Client(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
}
 public
class Test{
	public static void main(String[] args) throws IOException {
		Client cl=new Client(1,"mayank");
		FileOutputStream fos=new FileOutputStream("student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(cl);
		oos.close();
		fos.close();
	}
	
	
}
