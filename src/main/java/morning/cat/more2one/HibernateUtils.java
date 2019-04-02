package morning.cat.more2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static SessionFactory sessionFactory;
	private static Session session;

	static {
		// 配置对象
		Configuration configuration = new Configuration().configure("/more2one/hibernate.cfg.xml");
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
