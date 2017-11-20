package hw05;

public class Date {
	int year = 0;
	int month =0;
	int day = 0;
	String s = "";
	
	public String printEastern(){
		return "동양식 날짜 표현: " + year+"."+month+"."+day;	
	}
	
	public String printWastern() {
	
	switch (month) {
	case 1: s="January"; break;
	case 2: s="February"; break;
	case 3: s="March"; break;
	case 4: s="April"; break;
	case 5: s="May"; break;
	case 6: s="June"; break;
	case 7: s="July"; break;
	case 8: s="August"; break;
	case 9: s="September"; break;
	case 10: s="October"; break;
	case 11: s="November"; break;
	case 12: s="December"; break;
	}	
	return "미국식 날짜 표현: "+	s+" "+day+", "+year;
		
	
	}

}
