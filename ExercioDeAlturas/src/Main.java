
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas vão ser digitadas?");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        double[] alturas = new double[n];
        int[] idades = new int[n];


        for (int i=0;i<n;i++){
            System.out.println("Digite da "+(i+1)+" a pessoa:");
            System.out.println("Nome: ");
            nomes[i] = scanner.next();
            System.out.println("Idade: ");
            idades[i] = scanner.nextInt();
            System.out.println("Altura: ");
            alturas[i] = scanner.nextDouble();
        }

        double soma= 0.0;
        for (int i=0;i<n;i++){
            soma+=alturas[i];
         }
        double mediaAltura= soma/n;

        System.out.printf("");
        System.out.printf("Altura media: %.2f%n", mediaAltura);

        int cont=0;
        for(int i=0;i<n;i++){
            if(idades[i]<16){
                cont++;
            }
        }

        double porcentagem =(cont*100.0)/n;

        System.out.printf("Pessoa com menos de 16 anos: %.1f%%%n", porcentagem);

        for (int i=0; i<n;i++){
            if (idades[i]<16){
                System.out.println(nomes[i]);
            }
        }

        scanner.close();
    }
}