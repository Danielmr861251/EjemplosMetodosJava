import java.util.*;
public class programa_uno {

	public static void main(String[] args) {
		
		// promedio de 3 numeros ingresados
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		double num1,num2,num3;
		System.out.println("promedio de 3 calificaciones");
		System.out.println("cual es tu nombre?");
		nombre = sc.nextLine();
		
		pedir();
		num1 = sc.nextDouble();
		pedir();
		num2 = sc.nextDouble();
		pedir();
		num3 = sc.nextDouble();
		double prom = promediar(num1,num2,num3);		
		imprimir(nombre);
		System.out.println(prom);
		
	}public static void pedir(){
		System.out.println("ingrese el numero");
		
	}public static double promediar(double num1,double num2,double num3){
		double promedio = ((num1+num2+num3)/3);
		return promedio;
		
	}public static void imprimir(String nombre){
		System.out.println("hola "+nombre+" tu promedio es: \n");;
	}
		
	


}
