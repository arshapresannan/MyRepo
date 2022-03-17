package egprograms;

import java.util.Scanner;

public class PrgmAreaOfFigures {

	public static void main(String[] args) {
		
		Scanner c=new Scanner(System.in);
		System.out.println("(a) Area of Circle ");
		System.out.println("(b) Area of Rectangle ");
		System.out.println("(c) Area of Square ");
		System.out.println("Please select your choice: ");
		char ch=c.next().charAt(0);
		
		switch(ch)
		{
		case 'a':System.out.println("Enter the radius of the circle:");
				 double r =c.nextDouble();
				 double carea=(22*r*r)/7;
				 System.out.println("Area of the Circle is: "+carea);
				 break;
		
		case 'b':System.out.println("Enter the length of the rectangle:");
		 		 double l =c.nextDouble();
		 		 System.out.println("Enter the breadth of the rectangle:");
		 		 double b =c.nextDouble();
		 		 double rarea=l*b;
		 		 System.out.println("Area of the Rectangle is: "+rarea);
		 		 break;
		 		 
		case 'c':System.out.println("Enter the side of the square:");
		 		 double s =c.nextDouble();
		 		 double sarea=s*s;
		 		 System.out.println("Area of the Square is: "+sarea);
		 		 break;
		 		 
		 default:System.out.println("Invalid Choice");
		}
		

	}

}
