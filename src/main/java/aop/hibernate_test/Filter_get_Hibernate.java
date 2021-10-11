package aop.hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Filter_get_Hibernate {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> emps = session.createQuery("from Employee").getResultList();
            List<Employee> emps = session.createQuery("from Employee "+
                    "where name = 'Oleksander' AND salary>650").getResultList();
            for(Employee e: emps)
                System.out.println(e);

            session.getTransaction().commit();

            System.out.println("done");
        }
        finally{
            factory.close();
        }
    }
}