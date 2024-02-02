
public class Main {
    public static void main(String[] args) {

        String[] vect = new String[] {"Gabriel", "Maria"};

        for (int i=0;i<vect.length;i++){
            System.out.println(vect[i]);
        }

        System.out.println("---------------------------------------------");

        for (String obj : vect){ //Como se lê: Para cada objeto 'obj' contido em vect, faça
            System.out.println(obj);
        }
    }
}