import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<Employee> employees = new ArrayList<Employee>();

        System.out.println("How many employees will be registered?");
        int n = scanner.nextInt();

        for (int i=0; i<n;i++){
            scanner.nextLine();
            System.out.println("Emploee #"+(i+1));
            System.out.println("Id: ");
            Integer id = scanner.nextInt();
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Salary: ");
            Double salary = scanner.nextDouble();

            employees.add(new Employee(id,name,salary));

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();
        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee obj : employees) {
            System.out.println(obj);
        }

        scanner.close();
    }
}