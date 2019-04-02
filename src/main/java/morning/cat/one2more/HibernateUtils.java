package morning.cat.one2more;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/4/2 10:47 PM
 */
public class HibernateUtils {

    private static SessionFactory sessionFactory;
    private static Session session;

    static {
        // 配置对象
        Configuration configuration = new Configuration().configure("/one2more/hibernate.cfg.xml");

        Properties properties =  configuration.getProperties();
        // 服务对象
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        // 会话工厂对象
        sessionFactory = configuration
                .buildSessionFactory(standardServiceRegistry);
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session getSession() {
        session = sessionFactory.openSession();
        return session;
    }

    public static void closeSession(Session session) {
        if (session != null) {
            session.close();
        }
    }

}
