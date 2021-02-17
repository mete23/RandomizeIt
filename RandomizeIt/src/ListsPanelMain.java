import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListsPanelMain extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7101308713798768031L;
	JPanel listsPanelMain;
	JButton randomButton;
	public ListsPanelMain() {
		listsPanelMain = new JPanel();
		randomButton = new JButton("random");
		randomButton.addActionListener(this);
		
		listsPanelMain.add(randomButton);
		
		add(listsPanelMain);
		
	}
	@Override
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == randomButton) {
			System.out.println("randomButton clicked");
		}
	}
}
