import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.JOptionPane;

public class MainFrame extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1557925482997380514L;
	JFrame mainFrame;
	JMenuBar mainMenuBar;
	JMenu tools;
	JMenu editMenu;
	JMenuItem lists;
	JMenuItem editLists;
	MainPanel mainPanel1;
	
	public MainFrame() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Randomize It!");
		
		
		//create MenuBar
		mainMenuBar = new JMenuBar();
		tools = new JMenu("Tools");
		lists = new JMenuItem("Lists");
		
		editMenu = new JMenu("edit");
		editLists = new JMenuItem("edit lists");
		
		mainFrame.setJMenuBar(mainMenuBar);
		mainMenuBar.add(tools);
		mainMenuBar.add(editMenu);
		
		
		tools.add(lists);
		lists.addActionListener(this);
		
		editMenu.add(editLists);
		editLists.addActionListener(this);
		
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
		
		if (e.getSource() == editLists) {
			// write action
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "MenuItem \"editLists was\" clicked!");
		
		}
	}
	
	
}
