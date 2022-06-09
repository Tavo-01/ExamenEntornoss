/*	// Versi�n Final
*	grupo  : GDAM21
*	alumno : Gustavo Pay Pereira
*	n.exp. : 7256
*	fecha  : 09/06/2022
 */
package Cheese;

/**
 * Clase main del examen
 * @author ___
 */
public class Main {
	/**
	 * Método main del examen
	 * @param args Argumentos para linea de comandos
	 * @author ___
	 */
     public static void main(String[] args) {
    	 //String codigo,String tipo, int cantidad, double peso
    	 Producto primero = new Producto("Papel","Higiene",10,45.5);
    	 Producto segundo = new Producto("Gel hidroalcoholico","Higiene",6,6);
    	 Producto tercero = new Producto("Paracetamol","Analgesico",3,2.5);
    	 primero.imprime_etiqueta();
    	 segundo.imprime_etiqueta();
    	 tercero.imprime_etiqueta();
         System.out.println("1º Gdam: Entornos de desarrollo");
         

     }
}
