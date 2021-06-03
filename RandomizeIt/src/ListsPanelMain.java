import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ListsPanelMain extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7101308713798768031L;
	JPanel listsPanelMain;
	JButton randomButton;
	JTextField randomResult;
	Data list1 = new Data();
	
	
	JButton testButton;
	JButton setupButton;
	JButton listListItemsButton;

	public ListsPanelMain() {
		
		
		
		
		
		listsPanelMain = new JPanel();
		randomButton = new JButton("random");
		randomButton.addActionListener(this);
		
		listListItemsButton = new JButton("list ListItems");
		listListItemsButton.addActionListener(this);
		
		randomResult = new JTextField();
		randomResult.setEditable(false);
		
		randomResult.setText("Result");
		
		listsPanelMain.add(randomButton);
		listsPanelMain.add(randomResult);
		
		listsPanelMain.add(listListItemsButton);
		
		
		
		testButton = new JButton("Datatest");
		testButton.addActionListener(this);
		
		setupButton = new JButton("setupButton");
		setupButton.addActionListener(this);
		
		
		listsPanelMain.add(testButton);
		
		listsPanelMain.add(setupButton);
		
		add(listsPanelMain);
		
		
		
	}
	@Override
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == randomButton) {
			System.out.println("randomButton clicked");
			
			randomResult.setText(list1.randomItem());
		}
		
		if(e.getSource() == listListItemsButton) {
			
			String list1Items = new String();
			list1Items = "";
			for (int n = 0; n < list1.getSize(); n++) {
				list1Items = list1Items + list1.getItemAt(n) + ";";
				
			}
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, list1Items);
		}
		
		
		
		if(e.getSource() == testButton) {
			System.out.println("testButton clicked");
			
			try {
				Test.setup();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource() == setupButton) {
			
			list1.addName("hallo");
			list1.addName("tschüss");
			System.out.println(list1.getSize());
		}
	}
	
	
}
