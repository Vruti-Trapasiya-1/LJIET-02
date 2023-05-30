
package java2;
import java.util.*;
import java.util.Scanner;

public class circle {
	double area;
	double circumference;
	double PI ;
	int radius;
	
	public void calculate_area()
	{
		System.out.println("Enter the radius");
		Scanner sc =new Scanner(System.in);
		radius=sc.nextInt();
		PI=3.14;
		area=PI*radius*radius;
		System.out.println("area is:"+area);
		
	}
	public static void main(String[] args)
	{
		circle c1=new circle();
		c1.calculate_area();
	}
	
	
}
