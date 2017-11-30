package firstHibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {
		  
	public static int register(Employee emp) 
	{
	
		Configuration cfg = new Configuration();
		cfg.configure("employee.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction t =  session.beginTransaction();
		
		Employee emp1 = new Employee("Milind","Jain","vasumilind11",1);
		Employee emp2 = new Employee("Anuj","Jain","vasumilind",2);
		session.save(emp1);
	    
	    
		t.commit();
	
		session.close();
		System.out.println("succesfully saved");
		return 0;
		
		
	}}

