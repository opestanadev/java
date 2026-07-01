package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Employee #%d:%n", (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(employees, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for(Employee obj : employees) {
            System.out.println(obj);
        }

        sc.close();

        /* OBSERVAÇÕES (São mais para mim do que para quem está lendo isso)
        *
        *  Tive um pouco de dificuldade com listas e na resolução do exercício, tendo que pegar a maior parte da solução, presente neste repositório: https://github.com/acenelio/list1-java/tree/master.
        *
        *  Conclusão: Revisar este conteúdo quantas vezes necessárias para fixá-lo.
        * */
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
