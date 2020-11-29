package generics.demilitado.entities;

public class Retangle implements Shape{
private Double width;
private Double height;

	public Double getWidth() {
	return width;
}

public void setWidth(Double width) {
	this.width = width;
}

public Double getHeight() {
	return height;
}

public void setHeight(Double height) {
	this.height = height;
}

	public Retangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double area() {
		return getWidth() * getHeight();
	}

	public Retangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}

}
