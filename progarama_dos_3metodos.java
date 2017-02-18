import java.util.Scanner;
public class programa_tres {

	public static void main(String[] args) {
		//programa_con_3_metodos
		Scanner sc = new Scanner(System.in);
		int opcion;
		double num1,num2;
		
		imprimir();
		opcion = sc.nextInt();
		
		if(opcion==1){
	
		System.out.println("ingrese el numero1"); 
		num1 = sc.nextDouble();
		System.out.println("ingrese el numero2"); 
		num2 = sc.nextDouble();
		double resp = sumar(num1,num2);
		resultado(resp);
		}else
		System.out.println("gracias");
			
		
	}public static void imprimir(){
		System.out.println("que desea realizar?"); 
		System.out.println("\n1.- suma de dos numeros");
		System.out.println("2.- nada"); 
		
	}public static double sumar(double num1,double num2){
		double suma = num1+num2;
		return suma;
		
	}
	public static void resultado(double resp){
	System.out.println("la suma es: "+resp);
	}
}
