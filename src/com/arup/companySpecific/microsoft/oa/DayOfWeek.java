package com.arup.companySpecific.microsoft.oa;

/**
 * Day of week that is K days later
 * 
 * @author arupdutta
 *
 */
public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println(solution("Tuesday",101));
		System.out.println(solution("Monday",3));
	}
	
	public static String solution(String inputDay, int numberOfDays){
		String[] week = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int i = 0;
		for(;i<week.length;i++){
			if(week[i].equalsIgnoreCase(inputDay)){
				break;
			}
		}
		return week[(numberOfDays+i)%7];
	}

}
