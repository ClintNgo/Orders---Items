import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {

        Items item1 = new Items();
        item1.name = "mocha";
        item1.price = 3.5;
        Items item2 = new Items();
        item2.name = "latte";
        item2.price = 4.5;
        Items item3 = new Items();
        item2.name = "drip coffee";
        item2.price = 2.5;
        Items item4 = new Items();
        item2.name = "capuccino";
        item2.price = 4;

        Orders order1 = new Orders();
        System.out.println(order1.total);
        order1.name = "Cindhuri";
        Orders order2 = new Orders();
        order2.name = "Jimmy";
        Orders order3 = new Orders();
        order3.name = "Noah";
        Orders order4 = new Orders();
        order4.name = "Sam";


        order2.items.add(item1.name);
        order2.total += item1.price;
        order3.items.add(item4.name);
        order3.total += item4.price;
        order4.items.add(item2.name);
        order4.total += item2.price;
        order1.ready = true;
        order4.items.add(item2.name);
        order4.items.add(item2.name);
        order4.total += item2.price * 2;
        order2.ready = true;

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}