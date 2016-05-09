package bootcamp;

public class BlogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blog blogMain = new Blog();
		
		
		//adding 15 elements to the blog (I use an specific time to be able to delete any 
		//element using the specific key)
		for(int i=10; i<25; i++ )
			blogMain.addEntry((String)"2016/05/06 20:31:"+i, new Entry((String)"Post "+i));
		
		//showing on the screen  the last 10 elements added
		System.out.println(blogMain.showLatest10Entrys());
		
		//deleting an specific post (showing on screen which element was removed)
		System.out.println(blogMain.removeEntry("2016/05/06 20:31:15").getPost()+
				" was eliminated from the Blog");
	}

}
