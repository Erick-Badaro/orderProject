import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = null;

        System.out.println("Enter client data: ");
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY:)");
        String birthDateStr = sc.nextLine();
        birthDate = sdf.parse(birthDateStr);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.println("Status");
        String status = sc.nextLine();
        System.out.println("How many items to this order?");
        int items = sc.nextInt();
        sc.nextLine();
        Order order = new Order(new Date(), OrderStatus.valueOf(status.toUpperCase()), client);

        for (int i = 1; i <= items; i++){
            System.out.println("Enter #" +i + " item data:");
            System.out.println("Product Name:");
            String nameProduct = sc.nextLine();
            System.out.println("Product price:");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity:");
            int quantity = sc.nextInt();
            sc.nextLine();
            Product product = new Product(nameProduct, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
        }
    }
