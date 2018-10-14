package cv.generator;

import Entity.*;
import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class dbconnect {

    public Session getSessioObj(){
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionfac = cfg.buildSessionFactory();
        Session s = sessionfac.openSession();
        return s;
    }
    void savedata(cv c) {
        Session s = getSessioObj();
        Transaction t = s.beginTransaction();
        s.save(c);
        t.commit();
        s.close();
     }

    cv fetch(int n) {
        Session session = getSessioObj();

        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from cv");
        Object k = session.get(cv.class, n);
        cv stud = (cv) k;
        tx.commit();
        return stud;
    }

    void saveuserinfo(userdata u) {
        Session s = getSessioObj();
        Transaction t = s.beginTransaction();
        s.save(u);
        t.commit();
        s.close();
    }

    boolean fetchdata(String email, String password) {
        Session s = getSessioObj();
        Transaction t = s.beginTransaction();
        
        Query q = s.createQuery("from userdata");
        Object k = s.createCriteria(email);
        List<userdata> list = q.list();

        for (userdata data : list) {
            if (data.getEmailid().equals(email) && data.getPassword().equals(password) ){ 
                return true;
            }
        }
        return false;
    }
    boolean forgetpassword(String email)
    {
        Session session = getSessioObj();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from userdata");
        Object k = session.createCriteria(email);
        List <userdata> password = q.list();
        for(userdata  list : password)
        {
            mailClass m = new mailClass();
             return m.sendpassword(list);
        }
        return false;
    }
}
