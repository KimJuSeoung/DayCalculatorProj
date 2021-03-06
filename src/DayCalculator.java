
public class DayCalculator {
	private String[] daynames = {"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
	private int[] numberofMonthDay = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
	
	public boolean IsLeap(int year){
		if(year%400==0)
			return true;
		else if(year%100==0)
			return false;
		else if(year%4 == 0)
			return true;
		else
			return false;
	}
	
	private int getTotalDays(int year, int month, int day){
		int totalDays = 0;
		for(int yearIndex = 1; yearIndex < year; yearIndex++){
			if(IsLeap(yearIndex))
				totalDays += 366;
			else
				totalDays += 365;
		}
		for(int monthIndex = 1; monthIndex < month; monthIndex++)
			totalDays = totalDays + numberofMonthDay[monthIndex];
		
		if(IsLeap(year) && month >=3)
			totalDays++;
		
		totalDays += day;
		return totalDays;
	}
	public String getDay(int year, int month, int day) throws Exception {
		if(day > numberofMonthDay[month])
			throw new Exception("Day is over the maximum day");
		int totalDays = getTotalDays(year, month, day);
		
		return daynames[totalDays%7];
	}
	
}
