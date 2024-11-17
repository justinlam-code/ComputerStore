package Computer_Store;


//Work - 90% Justin 10% Kelvin

// Importing external classes from the Java Library

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

// This class will display the title screen for the Laptop Store program
public class TitlePanel extends JPanel implements ActionListener {
	
	JPanel TitlePanel = new JPanel();
	JLabel logoLabel = new JLabel(new ImageIcon("images/LSP LOGOFIX.png"));// Creating a title for the window
	JLabel logoLabel2 = new JLabel(new ImageIcon("images/MIDDLELOGO.png"));
	

	// This class will create a frame (screen) for the labels and buttons to be
	// placed on
	public TitlePanel() {

		TitlePanel.setBounds(0, 0, 1280, 582);
		Image newImg2 = new ImageIcon("images/MIDDLELOGO.png").getImage().getScaledInstance(1120, 630,
				java.awt.Image.SCALE_SMOOTH); // scale image
		logoLabel2.setIcon(new ImageIcon(newImg2)); // set image using rescaled image
		add(logoLabel2);
		
		// Revealing the frame
		

	}

	//
	public void actionPerformed(ActionEvent event) {

	}
}
