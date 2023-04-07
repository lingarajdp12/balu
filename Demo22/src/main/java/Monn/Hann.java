package Monn;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hann {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager f=e.createEntityManager();
		EntityTransaction t=f.getTransaction();
		
		//Sunn s=new Sunn();
		//s.setId(2);
		//s.setName("jdhdk");
		//s.setNumber(657788667867l);
		
	     Sunn g=f.find(Sunn.class, 1);
		g.setName("sunil");
		
		t.begin();
		f.merge(g);
		t.commit();
		
	}

}
