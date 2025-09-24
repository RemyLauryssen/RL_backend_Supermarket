import org.w3c.dom.ls.LSOutput;

public class SuperMarket {
    Product bread;
    Product fruit;
    Product cheese;
    Product toiletPaper;
    Product fake;

    public SuperMarket(Product bread, Product fruit, Product cheese, Product toiletPaper, Product fake) {
        this.bread = bread;
        this.fruit = fruit;
        this.cheese = cheese;
        this.toiletPaper = toiletPaper;
        this.fake = fake;

    }

    public void buyItem(Product product, int amount) {
        if (amount <= product.amount) {
            System.out.println("You bought " + amount + " " + product.name + " for " + product.price * amount + " euros.");
            product.amount = product.amount - amount;
//            System.out.println("New stock: " + product.amount);
        } else {
            System.out.println("You cannot buy " + amount + " " + product.name + ", we only have " + product.amount + " " + product.name + " in stock.");
        }
    }

    public void buyBread(int amount) {
        buyItem(this.bread, amount);
    }

    public void buyFruit(int amount) {
        buyItem(this.fruit, amount);
    }

    public void buyCheese(int amount) {
        buyItem(this.cheese, amount);
    }

    public void buyToiletPaper(int amount) {
        buyItem(this.toiletPaper, amount);
    }

    public void buyFake(int amount) {
        buyItem(this.fake, amount);
    }

}
