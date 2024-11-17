package Computer_Store;

import java.io.*;
import java.util.Scanner;
// Work - Justin 100%
public class ComputerStoreReader {

	// fill library with file data
	public static void fillLibrary() {
		
		// search for file
		try {
			
			// read in file
			Scanner inputFile = new Scanner(new File("data/dataSheetFix.csv"));
			
			// delimiter
			inputFile.useDelimiter(",|\r\n");
			
			// ignore first line of the file
			inputFile.nextLine();
			
			// loop through data
			for (int index = 1; index < ApplicationClass.LaptopArray.length; index++) {
				
				// computer info fields
				String brand = inputFile.next();
				String model = inputFile.next();
				String type = inputFile.next();
				double price = inputFile.nextDouble();
				String cpuBrand = inputFile.next();
				String cpuModel = inputFile.next();
				int cpuCores = inputFile.nextInt();
				double cpuSpeed = inputFile.nextDouble();

				int storage = inputFile.nextInt();
				int ram = inputFile.nextInt();
				String gpuBrand = inputFile.next();
				String gpuModel = inputFile.next();
				int usbPorts = inputFile.nextInt();
				String operatingSystem = inputFile.next();
				double display = inputFile.nextDouble();
				double weight = inputFile.nextDouble();
				String hyperLink = inputFile.next();
				int qualityRating = inputFile.nextInt();
				int speedRating = inputFile.nextInt();
				int memoryRating = inputFile.nextInt();
				int displayRating = inputFile.nextInt();
				
				// create computer info into array using template class
				ApplicationClass.LaptopArray[index] = new ComputerStore(brand, model, type, price, cpuBrand, cpuModel, cpuCores, cpuSpeed, storage, ram, gpuBrand, gpuModel,
																			 usbPorts, operatingSystem, display, weight, hyperLink, qualityRating, speedRating, memoryRating, 
																			 displayRating);
				
			}
			
			inputFile.close();
			
		} catch (FileNotFoundException e) {
			// display error message
			System.out.println("File Error");
			
		}
	}
}