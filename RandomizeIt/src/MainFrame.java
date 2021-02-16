import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame {
	
	JFrame mainFrame;
	JMenuBar mainMenuBar;
	JMenu tools;
	JMenuItem lists;
	
	MainPanel mainPanel;
	
	public MainFrame() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Randomize It!");
		
		
		//create MenuBar
		mainMenuBar = new JMenuBar();
		tools = new JMenu("Tools");
		lists = new JMenuItem("Lists");
		mainFrame.setJMenuBar(mainMenuBar);
		mainMenuBar.add(tools);
		tools.add(lists);
		
		
		//add the MainPanel
		mainPanel = new MainPanel();
		mainFrame.getContentPane().add(mainPanel);
		
		
		mainFrame.pack();
		
		mainFrame.setVisible(true);
			
		
	}
	
}
