import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(29);
        list.add(30);
        list.add(5);

        for (Integer x : list){
            System.out.println(x);
        }

        System.out.println(list.size());

        System.out.println("-------------------------------------------");

        list.add(1, 40);

        for (Integer x : list){
            System.out.println(x);
        }

        System.out.println(list.size());

        System.out.println("------------------------------------------------");

        list.remove(1);

        for (Integer x : list){
            System.out.println(x);
        }

        System.out.println(list.size());

    }
}