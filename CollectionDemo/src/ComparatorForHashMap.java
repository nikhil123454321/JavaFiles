import java.util.Comparator;


public class ComparatorForHashMap implements Comparator<Associate>{

	@Override
	public int compare(Associate a1, Associate a2) {
		return a1.getSalary()-a2.getSalary();
	}
	
}
