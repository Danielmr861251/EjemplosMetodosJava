package circle;

public class test_circle {

	public static void main(String args[]){
		
		circle c1 = new circle();
		
		System.out.println("el circulo 1 color "+ c1.getColor() +  " tiene un radio de: "
				+ c1.getRadius() + " y area de " + c1.getArea());
		
		circle c2= new circle(2);
		
		System.out.println("el circulo 2 " + c2.getColor() +  " tiene un radio de: "
				+ c2.getRadius() + " y area de " + c2.getArea());
		
		circle c3 = new circle(1);
		
		System.out.println("el circulo 3 " + c3.getColor() + " tiene un radio de: "
				+ c3.getRadius() + " y area de " + c3.getArea());
		
	}
	
}
