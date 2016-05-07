package topic2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RecentListTest {
	
	Program programTest;
	File fileTest;
		
	@Before
	public void setUp() throws Exception{
		programTest= new Program();
		fileTest = new File("Archivo");
	}

	@Test
	public void WhenTheProgramIsOpenedForTheFirstTimeTheListIsEmpty() {
		
		//tests if the program is created the recent file list is empty
		assertEquals(true, programTest.isLinkedListEmpty());
		
	}
	
	@Test
	public void WhenANewFileIsOpenedAddToTheRecentList(){
		//tests if the new file opened is add to the recent list
		assertTrue(programTest.addFile(fileTest));
	}
	
	@Test
	public void IfTheFileOpenedIsInTheListDoNotDuplicate(){
		//tests if the new file opened is add to the recent list
		programTest.addFile(fileTest);
		assertFalse(programTest.addFile(fileTest));
	}
	
	@Test
	public void IfTheFileIsDuplicatedMoveToTheTop(){
		//tests if the file is in the list is moved to the top
		programTest.addFile(fileTest);
		File fileTest2 =new File ("Archivo 2");
		programTest.addFile(fileTest2);
		programTest.addFile(fileTest);
		assertEquals(0, programTest.getFileIndex(fileTest));
	}
	
	@Test
	public void TheFileListDoesNotOverfills15Items(){
		//fist we add 16 different Files to the list
		File[] fileArray = new File[16];
		for (int i=0; i<fileArray.length; i++){
			fileArray[i]= new File((String)"Archivo "+i);
			programTest.addFile(fileArray[i]);
		}
		//we check that the list is not bigger than 15 items
		assertEquals(15, programTest.getSize());
	}
	
	@Test
	public void WhenTheListIsFullItRemovesTheLastAndAddTheNew(){
		//fist we add 16 different Files to the list
		File[] fileArray = new File[16];
		for (int i=0; i<fileArray.length; i++){
			fileArray[i]= new File((String)"Archivo "+i);
			programTest.addFile(fileArray[i]);
		}
		//we check that the last element added is the first
		assertEquals(0, programTest.getFileIndex(fileArray[15]));
		//we check that the first File is not on the list
		assertFalse(programTest.containsFile(fileArray[0]));
	}
	
	
	
	

}
