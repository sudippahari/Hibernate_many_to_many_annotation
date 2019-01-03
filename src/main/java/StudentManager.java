import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentManager {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Set<Subject> subjects = new HashSet<Subject>();
		
		Student s1 = new Student(1,"Sudip Pahari");
		Student s2 = new Student(2, "Prajwal Acharya");
		
		Subject sb1 = new Subject(100,"Maths");
		Subject sb2 = new Subject(200,"Science");
		
		subjects.add(sb1);
		subjects.add(sb2);
		s1.setSubjects(subjects);
		s2.setSubjects(subjects);
		sb1.getStudents().add(s1);
		sb1.getStudents().add(s2);
		sb2.getStudents().add(s1);
		sb2.getStudents().add(s2);
		
		s.save(s1);
		s.save(s2);
		//s.flush();
		tx.commit();
		s.close();
		
		

	}

}
