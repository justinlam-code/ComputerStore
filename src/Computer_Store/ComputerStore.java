package Computer_Store;

public class ComputerStore {
	// Field
	String brand;
	String model;
	String type;
	double price;
	String cpuBrand;
	String cpuModel;
	int cpuCores;
	double cpuSpeed;
	int storage;
	int ram;
	String gpuBrand;
	String gpuModel;
	int usbPorts;
	String operatingSystem;
	double display;
	double weight;
	String hyperLink;
	int qualityRating;
	int speedRating;
	int memoryRating;
	int displayRating;

	public String getFieldValue(String fieldName) {
		switch (fieldName) {
		case "GPU":
			return getGpuBrand() + " " + getGpuModel();
		case "CPU":
			return getCpuBrand() + " " + getCpuModel();
		case "RAM":
			return Integer.toString(getRam());
		case "Display Size":
			return Double.toString(getDisplay());
		case "USB PORTS":
			return Integer.toString(getUsbPorts());
		case "Cores":
			return Integer.toString(getCpuCores());
		case "Weight":
			return Double.toString(getWeight());

		default:
			return "";
		}
	}

	public String getRatingValue(String fieldName) {
		switch (fieldName) {
		case "Quality":
			return Integer.toString(getQualityRating());
		case "Speed":
			return Integer.toString(getSpeedRating());
		case "Memory":
			return Integer.toString(getMemoryRating());
		case "Display":
			return Integer.toString(getDisplayRating());
		default:
			return "";
		}
	}

	// Constructor
	public ComputerStore(String brand, String model, String type, double price, String cpuBrand, String cpuModel,
			int cpuCores, double cpuSpeed, int storage, int ram, String gpuBrand, String gpuModel, int usbPorts,
			String operatingSystem, double display, double weight, String hyperLink, int qualityRating, int speedRating,
			int memoryRating, int displayRating) {
		super();
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.cpuBrand = cpuBrand;
		this.cpuModel = cpuModel;
		this.cpuCores = cpuCores;
		this.cpuSpeed = cpuSpeed;
		this.storage = storage;
		this.ram = ram;
		this.gpuBrand = gpuBrand;
		this.gpuModel = gpuModel;
		this.usbPorts = usbPorts;
		this.operatingSystem = operatingSystem;
		this.display = display;
		this.weight = weight;
		this.hyperLink = hyperLink;
		this.qualityRating = qualityRating;
		this.speedRating = speedRating;
		this.memoryRating = memoryRating;
		this.displayRating = displayRating;
	}

	// Getters and Setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCpuBrand() {
		return cpuBrand;
	}

	public void setCpuBrand(String cpuBrand) {
		this.cpuBrand = cpuBrand;
	}

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public int getCpuCores() {
		return cpuCores;
	}

	public void setCpuCores(int cpuCores) {
		this.cpuCores = cpuCores;
	}

	public double getCpuSpeed() {
		return cpuSpeed;
	}

	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getGpuBrand() {
		return gpuBrand;
	}

	public void setGpuBrand(String gpuBrand) {
		this.gpuBrand = gpuBrand;
	}

	public String getGpuModel() {
		return gpuModel;
	}

	public void setGpuModel(String gpuModel) {
		this.gpuModel = gpuModel;
	}

	public int getUsbPorts() {
		return usbPorts;
	}

	public void setUsbPorts(int usbPorts) {
		this.usbPorts = usbPorts;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public double getDisplay() {
		return display;
	}

	public void setDisplay(double display) {
		this.display = display;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getHyperLink() {
		return hyperLink;
	}

	public void setHyperLink(String hyperLink) {
		this.hyperLink = hyperLink;
	}

	public int getQualityRating() {
		return qualityRating;
	}

	public void setQualityRating(int qualityRating) {
		this.qualityRating = qualityRating;
	}

	public int getSpeedRating() {
		return speedRating;
	}

	public void setSpeedRating(int speedRating) {
		this.speedRating = speedRating;
	}

	public int getMemoryRating() {
		return memoryRating;
	}

	public void setMemoryRating(int memoryRating) {
		this.memoryRating = memoryRating;
	}

	public int getDisplayRating() {
		return displayRating;
	}

	public void setDisplayRating(int displayRating) {
		this.displayRating = displayRating;
	}

	// To String
	@Override
	public String toString() {
		return "ComputerStore [brand=" + brand + ", model=" + model + ", type=" + type + ", price=" + price
				+ ", cpuBrand=" + cpuBrand + ", cpuModel=" + cpuModel + ", cpuCores=" + cpuCores + ", cpuSpeed="
				+ cpuSpeed + ", storage=" + storage + ", ram=" + ram + ", gpuBrand=" + gpuBrand + ", gpuModel="
				+ gpuModel + ", usbPorts=" + usbPorts + ", operatingSystem=" + operatingSystem + ", display=" + display
				+ ", weight=" + weight + ", hyperLink=" + hyperLink + ", qualityRating=" + qualityRating
				+ ", speedRating=" + speedRating + ", memoryRating=" + memoryRating + ", displayRating=" + displayRating
				+ "]";
	}

	public String getImagePath() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
