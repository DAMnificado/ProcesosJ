package Ejemplo02_Sumador;

public class Launcher {

	public void lanzarSumador(Integer n1, Integer n2) {
		
		
		String rutaDirectorio = System.getProperty("user.dir");
		String ruta = "\\src\\Ejemplo02_Sumador\\";
		
		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder("java", "-cp" , rutaDirectorio+ruta+"Sumador", n1.toString(), n2.toString());
			pb.start();
			
         

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Launcher lanzador = new Launcher();
		lanzador.lanzarSumador(1, 51);
		lanzador.lanzarSumador(51, 100);
		System.out.println("Ok");
	}

}
