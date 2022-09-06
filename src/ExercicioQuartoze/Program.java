package ExercicioQuartoze;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      List<String> nomes = new ArrayList<>();
      nomes.add("LUCAS");
      nomes.add("SAMUEL");
      nomes.add("ANNA CLARA");
      nomes.add("VICENTE");
      nomes.add("LUCIENE");
      nomes.add("MEIRIELLE");
      nomes.add("ARTHUR");
      for(String texto : nomes) {
    	  System.out.println(texto);
      }
      System.out.println("=========//==============//===========");
      System.out.println(nomes.indexOf("LUCAS"));
      System.out.printf("\n=========//==============//===========\n");
      
      System.out.println("=========//==============//===========");
      nomes.removeIf(n -> n.charAt(0) == 'L');
      //PREDICADO REMOVE TODOS ITEMS DA LISTA QUE COMEÇA COM A LETRA L
      for(String texto : nomes) {
    	  System.out.println(texto);
      }
      
      List<String> resultado = nomes.stream().filter(n -> n.charAt(0) == 'A').collect(Collectors.toList());
      //SEMELHANTE O FOREACH 
      resultado.forEach(System.out::println);
      
      //retorna o primeiro elemento da lista que atenda o predicato se não existe retorna nullo
      String name = nomes.stream().filter(n -> n.charAt(0) == 'M').findFirst().orElse(null);
      System.out.println(name);
	}
}
