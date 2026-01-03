import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        restaurant.addMenuItem(new MenuItem(1, "Pizza", 2500, "Food"));
        restaurant.addMenuItem(new MenuItem(2, "Burger", 1800, "Food"));
        restaurant.addMenuItem(new MenuItem(3, "Cola", 700, "Drink"));

        while (true) {
            System.out.println("""
            1. Show menu
            2. Search item
            3. Sort by price
            4. Exit
            """);

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                restaurant.showMenu();
            } else if (choice == 2) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.println(restaurant.searchByName(name));
            } else if (choice == 3) {
                restaurant.sortByPrice();
                System.out.println("Menu sorted by price.");
            } else {
                break;
            }
        }
    }
}
