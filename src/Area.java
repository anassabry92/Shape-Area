import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Shapes shape = new Shapes();
		
		System.out.println("Enter shape name: ");
		
		Scanner scan = new Scanner(System.in);
		
		String shapeName = scan.next();
		
		System.out.println("Enter first dim: ");
		int dim1 = scan.nextInt();
		
		int dim2 = 0;
		
		if(shapeName.equalsIgnoreCase("square")) {
			dim2 = dim1;
		}else {
			System.out.println("Enter second dim: ");
			dim2 = scan.nextInt();
		}
		
		System.out.println(shape.calcArea(shapeName, dim1, dim2));
	}

}
