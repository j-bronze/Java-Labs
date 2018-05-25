
public class Student {

	private String name;
	private int mark;

	public Student() {
		mark = 4;
	}

	public Student(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		if (mark >= 0 || mark <= 10) {
			this.mark = mark;
		}
	}

	@Override
	public String toString() {
		return name + " (" + mark + ")";
	}
	
	

}
