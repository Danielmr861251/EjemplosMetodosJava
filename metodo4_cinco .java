public class metodo4_cinco {

	public static void main(String[] args) {
		// con retorno y con parametros
		int a=2,b=4,c=6;
		int prom = promedio(a,b,c);
		System.out.println("el promedio es: "+prom);
		

	}public static int promedio (int a,int b,int c){
		int op = ((a+b+c)/3);
		return op;
		
	}

}
