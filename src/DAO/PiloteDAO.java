package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Pilote;



public class PiloteDAO implements IPiloteDAO {
	SessionFactory factory= new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
	Session session =factory.openSession();
	
	public int creatPilote(Pilote pil) {
	
		try {
			
			session.beginTransaction();
			session.save(pil);
			session.getTransaction().commit();
			return 1;
			
			}
			catch (HibernateException e)
			{
				e.printStackTrace();
				return 0;
	}

}

	public List<Pilote> getPilotes() {
		List<Pilote> form= new ArrayList<Pilote>();
		try {
			session.beginTransaction();
			form=session.createQuery("from Pilote").list();
			return form;
			}
			catch (HibernateException e)
			{
				e.printStackTrace();
				return null;
			}
	}
}
