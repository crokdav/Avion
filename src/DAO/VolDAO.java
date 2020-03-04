package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Vol;


public class VolDAO implements IVolDAO {
	SessionFactory factory= new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
	Session session =factory.openSession();
	
	public int creatVol(Vol vo) {
	
		try {
			
			session.beginTransaction();
			session.save(vo);
			session.getTransaction().commit();
			return 1;
			
			}
			catch (HibernateException e)
			{
				e.printStackTrace();
				return 0;
	}

}

	public List<Vol> getVols() {
		List<Vol> liste= new ArrayList<Vol>();
		try {
			session.beginTransaction();
			liste=session.createQuery("from Vol").list();
			return liste;
			}
			catch (HibernateException e)
			{
				e.printStackTrace();
				return null;
			}
	}
}
