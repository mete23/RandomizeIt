import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;


public class ListsPanelMain extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7101308713798768031L;
	JPanel listsPanelMain;
	JButton randomButton;
	JTextField randomResult;
	
	
	
	
	static Data list1 = new Data();

	JButton testButton;
	JButton setupButton;
	JButton listListItemsButton;
	JButton clearListButton;
	JButton loadNamesListButton;
	JButton saveNamesListButton;
	JButton setupFolderButton;
	
	GridLayout grid1 = new GridLayout(3, 3, 6, 10);
	

	public ListsPanelMain() {

		listsPanelMain = new JPanel();
		listsPanelMain.setLayout(grid1);
		
		
		randomButton = new JButton("random");
		randomButton.addActionListener(this);
		

		listListItemsButton = new JButton("list ListItems");
		listListItemsButton.addActionListener(this);

		randomResult = new JTextField();
		randomResult.setEditable(false);
		randomResult.setColumns(10);

		randomResult.setText("Result");

		listsPanelMain.add(randomButton);
		listsPanelMain.add(randomResult);

		listsPanelMain.add(listListItemsButton);

		testButton = new JButton("Datatest");
		testButton.addActionListener(this);

		setupButton = new JButton("setupButton");
		setupButton.addActionListener(this);

		clearListButton = new JButton("clear List");
		clearListButton.addActionListener(this);

		saveNamesListButton = new JButton("save Names");
		saveNamesListButton.addActionListener(this);

		loadNamesListButton = new JButton("load Names");
		loadNamesListButton.addActionListener(this);

		setupFolderButton = new JButton("setupFolder and File");
		setupFolderButton.addActionListener(this);

		

		listsPanelMain.add(testButton);

		listsPanelMain.add(setupButton);


		listsPanelMain.add(setupFolderButton);

		add(listsPanelMain);

	}

	@Override

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == randomButton) {
			System.out.println("randomButton clicked");

			randomResult.setText(list1.randomItem());
		}

		if (e.getSource() == listListItemsButton) {

			String list1Items = new String();
			list1Items = "";
			for (int n = 0; n < list1.getSize(); n++) {
				list1Items = list1Items + list1.getItemAt(n) + "\n ";

			}
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, list1Items);
		}

		if (e.getSource() == testButton) {
			System.out.println("testButton clicked");

			try {
				Test.setup();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == setupButton) {

			list1.addName("hallo");
			list1.addName("tschüss");
			System.out.println(list1.getSize());
		}
		

		if (e.getSource() == setupFolderButton) {
			list1.setFolder("NamenOrdner");
			try {
				list1.setFile("NamenOrdner/names.txt");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

}
