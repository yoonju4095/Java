
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1, e2, e3;
		e1 = new Employee("±èÃ¶¼ö",30000);
		e2 = new Employee("¹ÚÃ¶¼ö",25000);
		e3 = new Employee("±è¼öÃ¶",50000);
		
		int n = Employee.getCount();
		System.out.println("ÀüÃ¼ Á÷¿ø ¼ö = " + n);
	}

}
