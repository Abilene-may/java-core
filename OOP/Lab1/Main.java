package Lab1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Salary: ");
        double salary = Integer.parseInt(sc.nextLine());

        System.out.print("Phone: ");
        String phone = sc.nextLine();
        while (phone.length() < 9 || phone.length() > 10){
            System.out.println("Invalid phone number. Please re-enter.");
            System.out.print("Phone: ");
            phone = sc.nextLine();
        }

        Employee e = new Employee(name, salary, phone);
        System.out.println(" ");
        System.out.println("What part do you want to show? \n" +
                            "1. Name \n" + 
                            "2. Salary \n" + 
                            "3. Phone \n");
        System.out.print("Your choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                System.out.println(e.getName());
                break;
            case 2:
                Vali v1 = (Vali) new ValiDate();
                System.out.println(v1.f1(e));
                break;
            case 3:
                Vali v2 = (Vali) new ValiDate();
                System.out.println(v2.f2(e));
                break;
        }



    }
    
}
