package oct10task;

public class Employee implements Salary , Leave {

	@Override
	public int leave() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int empId() {
		// TODO Auto-generated method stub
		return 111;
	}

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 900000;
	}
	public static void main(String args[])
	{
		Employee e = new Employee();
		System.out.println("No of leaves "+e.leave());
		
	}

}
