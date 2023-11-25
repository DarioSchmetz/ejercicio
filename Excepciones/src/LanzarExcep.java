
public class LanzarExcep {

	public LanzarExcep() {}
	public void metodo1(){
		try {
			metodo2();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Código metodo1");
	}
	
	public void metodo2() throws Exception {
		try {
			metodo3();
		}
		finally {
			System.out.println("Codigo metodo2");
		}
	}	
	public void metodo3() throws Exception {
		//codigo que puede producir una excepcion
		System.out.println("Código metodo3");
		int x = 10, y = 0;
		x /= y;
	}
	
	public static void main(String[] args) {
			LanzarExcep lanzarExcepcion = new LanzarExcep();
			
			lanzarExcepcion.metodo1();
			System.out.println("Termino");
	}
	
}


