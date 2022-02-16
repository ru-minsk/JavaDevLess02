package by.home.jdev.lesson02;

import java.util.Scanner;

public class Input {
	public int inputInt4Digits() { 
		 int number; 
		 System.out.println("Ââåäèòå ÷åòûğ¸õçíà÷íîå ÷èñëî"); 
		 Scanner scanner = new Scanner(System.in); 
		 while (true) { 
			 if (scanner.hasNextInt()) {
				 number = scanner.nextInt();
				 if (number >= 1000 && number <= 9999) {
					 return number; 
				 }
			 }
			 scanner.nextLine(); 
		 System.out.println("Íåîáõîäèìî ââåñòè öåëîå ÷åòûğ¸õçíà÷íîå ÷èñëî, ââîäèòå ñíîâà: "); 
		 } 
	}
	public double inputDouble(String description) { 
		 double number; 
		 System.out.println(description); 
		 Scanner scanner = new Scanner(System.in); 
		 while (!scanner.hasNextDouble()) { 
			 scanner.nextLine(); 
			 System.out.println("Íåîáõîäèìî ââåñòè ÷èñëî òèïà double, ââîäèòå ñíîâà: "); 
		 }
		 number = scanner.nextDouble();
		 return number;
	}	
	public int inputInt(String description) { 
		 int number; 
		 System.out.println(description); 
		 Scanner scanner = new Scanner(System.in); 
		 while (!scanner.hasNextInt()) { 
			 scanner.nextLine(); 
			 System.out.println("Íåîáõîäèìî ââåñòè öåëîå ÷èñëî, ââîäèòå ñíîâà: "); 
		 }
		 number = scanner.nextInt();
		 return number;
	}	
}
