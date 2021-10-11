package aop.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import hibernate_test.entity.Employee;
import org.hibernate.cfg.Configuration;

public class Get_Hibernate {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Oleh", "Ostapyuk", "HR", 700);
            session.beginTransaction();
            session.save(emp);
//            session.getTransaction().commit();

            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(employee);

            System.out.println("done");
        }
        finally{
            factory.close();
        }
    }
}