import java.util.*;
public class metodo4_tres {

	public static void main(String[] args) {
		// con retorno y con parametros
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		System.out.println("ingrese su nombre");
		nombre = sc.nextLine();
		
		String frase = union(nombre);
		System.out.println(frase);
		
	}public static String union(String nombre){
		String saludo = "hola ";
		String frase_ = saludo + nombre;
		return frase_;
		
	}

}
