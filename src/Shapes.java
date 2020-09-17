
public class Shapes {
	private String shapeName;
	private int dim1;
	private int dim2;
	
	public int calcArea(String shapeName,int dim1, int dim2) {
		
		return shapeName.equalsIgnoreCase("square")?dim1*dim1:dim1*dim2;
	}
}
