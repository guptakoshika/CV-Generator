
package cv.generator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class dbconnect{
    
    void savedata(cv c)
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionfac = cfg.buildSessionFactory();
        Session s = sessionfac.openSession();
        Transaction t = s.beginTransaction();
        s.save(c);
        t.commit();
        s.close();
        sessionfac.close();
    }
    cv fetch(int n){
         Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory s = cfg.buildSessionFactory();
        Session session = s.openSession();  
      
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from cv");
        Object k = session.get(cv.class,n);
        cv stud = (cv) k;
         tx.commit();
        return stud;  
    }    
 }
