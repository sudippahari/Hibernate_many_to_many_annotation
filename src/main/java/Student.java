import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "student_1")
public class Student {
	
	private int student_id;
	private String student_name;
	private Set<Subject> subjects = new HashSet<Subject>();
	
	public Student(){}

	public Student(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
	}

	@Id
	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	@ManyToMany(mappedBy = "students", cascade = CascadeType.ALL)
	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	
	

}
