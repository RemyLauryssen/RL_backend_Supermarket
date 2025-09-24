import java.util.Objects;

public class Customer {
    public String customerName;
    public SuperMarket superMarket;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void goToSuperMarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    public void buyItem(String productName, int amount) {
        if (Objects.equals(productName, superMarket.bread.name)) {
            superMarket.buyBread(amount);

        } else if (Objects.equals(productName, superMarket.fruit.name)) {
            superMarket.buyFruit(amount);

        } else if (Objects.equals(productName, superMarket.cheese.name)) {
            superMarket.buyCheese(amount);
        } else if (Objects.equals(productName, superMarket.toiletPaper.name) || Objects.equals(productName, "toiletpaper")) {
            superMarket.buyToiletPaper(amount);
        } else if (Objects.equals(productName, superMarket.fake.name) || productName == null) {
            System.out.println("Product name is invalid.");
        } else {
            System.out.println("Not in stock; please try a different product.");
        }

    }
}
