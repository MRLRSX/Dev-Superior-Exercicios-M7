package ExercicioDoze;

import java.util.Locale;
import java.util.Scanner;

import ExercicioDoze.entities.Product;

public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner entradaDados = new Scanner(System.in);
      System.out.println("INFORME A QUANTIDADE DE PRODUTOS A SEREM LIDOS");
      int n = entradaDados.nextInt();
      
      Product[] vect = new Product[n];
      
      for(int x = 0; x < n; x++){
    	  entradaDados.nextLine();
    	  System.out.println("INFORME O NOME DO PRODUTO");
    	  String name = entradaDados.nextLine();
    	  System.out.println("INFORME O PREÇO DO PRODUTO");
    	  double price = entradaDados.nextDouble();
    	  System.out.println("INFORME A QUANTIDADE DO PRODUTO");
    	  int quantity = entradaDados.nextInt();
    	  vect[x] = new Product(name, price, quantity);
      }
      
      double media = 0;
      for(int x = 0; x < n; x++){
    	  media += vect[x].getPrice();
      }
      
      System.out.printf("AVERAGE PRICE = %.2f", media / vect.length);
      entradaDados.close();
	}
}
