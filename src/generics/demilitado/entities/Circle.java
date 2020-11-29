package generics.demilitado.entities;

public class Circle implements Shape {

	private Double radius;

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.PI * getRadius();
	}
	
}
