import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "subject_1")
public class Subject {

	private int subject_id;
	private String subject_name;
	private Set<Student> students = new HashSet<Student>();
	
	public Subject(){}
	
	public Subject(int subject_id, String subject_name) {
		super();
		this.subject_id = subject_id;
		this.subject_name = subject_name;
	}

	@Id
	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	@ManyToMany
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
	
	
}
