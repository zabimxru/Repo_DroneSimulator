package Katze.DroneSimulation.data.api;

public class DroneType {
	private int id;
	private String manufacturer;
	private String typename;
	private double weight;
	private double maxSpeed;
	private double minSpeed;
	private double batteryCap;
	private double controlRange;
	private double maxCarriage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public double getMinSpeed() {
		return minSpeed;
	}
	public void setMinSpeed(double minSpeed) {
		this.minSpeed = minSpeed;
	}
	public double getBatteryCap() {
		return batteryCap;
	}
	public void setBatteryCap(double batteryCap) {
		this.batteryCap = batteryCap;
	}
	public double getControlRange() {
		return controlRange;
	}
	public void setControlRange(double controlRange) {
		this.controlRange = controlRange;
	}
	public double getMaxCarriage() {
		return maxCarriage;
	}
	public void setMaxCarriage(double maxCarriage) {
		this.maxCarriage = maxCarriage;
	}
	
	
}
