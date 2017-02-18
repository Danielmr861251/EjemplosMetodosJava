import java.util.Scanner;
public class metodo4_uno {

	public static void main(String[] args) {
		// con retorno y con parametros
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("ingrese un numero");
		a = sc.nextInt();
		System.out.println("ingrese el numero 2");
		b = sc.nextInt();
		int suma = sumar(a,b);
		System.out.println("la suma de los numeros es: "+suma);
		
	}public static int sumar(int a,int b){
		int sum = a+b;
		return sum;
		
	}

}
