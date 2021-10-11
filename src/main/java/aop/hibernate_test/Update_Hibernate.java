package aop.hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Update_Hibernate {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("update Employee set salary=1000 where name= 'Oleksander'")
                    .executeUpdate();

//Employee emp = session.get(Employee.class, 3);
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