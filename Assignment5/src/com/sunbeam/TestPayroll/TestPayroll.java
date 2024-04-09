package com.sunbeam.TestPayroll;

import com.sunbeam.SalaryPayroll.*;

public class TestPayroll {

	public static void main(String[] args) {
		
		SalariedEmp SalEmp = new SalariedEmp("Donald","Joshi","SSN111",50000);
		ChbEmployee HrlyEmp = new ChbEmployee("Narendra","Modi","SSN222",100,40);
		ChbEmployee HrlEmp = new ChbEmployee("Tom","Hanks","SSN333",100,47);
		CommEmp CommissionEmp = new CommEmp("Ramdas","Athavle","SSN444",25000,0.075);
		BaseCommEmp BaseplusCommEmp = new BaseCommEmp("Dada","Kondake","SSN555",15000,0.04,10000);
		
		System.out.println(SalEmp.toString());
		System.out.println(HrlyEmp.toString());
		System.out.println(HrlEmp.toString());
		System.out.println(CommissionEmp.toString());
		System.out.println(BaseplusCommEmp.toString());
		
		Employee[] emp = new Employee[5];
		
		emp[0] = SalEmp;
		emp[1] = HrlyEmp;
		emp[2] = HrlEmp;
		emp[3] = CommissionEmp;
		emp[4] = BaseplusCommEmp;
		
		for(Employee nowEmp:emp)
		{
			System.out.println(nowEmp);
			if(nowEmp instanceof BaseCommEmp)
			{
				BaseCommEmp E = (BaseCommEmp) nowEmp;
				E.setBaseSal(1.10*E.getBaseSal());
				System.out.println("New salary with 10% reward - "+E.Earnigs());
			}
		}
		for(int i = 0;i<emp.length;i++)
			emp[i].getClass().getName();
	}

}
