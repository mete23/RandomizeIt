import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test {
	
	
	/*
	public static void main(String args[]) throws IOException {
		
		for (int i = 0; i<10;i++) {
			System.out.println(random.randomInt(2,4));
		}
		Data team = new Data();
		team.addName("bim");
		team.addName("hallo");
		System.out.println(team.randomItem());
		
		team.setFolder("Daten");
		team.setFile("Daten/namen.txt");
		//team.createFile();
		team.saveNames();
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, team.getSize());
		team.removeNameAt(0);
		team.removeNameAt(0);
		team.loadNames();
		
		JOptionPane.showMessageDialog(frame, team.randomItem());
		
	}
	*/
	
	public static void setup() throws IOException {
		
		Data team = new Data();
		team.addName("bim");
		team.addName("hallo");
		System.out.println(team.randomItem());
		
		team.setFolder("Daten");
		team.setFile("Daten/namen.txt");
		//team.createFile();
		team.saveNames();
		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, team.getSize());
		team.removeNameAt(0);
		team.removeNameAt(0);
		team.loadNames();
		
		JOptionPane.showMessageDialog(frame, team.randomItem());
		
		
	}

}
