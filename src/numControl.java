import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

class NumeroControl{
	public void archivoCrear() {

		String ruta1 = "./src/NumeroDeControl.txt";
		File archivo = new File(ruta1);

		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
				System.out.println("Archivo creado correctamente");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {

		}
	}
	public String generarNumero() {

		int con = 0;
		for (int i = 70000; i < 75000; i++) {
			Random r = new Random();
			con = r.nextInt(18075000-18069999)+18069999;
		}
		String numero = con+"";
		return numero;
	}
	public String letraPorCarrera(String numControl) {
		String letra ="";
		StringBuilder sb = new StringBuilder(numControl+"");
		String numC = sb.substring(2, 5);

		if (numC.equals("070")) {
			letra = "S";
		} else if (numC.equals("071")) {
			letra = "M";
		} else if (numC.equals("072")) {
			letra = "I";
		} else if (numC.equals("073")) {
			letra = "A";
		} else if (numC.equals("074")) {
			letra = "C";
		}

		String numControlCom = sb.insert(0,letra).toString();

		return numControlCom;
	}
	public void guardarNumeroControl() {
		
		FileWriter archivo = null;
		PrintWriter pr = null;
		
		try {
			archivo = new FileWriter("./src/NumeroDeControl.txt", true);
			pr = new PrintWriter(archivo);
			
			String numeroControl = "";
			
			for (int i = 70000; i < 75000; i++) {
				String num = this.generarNumero();
				numeroControl = this.letraPorCarrera(num);
				pr.println(numeroControl);
				System.out.println(numeroControl);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			pr.close();
		}
	}
}

public class numControl{

	public static void main(String[] args) {
		NumeroControl n = new NumeroControl();
		n.archivoCrear();
		n.guardarNumeroControl();

	}

}