import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rent[] rents = new Rent[10];

        System.out.println("How many rooms will be rented?");
        int n = scanner.nextInt();

        for (int i=0;i<n;i++){
            System.out.println();
            System.out.println("Rent #"+(i+1)+":");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.next();
            System.out.print("Email: ");
            String email= scanner.next();
            System.out.print("Room: ");
            int numberRoom = scanner.nextInt();

            rents[numberRoom] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i=0;i<10;i++){
            if (rents[i]!=null){
                System.out.println(i +": "+ rents[i].getName()+","+ rents[i].getEmail());
            }
        }

        scanner.close();
    }
}