package bootcamp;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JUnitBlogTest {

	private Blog blogTest;
	private Entry entryTest;

	@Before
	public void setUp() throws Exception {
		//setting all the objects we need during all tests
		blogTest = new Blog();
		entryTest = new Entry("FirstPost");
		blogTest.addEntry("2016/05/06 20:30:44",entryTest);
	}

	@Test
	public void PostANewBlogEntryWhithDateTimeAsKey() {
		//tests if the entry is add with an specific date time
		//the blogTest.addEntry returns null if there is not an object with the same key
		assertTrue(blogTest.containsEntry(entryTest));
		
	}
	
	@Test
	public void DeleteAnSpecificBlogEntry(){
		//tests if the object deleted is the same as we set on the key
		String date= "2016/05/06 20:30:44";
		assertEquals(entryTest, blogTest.removeEntry(date));
	}
	
	@Test
	public void ShowTheMostRecentTenPosts(){
		
		
	}

}
