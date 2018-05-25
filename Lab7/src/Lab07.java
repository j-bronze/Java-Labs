/**
 * The purpose of the program: ----------
 * The program has been written and tested with the 
 * Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author Boroznovskaya Evgeniya
 * 1706v
 * 23/05/2018
 * */
public class Lab07 {

	public static void main(String[] args) {
		Student student1 = new Student("Ivanov", 9);
		Student student2 = new Student("Petrov", 5);
		Student student3 = new Student("Sidorov", 7);
		
		Group group = new Group("POIS1709");
		group.setStudent1(student1);
		group.setStudent2(student2);
		group.setStudent3(student3);
		
		double avgGroupMark = Manager.calculateAvgMark(group);
		
		View.print(group + "");
		View.print("\nAvg group mark = " + avgGroupMark);
	}

}
