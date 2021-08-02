package oops;

public class ShortPerson {
	private float weight;
	private int height;

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "TallPerson [weight=" + weight + ", height=" + height + "]";
	}

}
