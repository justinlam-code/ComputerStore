package Computer_Store;

public class ComputerStoreArray {

	// create global array of the laptops
	public static ComputerStore[] LaptopArray = new ComputerStore[40];
	
	// main method
	public static void main(String[] args) {
		
		// call method to fill library
		ComputerStoreReader.fillLibrary();
		
		
		// open main page of application
		new ComputerStoreTesting();
	}
}