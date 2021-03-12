package com.ltts.mave.hiderproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        employee  e=new employee(); 
        e.setId(124);
        e.setName("vishal");
        e.setRole("Intern");
        session.save(e);
        t.commit();
        factory.close();
        session.close();
        
        
    }
}
