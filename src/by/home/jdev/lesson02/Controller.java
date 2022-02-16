package by.home.jdev.lesson02;

public class Controller {
	public static void main(String[] args) {
		 Input input = new Input(); 
		 Logic logic = new Logic(); 
		 View view = new View(); 
		 
		int choice=input.inputInt("�������  ����� ������ �� 1-�� �� 4-� ");
		switch(choice) {
			case 1:
				// Task 01 
				{
					int x = input.inputInt4Digits();
					boolean rezult = logic.runTask1(x);
					view.outputToConsole("(����� ���� ������ ���� == ����� ���� ��������� ����) = ", rezult);	
				}
				break;
			case 2:
				// Task 02
				{
					double a, b, c;
					a=input.inputDouble("������� ������������ ����� a: ");
					b=input.inputDouble("������� ������������ ����� b: ");
					c=input.inputDouble("������� ������������ ����� c: ");
					double rezult=logic.runTask2(a, b, c);
					view.outputToConsole("��������� ���������� ��������� �� ������� =", rezult);
				}
				break;
			case 3:
				// Task 03
				{
					double a, b;
					a=input.inputDouble("������� ����� ������ a: ");
					b=input.inputDouble("������� ����� ������ b: ");
					double rezult1=logic.runTask3_1(a, b);
					double rezult2=logic.runTask3_2(a, b);
					view.outputToConsole("�������� ������������ =", rezult1);	
					view.outputToConsole("������� ������������ =", rezult2);
				}
				break;
			case 4:	
				// Task 04
				{
					double x, y;	
					x=input.inputDouble("������� ���������� x ���� double: ");
					y=input.inputDouble("������� ���������� y ���� double: ");
					boolean rezult = logic.runTask4(x,y);
					view.outputToConsole("����� ����������� ������� =", rezult);	
				}
				break;
			default:
				//	System.out.println("������ � ����� ������� ���");	
		}  // end switch
		//	System.out.println("��������� ����������");	
	}
}
