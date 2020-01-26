package com.docsconsole.tutorials.hibernate5.client;

import org.hibernate.Session;

import com.docsconsole.tutorials.hibernate5.entity.Employee;
import com.docsconsole.tutorials.hibernate5.entity.Organization;
import com.docsconsole.tutorials.hibernate5.utils.HibernateUtils;

public class MainClient {
	
	
	public static void main(String[] args) {
		System.out.println("the main method");

		Session session = HibernateUtils.getSessionFactory().openSession();

		// obtains the session
		session.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpName("Jan");
		emp.setEmpSal(new Long(100000));
		
		//Add new Employee object
		Organization org = new Organization();
		org.setOrgName("Google Inc");
		
		emp.setOrganization(org);
		//Save Employee
		session.save(emp);

		session.getTransaction().commit();
		session.close();
	}
}
