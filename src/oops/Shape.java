package oops;

public abstract class Shape {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}

	abstract void calculateArea();

}
