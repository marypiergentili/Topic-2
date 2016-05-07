package topic2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecentListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//opening the program
		Program program = new Program();
		File file1= new File("Archivo");
		program.addFile(file1);
		File file2= new File("Archivo 2");
		program.addFile(file2);
		program.addFile(file1);
		//showing the recent file list
		if(program.isLinkedListEmpty()==true)
			System.out.println("There are no recent files opened");
		else
			System.out.println(program.getFileList());
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
	}

}
