public class metodo4_cuatro {

	public static void main(String[] args) {
		// con retorno y parametros
		String saludo = "hola";
		String fras = frase(saludo);
		System.out.println(fras);
		
	}public static String frase(String saludo){
		String quien = " mundo";
		String frase_ = saludo + quien;
		return frase_;
		
	}

}
