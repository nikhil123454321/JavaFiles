import java.util.ArrayList;
import java.util.stream.Stream;


public class MainClass {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(111, 15000, "ABC"));
		empList.add(new Employee(112, 15040, "DEF"));
		empList.add(new Employee(113, 15400, "QWE"));
		empList.add(new Employee(111, 15000, "ABC"));
		empList.add(new Employee(113, 15400, "QWE"));
		empList.add(new Employee(114, 15007, "QTY"));
		
		Stream<Employee> Stream1 = empList.stream();
		Stream<Employee> Stream2 = Stream1.distinct();
		Stream<Employee> Stream3 = Stream2.filter((employee)->employee.getFname().startsWith("Q"));
		//System.out.println(Stream3.count());
		Stream3.forEach(employee->System.out.println(employee.getEmpId()));
		
		/*empList.stream()
		.distinct()
		.filter((employee)->employee.getFname().startsWith("Q"))
		.forEach(employee->System.out.println(employee.getEmpId()));*/
	}
}
