

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
class DeserializationTest
{
 public static void main(String[] args) throws IOException, ClassNotFoundException
 {
	 Client si=null;
	 
	 FileInputStream fis = new FileInputStream("student.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	   si = (Client)ois.readObject();
	   System.out.println(si.getName());
	   System.out. println(si.getId());
 }
}