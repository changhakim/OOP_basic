package real;

public class Mycalender {
	public String leapYear(String year) {
		String res = "";
		int a = Integer.parseInt(year);
		
		if(a % 4 ==0 && a % 100 !=0 ||a % 400 == 0  ) {
			res = "윤년";
		}else {
			res ="평년";
		}
		return res;
	}
}
