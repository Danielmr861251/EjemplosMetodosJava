package circle;

public class circle {

	private double radius;
	private String color;
	
	public circle(){
		radius = 2.0;
		color = "blue";
	}
	public circle(double r){
		radius = r;
		color = "red";
		
	}
	public double getRadius(){
		return radius;
		
	}
	public double getArea(){
		return radius*radius*Math.PI;
		
	}
	public String getColor(){
		return color;
		
	}
}
