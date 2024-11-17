package Computer_Store;

// Importing external classes from the Java Library
import javax.swing.JFrame;
import javax.swing.JLabel; // Title
import javax.swing.JPanel;
import javax.swing.JButton; // Three Buttons
import javax.swing.ImageIcon; // Logo

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
// These specific classes will detect if there is an action made to the GUI
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class ComputerStoreTesting extends JFrame implements ActionListener {

	HashMap<JButton, JPanel> panelMap = new HashMap<JButton, JPanel>();

	TitlePanel titlePanel = new TitlePanel();
	InventoryPanel inventoryPanel = new InventoryPanel();
	//InventoryScreen inventoryScreen = new InventoryScreen();
	

	ImageIcon img = new ImageIcon("images/plusIcon.png");
	JPanel headerPanel = new JPanel();
	JLabel logoLabel2 = new JLabel(new ImageIcon("images/MIDDLELOGO.png"));
	JPanel imagePanel = new JPanel();
	JLabel logoLabel = new JLabel(new ImageIcon("images/LSP LOGO.png"));// Creating a title for the window
	JLabel backgroundLabel = new JLabel(new ImageIcon("images/chart.png"));
	JButton surveyButton = new JButton("Survey");
	JButton mainButton = new JButton("");// Creating a button in order to switch to the survey screen
	JLabel mottoLabel = new JLabel("Leaders in computer distribution.");
	JButton educationButton = new JButton("Education"); // Creating a button in order to switch to the education screen
	JButton inventoryButton = new JButton("Inventory"); // Creating a button in order to switch to an inventory screen

	private void fillHashMap() {

		panelMap.put(inventoryButton, inventoryPanel);
		// panelMap.put(surveyButton, inventoryPanel);
		// panelMap.put(educationButton, inventoryPanel);
		panelMap.put(mainButton, titlePanel);

	}

	public ComputerStoreTesting() {

		fillHashMap();
		HeaderPanel();

		setIconImage(img.getImage());
		setLayout(null);
		setTitle("Laptop Solutions Plus");
		setSize(1280, 720);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		titlePanel.setBounds(0, 40, 1280, 720);

		
		add(titlePanel);
		//add(inventoryScreen);
		add(inventoryPanel);
		
		setVisible(true);
		//inventoryScreen.setVisible(true);
		
		inventoryPanel.setVisible(false);
		//inventoryPanel.setVisible(true); // temporary for inventory editing
	}

	private void HeaderPanel() {

		// Setting up the frame's name and size

		headerPanel.setLayout(null);
		headerPanel.setBounds(0, 0, 1280, 138);
		add(headerPanel);

		mottoLabel.setBounds(300, -30, 640, 180);
		mottoLabel.setFont(new Font("Futura", Font.ITALIC, 18));
		mottoLabel.setForeground(Color.WHITE);
		backgroundLabel.add(mottoLabel);

		backgroundLabel.setLayout(null);
		backgroundLabel.setBounds(0, 0, 1280, 138);
		headerPanel.add(backgroundLabel);
		// Adding the title to the frame

		logoLabel.setBounds(-5, -30, 320, 180); // Temporary values
		Image newImg = new ImageIcon("images/LSP LOGO.png").getImage().getScaledInstance(320, 180,
				java.awt.Image.SCALE_SMOOTH); // scale image
		logoLabel.setIcon(new ImageIcon(newImg)); // set image using rescaled image
		backgroundLabel.add(logoLabel);
//
//		// Adding the survey button to the frame
//		surveyButton.addActionListener(this);
//		surveyButton.setBounds(600, 35, 200, 50); // Temporary values
//		surveyButton.setForeground(new java.awt.Color(61, 63, 203));
//		surveyButton.setFont(new Font("Futura", Font.PLAIN, 25));
//		backgroundLabel.add(surveyButton);
//
//		// Adding the education button to the frame
//		educationButton.addActionListener(this);
//		educationButton.setBounds(800, 35, 200, 50); // Temporary values
//		educationButton.setForeground(new java.awt.Color(61, 63, 203));
//		educationButton.setFont(new Font("Futura", Font.PLAIN, 25));
//		backgroundLabel.add(educationButton);

		// Adding the inventory button to the frame
		inventoryButton.addActionListener(this);
		inventoryButton.setBounds(1000, 35, 250, 50); // Temporary values
		inventoryButton.setForeground(new java.awt.Color(61, 63, 203));
		inventoryButton.setFont(new Font("Futura", Font.PLAIN, 25));
		backgroundLabel.add(inventoryButton);

		mainButton.addActionListener(this);
		mainButton.setBounds(50, 25, 250, 100); // Temporary value
		mainButton.setOpaque(false);
		

		headerPanel.add(mainButton);

	}

	// create global array of the laptops

	public void actionPerformed(ActionEvent e) {

		// Initializes button click to the corresponding panel value in the map
		JPanel correspondingPanel = panelMap.get(e.getSource());

		// Sets the user targeted panel to true when the button is clicked
		correspondingPanel.setVisible(true);

		// Runs through every single panel in the map and checks if the button clicked matches 
		// the current value through the loop. 
		for (JPanel currentPanel : panelMap.values()) {
			// If the button clicked does not match the user targeted panel then it's visibility 
			// will be set to false.
			if (currentPanel != correspondingPanel) {
				currentPanel.setVisible(false);
			}
		}

	}
}
