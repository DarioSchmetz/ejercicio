
public class ErrorAritmeticoConManejodeExcepciones {

	public static void main(String[] args) {
		int i = 5, j = 1, k=0;
		try {
			k = i / j;
		} 
		catch (ArithmeticException e) {
			System.err.println("Seprodujo un error aritmético: " + e.getMessage());
		}
		catch (Exception e) {
			System.err.println("Se produjo un error: " + e.getMessage());
		}
		finally {
			System.out.println("Código que siempre se ejecuta");
		}
		System.out.println(k);
	}

}
