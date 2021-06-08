import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

import javax.swing.JLabel;
public class ListsPanel extends JPanel implements ActionListener{


	private static final long serialVersionUID = -2768123984254904084L;
	JPanel listsPanel;
	JLabel testText;
	CardLayout listsCardLayout;
	ListsPanelMain listsPanelMain;
	JPanel editListsPanel;
	
	JButton temporaryEditListsButton;
	
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
		temporaryEditListsButton = new JButton("EditLists");
		editListsPanel.add(temporaryEditListsButton);
		temporaryEditListsButton.addActionListener( this);
		
		
		
		
		
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
	}
}
