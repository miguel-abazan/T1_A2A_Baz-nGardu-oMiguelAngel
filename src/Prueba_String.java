import java.util.Scanner;

class TDACadenaEspecialConStringBuilder{
	private String cadena;
	


	public TDACadenaEspecialConStringBuilder(String cadenaEx) {
		this.setCadena(cadenaEx);
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	

	public String invertirCadenaPorLetras() {
		StringBuilder sb = new StringBuilder(this.getCadena());
		sb.reverse();
		return sb.toString();
	}

	public String invertirCadenaPorPalabra() {
		String inversa ="";

		String palabraA[] = this.getCadena().split(" ");

		for (int j = 0; j < palabraA.length; j++) {
			inversa = palabraA[j]+" "+inversa;
		}
		return inversa;
	}

	public String agregarCaracterEnPosicion(String caracter,int posicion) {
		StringBuilder sb = new StringBuilder(this.getCadena());
		sb.insert(posicion,caracter);
		return sb.toString();
	}

	public String agregarCadenaEnPosicion(String caracter,int posicion) {
		StringBuilder sb = new StringBuilder(this.getCadena());
		sb.insert(posicion,caracter);
		return sb.toString();
	}

}
public class Prueba_String{

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		TDACadenaEspecialConStringBuilder p = new TDACadenaEspecialConStringBuilder("Instituto tecnologico superior de jerez");
		StringBuilder sbCadena = new StringBuilder(p.getCadena());

		byte opcion;
		do {
			
			System.out.println("Cadena con la que se va a trabajar"+p.getCadena());
			System.out.print("Elige una opcion: ");
			System.out.println("\n1) Invertir Cadena por letras\n2) Invertir Cadena por palabras\n3) Agregar un caracter en una posicion de la cadena"
					+ "\n4) Agregar un palabra en una posicion de la cadena\n5) Salir");

			
			opcion = entrada.nextByte();

			switch (opcion) {
			case 1: 
				
				System.out.println("invertido: "+sbCadena.reverse());
				
				
			break;
			case 2: 
				
				String x = p.invertirCadenaPorPalabra();
				
				System.out.println("invertido: "+x);
				
			break;
			case 3: 
			
				
				System.out.println("Caracter a agregar: ");
				String c = entrada.next();
				
				System.out.println("ingrese la posicion: ");
				int s = entrada.nextInt(); 
				System.out.println("Se agrego un caracter a la cadena");
				System.out.println(p.agregarCaracterEnPosicion(c,s));
				
				
			break;
			case 4: 
		
				System.out.println("cadena a agregar: ");
				String b = entrada.next();
				
				System.out.println("ingrese la posicion: ");
				int t = entrada.nextInt(); 
				System.out.println("Se agrego un texto  a la cadena");
				System.out.println(p.agregarCaracterEnPosicion(b,t));
				
				
			break;
			case 5: break;
			default: System.out.println("Opcion incorrecta");break;
			}
		}while(opcion != 5);

	}

}

