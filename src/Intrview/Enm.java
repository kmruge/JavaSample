package Intrview;

public class Enm {

	public static void main(String[] args) {
		enum WeekDay{
			MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
		}
		WeekDay day=WeekDay.FRIDAY;
		System.out.println(day);
		
		for(WeekDay w:WeekDay.values()) {
			System.out.println(w);
		}
	}

}
