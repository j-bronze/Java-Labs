public class Questionnaire{
	public static void main(String[] args){
		System.out.println("Укажите место работы:");
		Scanner scn1 = new Scanner(System.in);
		String value1 = scn1.nextLine();
		
		System.out.println("Укажите свою должность:");
		Scanner scn2 = new Scanner(System.in);
		String value2 = scn2.nextLine();
		
		System.out.println("Укажите продолжительность рабочего дня:");
		Scanner scn3 = new Scanner(System.in);
		int value3 = scn3.nextInt();
		
		System.out.printf("Место работы: %20s\n", value1);
		System.out.printf("Должность: %20s\n", value2);
		System.out.printf("Продолжительность рабочего дня: %10s\n", value3);
	}
}
