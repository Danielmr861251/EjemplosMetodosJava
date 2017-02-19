import java.util.*;
public class programa_dos{
	public static void main(String [] args){
	int opc, x, y;

	Scanner leer = new Scanner (System.in);
	System.out.println("¿Que desea hacer?");
	System.out.println("1.- Sumar");
	System.out.println("2.- Restar");
	System.out.println("3.- Multiplicar");
	System.out.println("4.- Dividir");
	System.out.println("Ingrese su opccion");
	opc = leer.nextInt();
	
	
	if(opc==1){
	System.out.println("Ingrese el valor de x");
	x = leer.nextInt();
	System.out.println("Ingrese el valor de y");
	y = leer.nextInt();
	int suma= suma(x,y);
	System.out.println("El resultado de la suma es= "+suma);
	}
	if(opc == 2){
		resta();
	}
	if(opc==3){
	    multi();
		
	}
	if(opc == 4){
		
		 double div=div();
		System.out.println("El resultado de la divicion es= "+ div);	
	}
	else{
		System.out.println("ERROR");
	}
	}
	public static int suma(int x, int y){
		int suma = x+y;
		return suma;
	}
	public static void resta(){
	Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el valor de x");
		int x = leer.nextInt();
		System.out.println("Ingrese el valor de y");
		int y = leer.nextInt();
		int resta = x-y;
		System.out.println("El resultado de la resta es= "+resta);
	}
	public static void multi(){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el valor de x");
		int x = leer.nextInt();
		System.out.println("Ingrese el valor de y");
		int y = leer.nextInt();
		int multi = x*y;
		System.out.println("El resultado de la multiplicacion es= "+multi);
		
	}
	public static double div(){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el valor de x");
		double a = leer.nextDouble();
		System.out.println("Ingrese el valor de y");
		double b = leer.nextDouble();
		 
		double div = a/b;
		return div;
	}
	}
