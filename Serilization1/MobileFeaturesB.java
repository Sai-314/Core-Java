package Serilization1;

import java.io.Serializable;

public class MobileFeaturesB implements Serializable {

	public static final int serialVersionUID = 192006104;

	String mobileName;
	int price;
	String color;
	String ram;
	String rom;
	String camera;
	String battery;

	public MobileFeaturesB(String mobileName, int price, String color, String ram, String rom, String camera,
			String battery) {
		super();
		this.mobileName = mobileName;
		this.price = price;
		this.color = color;
		this.ram = ram;
		this.rom = rom;
		this.camera = camera;
		this.battery = battery;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public static int getSerialversionuid() {
		return serialVersionUID;
	}

}
