package by.home.jdev.lesson02;

public class Logic {
	public boolean runTask1(int x) { 		
		int x1=x/1000; 					// первая цифра
		int x2=(x-x1*1000)/100;			// вторая цифра
		int x3=(x-x1*1000-x2*100)/10;	// третья цифра
		int x4=(x-x1*1000-x2*100-x3*10);// четвертая цифра
		return (x1+x2==x3+x4); 
	} 
	
	public double runTask2(double a, double b, double c) { 		
		double rezult=(b+Math.sqrt(Math.pow(b, 2)+4*a*c))/(2*a)-Math.pow(a, 3)*c+Math.pow(b, -2);
		return rezult; 
	} 	
	
	public double runTask3_1(double a, double b) { 		
		double rezult=a + b + Math.sqrt(a * a + b * b);
		return rezult; 
	} 
	public double runTask3_2(double a, double b) { 		
		double rezult=a * b / 2.0;
		return rezult; 
	} 
	
	public boolean runTask4(double x, double y) { 		
		return (Math.abs(x)<=4 && y<=4 && y>=-3); 
	} 	
}
