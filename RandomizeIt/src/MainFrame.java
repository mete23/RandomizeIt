import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1557925482997380514L;
	JFrame mainFrame;
	JMenuBar mainMenuBar;
	JMenu tools;
	JMenuItem lists;
	
	MainPanel mainPanel1;
	
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
		lists.addActionListener(this);
		
		//add the MainPanel
		mainPanel1 = new MainPanel();
		mainFrame.getContentPane().add(mainPanel1);
		
		
		mainFrame.pack();
		
		mainFrame.setVisible(true);
			
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == lists) {
			mainPanel1.cardLayout.show(mainPanel1.mainPanel, "listsPanel1");
			System.out.println("show lists");
		}
	}
	
	
}
