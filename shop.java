import java.util.Scanner;
public class shop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String item;
		double price;
		int amount;
		char currency = '$';
		double total;

		System.out.println("What you gonna get it?");
		item = sc.nextLine();
		System.out.println("The price of the "+item);
		price = sc.nextDouble();
		System.out.println("How much you gonna get?");
		amount = sc.nextInt();

		total = price * amount;

		System.out.printf("You are buying %s, the quantity is %d, the price is %c%.2f", item, amount, currency, total);
		sc.close();
	}
}
