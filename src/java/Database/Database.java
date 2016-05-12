package Database;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Database {

    private SessionFactory factory;

    public Database() {
         factory = HibernateUtil.getSessionFactory();
    }
    public String cerca(String nomeUtente){
        Transaction tx = null;
        Session session = factory.openSession();
        try {
            tx = session.beginTransaction();
            Query q = session.createSQLQuery("SELECT * FROM utenti WHERE Nome = '"+nomeUtente+"';");
            List results = q.list();
            if (!results.isEmpty()){
                tx.commit();
                return "Nome utente presente";
            }
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return "Il nome non esiste";
    }

}