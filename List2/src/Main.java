import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Gabriel");
        list.add("Joao");
        list.add("Fernando");
        list.add("Maycon");

        for (String x: list){
            System.out.println(x);
        }
        System.out.println("---------------");

        list.remove(3);

        list.remove("Fernando");

        list.removeIf(x -> x.charAt(0) == 'J'); // remove todos que comeca com a letra 'M'

        for (String x: list){
            System.out.println(x);
        }

        System.out.println("_________________________");

        System.out.println("Index of Gabriel: "+ list.indexOf("Gabriel")); // procurando a posicao do 'Gabriel' na lista
        System.out.println("Index of Marcos: "+list.indexOf("Marcos"));// caso nao ache o elemento na lista retorna -1

        System.out.println("---------------");

        list.add("Joao");
        list.add("Fernando");
        list.add("Maycon");
        list.add("Fael");
        list.add("Flavio");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());
        /*
        Aqui a gente pega uma lista 'list', convertemos para '.stream', filtramos usando uma lambda .filter(x -> x.charAt(0) == 'F'),
        para pegar todas as palavras que comecao com a letra 'F' e salvamos e 'result', depois voltamos o 'list' para o tipo String usando o
         '.collect(Collectors.toList())'.
        */
        for (String x: result){
            System.out.println(x);
        }

        System.out.println("---------------");

        String name1 = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        String name2 = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        /*
        Aqui a gente pegar o primeiro elemento que comeca com a letra 'M' .findFirst(), caso não aja um elemento que comece com a letra 'M',
        ele vai retornar null .orElse(null)
        */

        System.out.println(name1);
        System.out.println(name2);
    }
}