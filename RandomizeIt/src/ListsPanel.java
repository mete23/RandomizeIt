import javax.swing.JPanel;

import java.awt.CardLayout;

import javax.swing.JLabel;
public class ListsPanel extends JPanel{


	private static final long serialVersionUID = -2768123984254904084L;
	JPanel listsPanel;
	JLabel testText;
	CardLayout listsCardLayout;
	ListsPanelMain listsPanelMain;
	public ListsPanel() {
		listsPanel = new JPanel();
		listsPanelMain = new ListsPanelMain();
		this.listsCardLayout = new CardLayout();
		listsPanel.setLayout(this.listsCardLayout);
		listsPanel.add(listsPanelMain, "listsPanelMain");
		
		this.listsCardLayout.show(listsPanel, "listsPanelMain");
		
		
		add(listsPanel);
	}
}
