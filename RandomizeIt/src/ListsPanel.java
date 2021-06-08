import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
public class ListsPanel extends JPanel implements ActionListener{


	private static final long serialVersionUID = -2768123984254904084L;
	JPanel listsPanel;
	JLabel testText;
	CardLayout listsCardLayout;
	ListsPanelMain listsPanelMain;
	JPanel editListsPanel;
	
	JButton temporaryEditListsButton;
	
	JButton clearListButton;
	JButton loadNamesListButton;
	JButton saveNamesListButton;
	
	GridLayout gridLayout1 = new GridLayout(2, 3, 6, 10);
	public ListsPanel() {
		listsPanel = new JPanel();
		listsPanelMain = new ListsPanelMain();
		this.listsCardLayout = new CardLayout();
		
		editListsPanel = new JPanel();
		
		
		listsPanel.setLayout(this.listsCardLayout);
		listsPanel.add(listsPanelMain, "listsPanelMain");
		listsPanel.add(editListsPanel, "editListsPanel");
		
		this.listsCardLayout.show(listsPanel, "listsPanelMain");
		
		
		add(listsPanel);
		
		
		
		
		//editListsPanel:
		editListsPanel.setLayout(this.gridLayout1);
		temporaryEditListsButton = new JButton("EditLists");
		editListsPanel.add(temporaryEditListsButton);
		temporaryEditListsButton.addActionListener(this);
		
		clearListButton = new JButton("clear List");
		saveNamesListButton = new JButton("save Names");
		loadNamesListButton = new JButton("load Names");
		
		editListsPanel.add(clearListButton);
		editListsPanel.add(saveNamesListButton);
		editListsPanel.add(loadNamesListButton);
		
		clearListButton.addActionListener(this);
		saveNamesListButton.addActionListener(this);
		loadNamesListButton.addActionListener(this);
		
		
	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == temporaryEditListsButton) { 
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "MenuItem \"editLists was\" clicked!");
			int amountOfNames = Integer.parseInt(JOptionPane.showInputDialog("Wie viele Namen möchten Sie hinzufügen?"));
			for (int i = 1; i<= amountOfNames; i++){
				String nameForAdding = JOptionPane.showInputDialog("Gib den " + i + ". Namen ein!");
				ListsPanelMain.list1.addName(nameForAdding);
			}
		}
		if (e.getSource() == saveNamesListButton) {
			// Action to perform if saveNamesListButton was pressed

			try {
				ListsPanelMain.list1.saveNames();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

		if (e.getSource() == loadNamesListButton) {
			// Action to perform if loadNamesListButton was pressed

			try {
				ListsPanelMain.list1.loadNames();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == clearListButton) {
			// Action to perform if clearListButton was clicked
			int sizeOfList = ListsPanelMain.list1.getSize();
			for (int i = 0; i < sizeOfList; i++) {
				ListsPanelMain.list1.removeNameAt(0);

			}
			System.out.println("List was cleared");
		}

		
	}
}
