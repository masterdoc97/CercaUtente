/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {

    private static SessionFactory sessionFactory;
    
    /*static {
        
    }*/
    
    public static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Utenti.class)
                .configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
        applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }
}
