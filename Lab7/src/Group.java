
public class Group {
	private String name;
	private Student student1;
	private Student student2;
	private Student student3;

	public Group() {}
	
	public Group(String name) {this.name = name;}
	
	public Group(String name, Student st1, Student st2, Student st3) {
		this.name = name;
		student1 = st1;
		student2 = st2;
		student3 = st3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent1() {
		return student1;
	}

	public void setStudent1(Student student) {
		this.student1 = student;
	}

	public Student getStudent2() {
		return student2;
	}

	public void setStudent2(Student student) {
		this.student2 = student;
	}

	public Student getStudent3() {
		return student3;
	}

	public void setStudent3(Student student) {
		this.student3 = student;
	}

	@Override
	public String toString() {
		return "Group " + name + ":\n" + student1 + "\n" + student2 + "\n" + student3;
	}
	
	

}
