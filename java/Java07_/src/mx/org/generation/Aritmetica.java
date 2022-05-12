package mx.org.generation;

public class Aritmetica {
	//Definimos los atributos de la clase
	
	int a;
	int b;
	
	//Definimos un método sin retorno (void) y sin argumentos
	void sumar () {
		int resultado = a + b;
		System.out.println("La suma es: "+resultado);	}
	
	//Método con retorno y sin argumentos
	
	int sumarconReturn(){
		int resultado = a + b;
		return resultado; //return devuelve un sólo valor
	}
	
	//Definimos un método con retorno
	// con argumentos de entrada
	int sumarConArgumentos(int x, int y) {
		a = x;
		b = y;
		int resultado = a + b;
		return resultado;
	}
	
	//Definimos un método de la librería Math de Java
	double usoDeRandom(int limiteSup){
		double numeroRandom = Math.random() * limiteSup;
		return numeroRandom;
	}
	
	

}
