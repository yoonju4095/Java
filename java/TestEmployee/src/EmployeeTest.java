
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1, e2, e3;
		e1 = new Employee("��ö��",30000);
		e2 = new Employee("��ö��",25000);
		e3 = new Employee("���ö",50000);
		
		int n = Employee.getCount();
		System.out.println("��ü ���� �� = " + n);
	}

}
