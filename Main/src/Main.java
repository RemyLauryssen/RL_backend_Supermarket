import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product bread = new Product("bread", 1.25, 400);
        Product fruit = new Product("fruit", 4.00, 600);
        Product cheese = new Product("cheese", 6.35, 150);
        Product toiletPaper = new Product("toilet paper", 4.25, 300);
        Product fake = new Product("fake", 0, 0);

        SuperMarket superMarket = new SuperMarket(bread, fruit, cheese, toiletPaper, fake);
        Customer customer = new Customer("Piet Pietersen");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which product do you want to buy?");
        String productName = scanner.nextLine().trim().toLowerCase();
        System.out.println("How many do you want to buy?");
        int amount = scanner.nextInt();
        customer.goToSuperMarket(superMarket);
        customer.buyItem(productName, amount);
    }
}
