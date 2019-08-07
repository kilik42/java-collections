package traversingListsandCustomTypes;

public class Vehicle {
	String make;
	String model;
	int price;
	boolean fourWdrive;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fourWdrive=" + fourWdrive + "]";
	}
	public Vehicle(String make, String model, int price, boolean fourWdrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.fourWdrive = fourWdrive;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the fourWdrive
	 */
	public boolean isFourWdrive() {
		return fourWdrive;
	}
	/**
	 * @param fourWdrive the fourWdrive to set
	 */
	public void setFourWdrive(boolean fourWdrive) {
		this.fourWdrive = fourWdrive;
	}

}
