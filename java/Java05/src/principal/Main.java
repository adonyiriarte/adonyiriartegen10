package principal;

public class Main {

	       /* boolean condicion = true;
	        int bandera = 1;
            If, se ejecuta la condicion si es verdadera
	        if(condicion){
	            bandera = 2;
	            System.out.println("La condicion es verdadera");
	        }else{
             bandera = 3;
             System.out.println("La condicion es falsa");
          }
	        
	        System.out.println("Se continua con otras instrucciones");
	        //Imprimimos la variable bandera
	        System.out.println("El valor de la bandera es: "+bandera);
	        System.out.println("Ingrese calificacion de la prueba: ");
	        //Valor entre 0 y 100
	        int prueba = Integer.parseInt(in.nextLine());
	        char calificacion = ' ';
	        if(prueba >= 90){
	            calificacion = 'A';
	        }else if(prueba >= 80){
	            calificacion = 'B';
	        }else if(prueba >= 70){
	            calificacion = 'c';
	        }else if(prueba >= 60){
            	calificacion = 'D';
	        }else{
	            calificacion = 'F';
	        }
	        
	        System.out.println("Se continua con otras instrucciones"); 
	        System.out.println("Calificación =" + calificacion)*/
	        
			/*int mes = 2;
			String mesString;
			case 1:  mesString = "Enero";
			break;
			case 2:  mesString = "Febrero";
			break;
			case 3:  mesString = "Marzo";
			break;
			case 4:  mesString = "Abril";
			break;
			case 5:  mesString = "Mayo";
			break;
			case 6:  mesString = "Junio";
			break;
			case 7:  mesString = "Julio";
			break;
			case 8:  mesString = "Agosto";
			break;
			case 9:  mesString = "Septiembre";
			break;
			case 10: mesString = "Octubre";
			break;
			case 11: mesString = "Noviembre";
			break;
			case 12: mesString = "Diciembre";
			break;
			default: mesString = "Invalid month";
			break;
			System.out.println("Ingreso un numero fuera del rango");
       }
       System.out.println("Mes elegido: "+mesString);*/
	   
    int mesCalendario = 3;
    String estacion;
    
    switch(mesCalendario){
    case 1:
    case 2:
    case 12:
    estacion = "Invierno";
    break;
    case 3:
    case 4:
    case 5:
    estacion = "Primavera";
    break;
    case 6:
    case 7:
    case 8:
    estacion = "Verano";
    break;
    case 9:
    case 10: 
    case 11:
    estacion = "Otoño";
    break;
    default:
    estacion = "Mes invalido";
    break;
    }
    System.out.println("Mes: "+mesCalendario+" \tEstacion: "+estacion);
}

