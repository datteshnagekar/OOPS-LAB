package POJO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main method
		serializaStudent();
		deserializaStudent();
		
		
	}
	
	
	private static void deserializaStudent(){
		
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		
		try {
			fin = new FileInputStream(new File("serilizability_deserilizability.txt"));
			oin = new ObjectInputStream(fin);
			Student s = (Student) oin.readObject();
			System.out.println("--->" + s.getName() + "Subject specilization=" + s.getClass());
			
			
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try{
			fin.close();
			oin.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	
}
	
	
	
	
	
	
	
	
	private static void serializaStudent(){
		
			FileOutputStream fout = null;
			ObjectOutputStream oout = null;
			
			try {
				fout = new FileOutputStream(new File("serilizability_deserilizability.txt"));
				oout = new ObjectOutputStream(fout);
				Student s = new Student(1711, "gayatri gad", "love school");
				oout.writeObject(s);
				
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				fout.close();
				oout.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
		
	}

}
