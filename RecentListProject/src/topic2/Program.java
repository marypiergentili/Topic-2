package topic2;

import java.util.LinkedList;

public class Program {
	
	private LinkedList<File> fileList;
	
	public Program(){
		fileList = new LinkedList <File>();
	}

	public boolean isLinkedListEmpty() {
		// TODO Auto-generated method stub
		return fileList.isEmpty();
	}

	public boolean addFile(File file) {
		// TODO Auto-generated method stub
		if (fileList.contains(file)){
			moveToTheTop (file);
			return false;
		}
		else if (fileList.size()>=15){
			fileList.removeLast();
			return fileList.offerFirst(file);
		}
		else
			return fileList.offerFirst(file);
	}

	private void moveToTheTop(File file) {
		// TODO Auto-generated method stub
		fileList.remove(file);
		fileList.addFirst(file);
	}

	public int getFileIndex(File file) {
		// TODO Auto-generated method stub
		return fileList.indexOf(file);
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return fileList.size();
	}

	public boolean containsFile(File file) {
		// TODO Auto-generated method stub
		return fileList.contains(file);
	}

	public LinkedList<File> getFileList() {
		// TODO Auto-generated method stub
		return fileList;
	}



}
