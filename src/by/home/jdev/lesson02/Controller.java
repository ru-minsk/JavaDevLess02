package by.home.jdev.lesson02;

public class Controller {
	public static void main(String[] args) {
		 Input input = new Input(); 
		 Logic logic = new Logic(); 
		 View view = new View(); 
		 
		int choice=input.inputInt("Введите  номер задачи от 1-го до 4-х ");
		switch(choice) {
			case 1:
				// Task 01 
				{
					int x = input.inputInt4Digits();
					boolean rezult = logic.runTask1(x);
					view.outputToConsole("(Сумма двух первых цифр == сумме двух последних цифр) = ", rezult);	
				}
				break;
			case 2:
				// Task 02
				{
					double a, b, c;
					a=input.inputDouble("Введите вещественное число a: ");
					b=input.inputDouble("Введите вещественное число b: ");
					c=input.inputDouble("Введите вещественное число c: ");
					double rezult=logic.runTask2(a, b, c);
					view.outputToConsole("Результат вычисления выражения по формуле =", rezult);
				}
				break;
			case 3:
				// Task 03
				{
					double a, b;
					a=input.inputDouble("Введите длину катета a: ");
					b=input.inputDouble("Введите длину катета b: ");
					double rezult1=logic.runTask3_1(a, b);
					double rezult2=logic.runTask3_2(a, b);
					view.outputToConsole("Периметр треугольника =", rezult1);	
					view.outputToConsole("Площадь треугольника =", rezult2);
				}
				break;
			case 4:	
				// Task 04
				{
					double x, y;	
					x=input.inputDouble("Введите координату x типа double: ");
					y=input.inputDouble("Введите координату y типа double: ");
					boolean rezult = logic.runTask4(x,y);
					view.outputToConsole("Точка принадлежит области =", rezult);	
				}
				break;
			default:
				//	System.out.println("Задачи с таким номером нет");	
		}  // end switch
		//	System.out.println("Закончили выполнение");	
	}
}
