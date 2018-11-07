import java.util.ArrayList;
import java.util.List;

public class Calculator {
	List<Integer> calc = new ArrayList<Integer>();
	

	public Calculator() {
		
		
	}
	public void loadConstant(int i) {
		calc.add(i);
	}
	public String toString() {
		if (calc.isEmpty() == true) {
			return "[].";
			}
		else {
			return calc.toString().replace(",", "").replace(",", "").replaceAll("]", "].");
		}
		
			
		}
	
	public void add() {
		
		
	}
	public void divide() {
		
	}
	public void multiply() {
		
	}
	public void subtract() {
		
	}
	public int total() {
		return 0;
	}
}
