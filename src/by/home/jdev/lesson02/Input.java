package by.home.jdev.lesson02;

import java.util.Scanner;

public class Input {
	public int inputInt4Digits() { 
		 int number; 
		 System.out.println("������� ������������� �����"); 
		 Scanner scanner = new Scanner(System.in); 
		 while (true) { 
			 if (scanner.hasNextInt()) {
				 number = scanner.nextInt();
				 if (number >= 1000 && number <= 9999) {
					 return number; 
				 }
			 }
			 scanner.nextLine(); 
		 System.out.println("���������� ������ ����� ������������� �����, ������� �����: "); 
		 } 
	}
	public double inputDouble(String description) { 
		 double number; 
		 System.out.println(description); 
		 Scanner scanner = new Scanner(System.in); 
		 while (!scanner.hasNextDouble()) { 
			 scanner.nextLine(); 
			 System.out.println("���������� ������ ����� ���� double, ������� �����: "); 
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
			 System.out.println("���������� ������ ����� �����, ������� �����: "); 
		 }
		 number = scanner.nextInt();
		 return number;
	}	
}
