package miniproject_MenuCard;

import java.util.Scanner;

public class FoodOrder {
	// lets declare variable for prices of food items
	int frenchFries = 100;
	int burger = 120;
	int pastry = 100;
	int pizza = 200;
	int coldcoffiee = 100;
	int colddrink = 80;
	int icetea = 80;
	int ch;
	int quantity;
	static int total;
	String again;

	Scanner sc = new Scanner(System.in);

//lets create method for displaying our food menu

	public void displayMenu() {
		System.out.println("**********Welcome To Our Cafe**********");
		System.out.println("=======================================");
		System.out.println("          1.FrenchFries           100/-");
		System.out.println("          2.Burger                120/-");
		System.out.println("          3.Pastry                100/-");
		System.out.println("          4.Pizza                 200/-");
		System.out.println("          5.ColdCoffee            100/-");
		System.out.println("          6.ColdDrink              80/-");
		System.out.println("          7.Icetea                 80/-");
		System.out.println("          8.Exit                       ");
		System.out.println("=======================================");
		System.out.println("What Do You Want To Order ?");
	}

//lets create a method to generate bill
	public void generateBill() {
		System.out.println();
		System.out.println("**********Thank You For Ordering**********");
		System.out.println("**********your Bill is : " + total + "**********");
	}

//Lets create a method to order a food item
	public void order() {
		while (true) {
			System.out.println(" Enter Your Choice ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:// FrenchFreis
				System.out.println("You Have Selected FrenchFries");
				System.out.println();
				System.out.println("Enter the desiered Quantity");
				quantity = sc.nextInt();
				total = total + quantity * frenchFries;
				break;

			case 2:// Burger
				System.out.println("You Have Selected Burger");
				System.out.println();
				System.out.println("Enter the desiered Quantity");
				quantity = sc.nextInt();
				total = total + quantity * burger;
				break;

			case 3:// Pastry
				System.out.println("You Have Selected Pastry");
				System.out.println();
				System.out.println("Enter the desiered Quantity");
				quantity = sc.nextInt();
				total = total + quantity * pastry;
				break;

			case 4:// Pizz
				
				
				
				a
				System.out.println("You Have Selected Pizza");
				System.out.println();
				System.out.println("Enter the desiered Quantity");
				quantity = sc.nextInt();
				total = total + quantity * pizza;
				break;

			case 5:// ColdCoffee
				System.out.println("You Have Selected ColdCoffee");
				System.out.println();
				System.out.println("Enter the desiered Quantity");
				quantity = sc.nextInt();
				total = total + quantity * coldcoffiee;
				break;

			case 6:// ColdDrink
				System.out.println("You Have Selected ColdDrink");
				System.out.println();
				System.out.println("Enter the desiered Quantity:");
				quantity = sc.nextInt();
				total = total + quantity * colddrink;
				break;

			case 7:// IceTea
				System.out.println("You Have Selected IceTea");
				System.out.println();
				System.out.println("Enter the desiered Quantity:");
				quantity = sc.nextInt();
				total = total + quantity * icetea;
				break;

			case 8:// Exit
				System.exit(1);
				break;

			default:
				break;

			}
			System.out.println();
			System.out.println("Do You Wish To Order Anything Else(Y/N): ");
			again = sc.next();
			if (again.equalsIgnoreCase("Y")) {
				order();
			} else if (again.equalsIgnoreCase("N")) {
				generateBill();
				System.exit(1);
			} else {
				System.out.println("Invalid Choice");
			}
		}
	}
}
