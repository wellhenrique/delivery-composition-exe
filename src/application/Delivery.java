package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Delivery {

  public static void main(String[] args) throws ParseException {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter client data:");
    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Email: ");
    String email = sc.next();

    System.out.print("Birth date (DD/MM/YYYY): ");
    Date birthDate = sdf.parse(sc.next());

    Client client = new Client(name, email, birthDate);

    System.out.println("Enter order data:");
    System.out.print("Status: ");
    OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

    Order order = new Order(new Date(), orderStatus, client);

    System.out.print("How many items to this order? ");
    int value = sc.nextInt();

    for (int i = 0; i < value; i++) {
      System.out.println("Enter #" + (i + 1) + " item data:");
      System.out.print("Product name: ");
      sc.nextLine();
      String productName = sc.nextLine();

      System.out.print("Product price: ");
      double productPrice = sc.nextDouble();

      System.out.print("Product quantity: ");
      int quantity = sc.nextInt();

      Product product = new Product(productName, productPrice);

      OrderItem orderItem = new OrderItem(quantity, productPrice, product);

      order.addOrderItem(orderItem);
    }

    System.out.println(order);

    sc.close();
  }
}
