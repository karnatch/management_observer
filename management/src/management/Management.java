package management;

public class Management {
	public static void main(String[] args)
	{
		Department SysDev = new Department();
		Worker wor1 = new Worker("Elon");
		Worker wor2 = new Worker("Jeff");
		Worker wor3 = new Worker("Carter");
		
		SysDev.join(wor1);
		SysDev.join(wor2);
		SysDev.join(wor3);
		
		wor1.joinDepartment(SysDev);
		wor2.joinDepartment(SysDev);
		wor3.joinDepartment(SysDev);
		
		SysDev.upload("Leave Notice. Due to the unachieved goals, there will be no leaves this month");
	}
}