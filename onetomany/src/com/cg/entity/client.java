package com.cg.entity;

		import javax.persistence.EntityManager;
		import javax.persistence.EntityManagerFactory;
		import javax.persistence.Persistence;
		

		public class client {

			public static void main(String[] args) {
				EntityManagerFactory factory  = Persistence.createEntityManagerFactory("JPA-PU");
				EntityManager manager = factory.createEntityManager();
				
				manager.getTransaction().begin();
				department department = new department();
				department.setId(1);
				department.setName("ECE");
				
				employee employee=new employee();
				employee.setId(11);
				employee.setName("Tarun");
				employee.setSalary(100000);
				
				
				department.addEmployee(employee);
				
				manager.persist(department);
				
				manager.getTransaction().commit();
				System.out.println("done");
				manager.close();
				factory.close();
			

	}

}
