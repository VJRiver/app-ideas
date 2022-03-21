import java.util.Scanner;
public class Version_Dificil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String datoCrudo;
		int decDigit = 0;
		int valorDecimal = 0;
		Double buffer = 0.0;
		
		System.out.print("Introduce el número de máximo 8 bytes, únicamente 0s y 1s --> ");
		datoCrudo  = entrada.nextLine();
		if(datoCrudo.length() > 8) {
			System.out.println("Error: número debe ser máximo 8 bytes de longitud");
			System.exit(0);
		}
		int j = 0;
		for(int i = datoCrudo.length()-1; i >= 0; i--) {
			
			 // System.out.println("Valor de i: " + i);
			
			// If input is not binary, exit
			if(datoCrudo.charAt(i) != '0' && datoCrudo.charAt(i) != '1') {
				System.out.println("Error: solamente se admiten ceros y unos");
				System.exit(0);
			}
			
			decDigit = Character.getNumericValue(datoCrudo.charAt(i));
			// System.out.println("Valor decimal: " + decDigit);
			
			buffer = decDigit* Math.pow(2, j);
			
			// System.out.println("Buffer: " + buffer);
			
			valorDecimal += buffer;
			
			j++;
			
		}
		
		System.out.println("Número convertido a decimal: " + valorDecimal);
		
		entrada.close();
	}

}
