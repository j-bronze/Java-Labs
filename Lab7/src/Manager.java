
public class Manager {
	
	public static double calculateAvgMark(Group group) {
		int total = group.getStudent1().getMark() + group.getStudent2().getMark() + group.getStudent3().getMark();

		return total / 3;
	}
}
