package ExercicioDezessete;

import java.util.Locale;
import java.util.Scanner;

public class Porgram {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("DIGITE QUANTIDADE DE ELEMENTOS DA MATRIZ");
       int n = entrada.nextInt();
       
       int[][] matriz = new int[n][n];
       

       for(int x = 0; x < n; x++) {
    	   for(int y = 0; y < n; y++) {
    		   matriz[x][y] = entrada.nextInt();
    		  
    	   }
       }
       int w =0;
       System.out.println("DIAGONAL PRINCIPAL ...");
       for(int x = 0; x < n ; x++) {
    	   System.out.printf(" %d ", matriz[x][x]); 
    	   for(int y = 0; y < n ; y++) {
    		  if(matriz[x][y] < 0) {
    			w++;   
    		   }
    	   }
       }
       System.out.printf("numeros negativos %d", w);
       entrada.close();
	}
}
