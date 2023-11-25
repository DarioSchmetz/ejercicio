public class ejercicio18 {

	public static void main(String[] args) {

		new ejercicio18().calcular(args);
		
	}
	
	private void calcular (String[] args) {
		int result = 0;

		try {
			
			int nro1 = new Integer(args[0]);
			String op = args[1];
			int nro2 = new Integer(args[2]);
			
			if (op.equals("+")) {
				result = nro1 + nro2;
			}else if (op.equals("-")) {
				result = nro1 - nro2;
			}else if (op.equals("x")) {
				result = nro1 * nro2;
			}else if(op.equals("/")) {
				result = nro1 / nro2;
			}
			System.out.println(op);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error ArrayIndexOutOfBounds: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("error NumberFormatException: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("error NullPointerException: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("error ArithmeticException: " + e.getMessage());
		}
		
		System.out.println("Resultado = " + result);
	}

}
