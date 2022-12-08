package Lab3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of products you want to enter: ");
        int n = Integer.parseInt(sc.nextLine());
        Products[] p = new Products[n];

        for (int i = 0; i < n; i++) {
            p[i] = new Products();
            System.out.println("=== PRODUCT " + (i + 1) + " ===");
            System.out.print("Product code: ");
            String productCode = sc.nextLine();
            p[i].setProductCode(productCode);

            System.out.print("Name: ");
            String name = sc.nextLine();
            p[i].setName(name);

            System.out.print("Describe: ");
            String describe = sc.nextLine();
            p[i].setDescribe(describe);

            System.out.print("Amount: ");
            int amount = Integer.parseInt(sc.nextLine());
            p[i].setAmount(amount);

            System.out.print("Price: ");
            int price = Integer.parseInt(sc.nextLine());
            p[i].setPrice(price);

            System.out.print("Product Type: ");
            String productType = sc.nextLine();
            p[i].setProductType(productType);

        }
        System.out.print("\n \nName product you want to find: ");
        String findName = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (p[i].getName().contains(findName)) {
                System.out.println("\nBelow this products information you want to find");
                System.out.println(p[i].output());
            }
        }

    }

}
