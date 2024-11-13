
package jason.Math;

public class Circle {
	private double radius = 1.0;

	public Circle() {
	}

	public Circle(double newRadius) {
		radius = newRadius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public double getradius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		if (newRadius <= 0)
			return;

	}
}
