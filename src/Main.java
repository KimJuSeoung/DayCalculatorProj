import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year : ");
		int year = sc.nextInt();
		System.out.print("Enter Month : ");
		int month = sc.nextInt();
		System.out.print("Enter Day : ");
		int day = sc.nextInt();
		
		DayCalculator dayCalculator = new DayCalculator();
		System.out.println(dayCalculator.getDay(year, month, day));
		
	}

}
