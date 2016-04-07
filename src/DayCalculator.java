
public class DayCalculator {
	private String[] daynames = {"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
	private int[] numberofMonthDay = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getTotalDays(int year, int month, int day){
		int totalDays = 0;
		for(int monthIndex = 1; monthIndex < month; monthIndex++)
			totalDays = totalDays + numberofMonthDay[monthIndex];
		totalDays += day;
		return totalDays;
	}
	public String getDay(int year, int month, int day){
		int totalDays = getTotalDays(year, month, day);
		
		return daynames[totalDays%7];
	}
}
