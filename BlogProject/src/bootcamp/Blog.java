package bootcamp;

import java.util.TreeMap;


public class Blog {
	
	private TreeMap <String, Entry> entryMap;
	
	//constructor
	public Blog(){
		entryMap = new TreeMap <String, Entry>();
	}
	
	//setter
	public void setEntryMap(TreeMap<String, Entry> entryMap) {
		this.entryMap = entryMap;
	}
	
	//getter
	public TreeMap<String, Entry> getEntryMap() {
		return entryMap;
	}

	//add an entry to the blog
	public Entry addEntry(String date, Entry entry) {
		// Originally the date and time was set as key but as we are trying to simulate 
		// the project, setting an specific date time is easier to manipulate the map objects
		
		/*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date=new Date();
		return entryMap.put(dateFormat.format(date), entry);*/
		return entryMap.put(date, entry);
	}
	
	//delete an specific entry from the blog
	public Entry removeEntry(String key) {
		// TODO Auto-generated method stub
		return entryMap.remove(key);
	}

	//if the specific entry is in the map returns true
	public boolean containsEntry(Entry entry) {
		// TODO Auto-generated method stub
		return entryMap.containsValue(entry);
	}

	//the variable latTenPosts is a String of the latest posts added into the blog
	public String showLatest10Entrys() {
		String lastTenPosts= "";
		int i=0;
		for (String iterable_element : getEntryMap().descendingKeySet()) {
			if(i<10)
				lastTenPosts+= iterable_element.toString() + " "+(String)getEntryMap().get(iterable_element).getPost()+"\n";
			else
				break;
			i++;
		}
		return lastTenPosts;
	}

}
