import java.awt.CardLayout;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	



	private static final long serialVersionUID = -3251167278807748062L;

	JPanel mainPanel;
	
	CardLayout cardLayout;
	
	Lists listis;
	public MainPanel() {
		mainPanel = new JPanel();
		
		cardLayout = new CardLayout();
		mainPanel.setLayout(cardLayout);
		listis = new Lists();
		mainPanel.add(listis, "listis");
		cardLayout.show(mainPanel, "listis");
		
		add(mainPanel);
	}
}
