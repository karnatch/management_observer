package management;

public class Worker {
	private String name;
	private Department department = new Department();
	
	public Worker(String name) {
		super();
		this.name = name;
	}
	public void notification() {
		System.out.println("Morning, " + name + " " + department.title);
	}
	public void joinDepartment(Department dept) {
		department = dept;
	}
}