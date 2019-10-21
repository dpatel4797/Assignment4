package ValidTriangleTester.Java;
import java.util.Scanner;

public class ValidTriangleTester {

	public static void main(String[] args) {
		
		System.out.println("Valid Triangle Tester");
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter Side 1's length: ");
		int s1 = scn.nextInt();
		System.out.println("Please enter Side 2's length: ");
		int s2 = scn.nextInt();
		System.out.println("Please enter Side 3's length: ");
		int s3 = scn.nextInt();
		System.out.println("The length of each side of your test shape is:");
		System.out.println("Side 1:"+ s1);
		System.out.println("Side 2:"+ s2);
		System.out.println("Side 3:"+ s3);
		
		if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
			System.out.print("This is a valid triangle!");
			
			if(s1==s2 && s2==s3 && s3==s1) {
				System.out.print("\nThis is a equilateral triangle.");
				
			}else if(s1!=s2 && s2!=s3 && s3!=s1 ) {
				
				System.out.print("\nThis is a Scalene triangle.");
				
			}else {
				
				System.out.println("This is a Isosceles triangle.");
			}
			
		}else {
			
			System.out.println("This is not a valid triangle!");
			
		}
		
		
	}

}

