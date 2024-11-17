package Computer_Store;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

public class InventoryPanel extends JPanel implements ActionListener {

	// Get the laptop array from the main class
	ComputerStore[] LaptopArray = ApplicationClass.LaptopArray;
	public static ComputerStore[] SortedArray;
	
	
	
	String[] buttonArray = { "Price Ascending", "Price Descending", "Weight", "Storage", "Display" };
	JComboBox comboBox = new JComboBox(buttonArray);

	// Create a map to store price categories
	// https://www.w3schools.com/java/java_hashmap.asp
	HashMap<Double, String> priceMap = new HashMap<Double, String>();

	// https://www.w3schools.com/java/java_hashmap.asp
	// Fill the price category map
	public void fillPriceMap() {
		priceMap.put(500.00, "Budget");
		priceMap.put(1000.00, "MidPriced");
		priceMap.put(2000.00, "HighEnd");
		priceMap.put(3000.00, "Ultra");
	}

	public InventoryPanel() {
		 SortedArray = Arrays.copyOf(LaptopArray, LaptopArray.length);
		comboBox.setSelectedIndex(0);
		comboBox.addActionListener(this);
		add(comboBox);

		// Set the layout of this panel to be a vertical BoxLayout
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBounds(0, 138, 1265, 545);

		// Create a panel to hold the laptop buttons
		JPanel laptopPanel = new JPanel();
		laptopPanel.setLayout(new GridLayout(0, 1)); // Use GridLayout for the laptop buttons

		// Create a scroll pane to enable scrolling
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1280, 100);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getVerticalScrollBar().setUnitIncrement(20);

		// Add the laptop panel to the scroll pane
		scrollPane.setViewportView(laptopPanel);
		scrollPane.setPreferredSize(new Dimension(1280, 582));

		// Add the scroll pane to this panel
		add(scrollPane);

		// Loop through the laptop array and create a button for each laptop
		for (int i = 1; i < LaptopArray.length; i++) {

			// Fill the price category map
			fillPriceMap();
			String priceCategory = "";

			// Help from Karanveer Channey P3 - Biswas
			Double[] prices = priceMap.keySet().toArray(new Double[priceMap.size()]);
			Arrays.sort(prices, (a, b) -> Double.compare(a, b));

			// Determine the price category for this laptop
			for (Double price : prices) {

				if (LaptopArray[i].getPrice() <= price) {
					priceCategory = priceMap.get(price);
					break;
				}
			}

			// Create a new button for this laptop
			JButton laptopButton = new JButton();
			JPanel infoPanel = new JPanel();
			infoPanel.setLayout(new BorderLayout());

			// Set the button font and size
			laptopButton.setFont(new Font("Futura", Font.BOLD, 30));
			laptopButton.setPreferredSize(new Dimension(200, 200));

			// Set the button background to be transparent
			laptopButton.setOpaque(true);
			laptopButton.setContentAreaFilled(false);

			// Add the button to the laptop panel
			laptopPanel.add(laptopButton);

			// Add the info panel to the button
			laptopButton.add(infoPanel, BorderLayout.CENTER);

			// Create a JLabel to display the laptop product title

			JLabel infoHeader = new JLabel();
			infoHeader.setLayout(null);
			infoHeader.setBounds(0, 0, 1280, 50);
			Image newImg2 = new ImageIcon("images/chart.png").getImage().getScaledInstance(1280, 40,
					java.awt.Image.SCALE_SMOOTH); // scale image
			infoHeader.setIcon(new ImageIcon(newImg2)); // set image using rescaled image
			infoPanel.add(infoHeader);

			JLabel productTitle = new JLabel(
					LaptopArray[i].getBrand() + " " + LaptopArray[i].getModel() + " - " + priceCategory);
			productTitle.setForeground(Color.WHITE);

			productTitle.setBounds(0, 0, 1280, 40);

			// Set the font of the product title and add it to the infoPanel at the top
			productTitle.setFont(new Font("Futura", Font.BOLD, 30));
			infoHeader.add(productTitle);

			// Create a JLabel to display the laptop price
			JLabel priceLabel = new JLabel("$" + LaptopArray[i].getPrice());

			// Set the font of the price label and add it to the infoPanel on the right
			priceLabel.setBounds(1075, 0, 1280, 40);
			priceLabel.setFont(new Font("Futura", Font.BOLD, 30));
			priceLabel.setForeground(Color.WHITE);
			infoHeader.add(priceLabel);

			// Create an array of strings with the names of laptop fields
			String[] fieldNames = { "GPU", "CPU", "RAM", "Display Size", "USB PORTS", "Cores", "Weight", };

			// Create an array of strings with the names of laptop ratings
			String[] ratings = { "Quality", "Speed", "Memory", "Display", };

			// Create a JPanel with a grid layout to display the laptop fields
			JLabel productDescription = new JLabel("The " + LaptopArray[i].getModel() + " is a " + priceCategory
					+ " priced range option capable of achieving " + LaptopArray[i].getCpuSpeed()
					+ " GHZ Computing speeds.");

			productDescription.setBounds(0, 30, 1280, 50);
			productDescription.setFont(new Font("Futura", Font.PLAIN, 15));
			infoPanel.add(productDescription);

			// Loop through the field names and create a panel for each field with a label
			for (int j = 0; j < fieldNames.length; j++) {

				JLabel fieldLabel = new JLabel(fieldNames[j] + ": " + LaptopArray[i].getFieldValue(fieldNames[j]));
				fieldLabel.setBounds(0 + ((j - 1) * 250), 10, 1280, 130);

				// Set the font of the field label and add it to the field panel on the left
				fieldLabel.setFont(new Font("Futura", Font.BOLD, 15));
				infoPanel.add(fieldLabel);

			}

			// Add the fieldsPanel to the infoPanel in the center

			// Create a JPanel with a grid layout to display the laptop ratings
			;

			// Loop through the ratings and create a panel for each rating with a label
			// Create a JPanel to hold the laptop ratings
			JPanel ratingsPanel = new JPanel();
			ratingsPanel.setLayout(null);

			// Loop through the ratings and create a label for each rating
			for (int p = 0; p < ratings.length; p++) {
				JLabel ratingsLabel = new JLabel(ratings[p] + ": " + LaptopArray[i].getRatingValue(ratings[p]));
				ratingsLabel.setFont(new Font("Futura", Font.BOLD, 15));
				ratingsLabel.setBounds(0, 100 + (p * 20), 150, 20);
				ratingsPanel.add(ratingsLabel);

				JLabel visualRatings = new JLabel();
				ratingsPanel.add(visualRatings);

				String ratingValue = LaptopArray[i].getRatingValue(ratings[p]);
				int rating = Integer.parseInt(ratingValue);
				Image newImg3 = new ImageIcon("images/CHART.png").getImage().getScaledInstance(1280, 10,
						java.awt.Image.SCALE_SMOOTH);
				visualRatings.setIcon(new ImageIcon(newImg3));
				visualRatings.setBounds(160, 100 + (p * 20), rating * 100, 10);
			}

			// Add the ratingsPanel to the infoPanel at the bottom
			infoPanel.add(ratingsPanel);

			// Add the ratingsPanel to the infoPanel at the bottom

		}

	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == comboBox) {
			int selectedIndex = comboBox.getSelectedIndex();
			
			if (selectedIndex == 0) {
				
				for (int i = 1; i < LaptopArray.length; i++) {
					Arrays.sort(SortedArray, i, SortedArray.length, Comparator.comparingDouble(ComputerStore::getPrice));
					LaptopArray[i] = SortedArray[i];
					
					
				}
				
			

			}

		}
	}
}
