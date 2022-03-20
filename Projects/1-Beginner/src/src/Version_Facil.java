import java.util.Scanner;
public class Version_Facil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce el número binario --> ");
		String cadenaBinaria = entrada.nextLine();
		int numBinario = 0;
		for(int i = 0; i < cadenaBinaria.length(); i++) {
			if((cadenaBinaria.charAt(i) != '0' && cadenaBinaria.charAt(i) != '1') || cadenaBinaria.length() > 8 ) {
				System.out.println("Error: no se permiten números distintos de 0 o 1, y la longitud máxima debe ser 8");
				System.exit(0);
			}
		}
		
		numBinario = Integer.parseInt(cadenaBinaria, 2);
		System.out.println("Valor decimal: " + numBinario);
		
	}
	

}
