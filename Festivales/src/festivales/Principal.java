package festivales;

import java.util.Date;

import org.hibernate.Session;



public class Principal {

	public static void main(String[] args) {

		recuFestival();
		recuActuacion();
		recuGrupo();

		HibernateUtilities.getSessionFactory().close();

	}

	public static void newFestival() {

		Session session = HibernateUtilities.getSessionFactory().openSession();

		Festival f1 = new Festival();
		f1.setNombre("Medusa");
		;
		f1.setLugar("Cullera");
		f1.setFecha(new Date());

		session.save(f1);

		session.beginTransaction();
		session.getTransaction().commit();

		session.close();

	}
	
	public static void recuFestival() {
		Session session = HibernateUtilities.getSessionFactory().openSession();

		Festival f1 = session.get(Festival.class, 1);
		System.out.println("Hemos encontrado: " + f1.getId() + ", " + f1.getLugar() + ", " + f1.getNombre()
				+ ", " + f1.getFecha());
		
		session.getTransaction();
		session.close();

	}

	public static void newActuacion() {

		Session session = HibernateUtilities.getSessionFactory().openSession();

		Actuacion a1 = new Actuacion();
		a1.setHora(1500);
		;
		a1.setEscenatio("secundario");

		session.save(a1);

		session.beginTransaction();
		session.getTransaction();

		session.close();

	}
	
	public static void recuActuacion() {
		Session session = HibernateUtilities.getSessionFactory().openSession();

		Actuacion a1 = session.get(Actuacion.class, 1);
		System.out.println("Hemos encontrado: " + a1.getIdAct() + ", " + a1.getEscenatio()+ ", " + a1.getHora());
		
		session.getTransaction();
		session.close();

	}

	public static void newGrupo() {

		Session session = HibernateUtilities.getSessionFactory().openSession();

		Grupo g1 = new Grupo();
		g1.setNombre("Los burlaos");
		;
		g1.setEstilo("Rap");
		g1.setMiembros(2);

		session.save(g1);

		session.beginTransaction();
		session.getTransaction();

		session.close();

	}
	
	public static void recuGrupo() {
		Session session = HibernateUtilities.getSessionFactory().openSession();

		Grupo g1 = session.get(Grupo.class, 1);
		System.out.println("Hemos encontrado: " + g1.getIdGrupo() + ", " + g1.getIdGrupo()+ ", " + g1.getEstilo()+ ", " + g1.getMiembros());
		
		session.getTransaction();
		session.close();

	}

}
