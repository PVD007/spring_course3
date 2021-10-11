package aop.hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete_Hibernate {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();


//Employee emp = session.get(Employee.class, 1);
//session.delete(emp);
            session.createQuery(("delete Employee where name = 'Oleksander'")).executeUpdate();


//emp.setName("Ivan");
//emp.setSurname("Kondratenko");
//emp.setSalary(1500);

            session.getTransaction().commit();

            System.out.println("done");
        }
        finally{
            factory.close();
        }
    }
}