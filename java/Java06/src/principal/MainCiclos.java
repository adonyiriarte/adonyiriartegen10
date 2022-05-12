package principal;

public class MainCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 10;
		// uso del ciclo while
		// while (contador <10) {
		while (contador <= 5) {
			System.out.println("Valor de contador en while: " + contador);
			contador++;
		}
		/*
		 * //reinicio mi varibale //contador = 0; contador = 10; //uso el ciclo do-while
		 * do { System.out.println("Valor de contador en do while: " + contador);
		 * contador++; }while (contador <=5);
		 * 
		 * 
		 * //reinicio mi variable for (int i=0; i<=5; i++ ) {
		 * System.out.println("Valor de i en for :" + i); }
		 */

		// reinicio mi variable contador
		contador = 15;

		/*
		 * // uso del ciclo for con mi variable pre-declarada for (; contador <= 5;
		 * contador++) { System.out.println("Valor de contador en for :" + contador); }
		 */
		
		/*
		 * //uso de la palabra break 
		 * for (int gera = 1; gera <=5; gera++) {
		 * System.out.println("Gera n . :"+gera); if (gera >1) {
		 * System.out.println("Gera clonado"); break; } 
		 */
		
		//uso de la palabra continue
		for (int gera= 1; gera <=5; gera++) {
			if (gera != 3) {
			System.out.println("Gera pirata :"+ gera); 
			continue;
		}
			System.out.println("El gera original es n . :" +gera);
		}

	}

}
