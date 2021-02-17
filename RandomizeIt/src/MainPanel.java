import java.awt.CardLayout;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	



	private static final long serialVersionUID = -3251167278807748062L;

	JPanel mainPanel;
	
	CardLayout cardLayout;
	
	ListsPanel listsPanel1;
	public MainPanel() {
		mainPanel = new JPanel();
		
		cardLayout = new CardLayout();
		mainPanel.setLayout(cardLayout);
		listsPanel1 = new ListsPanel();
		mainPanel.add(listsPanel1, "listsPanel1");
		cardLayout.show(mainPanel, "ListsPanel1");
		
		add(mainPanel);
	}
}
