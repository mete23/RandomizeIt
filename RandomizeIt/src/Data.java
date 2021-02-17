import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Data {
	File folder;
	File file;
	
	String defaultFolder = "Data";
	
	private ArrayList<String> names = new ArrayList<String>();
	
	public void addName(String newName) {
		this.names.add(newName);
	}
	public void removeNameAt(int index) {
		this.names.remove(index);
	}
	public int getSize() {
		return this.names.size();
	}
	
	public boolean contains(String word) {
		return this.names.contains(word);
	}
	public String randomItem() {
		
		return this.names.get(random.randomInt(0, (this.getSize()-1)));
	}
	
	
	
	
	// Code for Storage stuff:
	public void setFolder(String tempfolder) {
		this.folder = new File(tempfolder);
		if (!this.folder.exists()) {
			this.folder.mkdirs();
		}
	}
	public void setFile(String tempfile) throws IOException {
		if(this.folder.exists()) {
			this.file = new File(tempfile);
			if(!this.file.exists()) {
				this.file.createNewFile();
			}
		}
	}
	

	
	
	

	
	public void saveNames() throws IOException {
		
		File localFile = this.file;
		if (localFile.exists()) {
			FileOutputStream stream = new FileOutputStream(localFile);
			
			if (this.names.size() > 0) {
				stream.write(this.names.get(0).getBytes());
				
				for (int i = 1; i < this.names.size(); i++) {
					
					String dataToStore = "\n" + this.names.get(i);
					stream.write(dataToStore.getBytes());
				}
			}
			
			stream.close();
		}
	}
	public void loadNames() throws FileNotFoundException {
		File localFile = this.file;
		
		if (localFile.exists()) {
			Scanner read = new Scanner(localFile);
			ArrayList<String> tempNames = new ArrayList<String>();
			while(read.hasNextLine()) {
				tempNames.add(read.next());
			}
			
			read.close();
			this.names = tempNames;
			
		}
	}
	
	
	Data(){
		setFolder(defaultFolder);
	}
	
}
