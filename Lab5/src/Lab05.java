/**
 * ���������� ���������: ----------
 * ��������� ���� �������� � ������������� � �������������� ����� 
 * ���������� Eclipse IDE for Java Developers (Version: Oxygen.2 Release(4.7.2))
 * @author ������������ �������
 * 1706v
 * 11/04/2018
 */
public class Lab05 {

	public static void main(String[] args) {
		// ������� 1 - ������ �������
		View.print("The program counts numbers of Dragon's heads and eyes in defined user age.\n");
		
		int dragonAge = UserInput.input("Input a Dragon age: ");
		
		String result = DragonHeadsEyes.solve(dragonAge);
		
		View.print("\n" + result + "\n");
		
		
		//������� 2
	}

}
