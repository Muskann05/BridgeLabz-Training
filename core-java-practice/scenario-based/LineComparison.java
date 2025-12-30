import java.util.*;
public class LineComparison {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to Line Comparison Computation Program ");
        System.out.println("write the (x1, y1) co-ordinates of line1: ");
        // take x1,y1 input for line 1
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        // take x2,y2 input for line 1
        System.out.println("write the (x2, y2) co-ordinates of line1: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        // take x3,y3 input for line 2
        System.out.println("write the (x3, y3) co-ordinates of line2: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        // take x4,y4 input for line 2
        System.out.println("write the (x4, y4) co-ordinates of line2: ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        // UC 1 calculate its length

        int line1_length = calculateLength(x1,y1,x2,y2);
        int line2_length=calculateLength(x3,y3,x4,y4);
        System.out.println("the length of the line1 is: " +line1_length);
        System.out.println("the length of the line2 is: " +line2_length);

        // UC 2 check the equality

        if(line1_length==line2_length) {
        	System.out.println("Both line1 and line2 are equal");
        }

        // UC 3 check if the line are not equal than it is greater or lesser than other line
        else if(line1_length>line2_length) {
        	System.out.println("Line1 is greater than line2");
        }
        else {
        	System.out.println("Line1 is lesser than line2");
        }
        
	}
	public static int calculateLength(int x1,int y1,int x2,int y2) {
		int length=(int)Math.sqrt((int)Math.pow(x2-x1,2)+(int)Math.pow(y2-y1,2));
		return length;
	}

}
