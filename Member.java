package real;

public class Member {
	String name;//멤버변수
	
	
	public String bmi(double t,double w) {
		
		String bi = "";
		String res = "";
		;//지역변수 -> 로컬변수
		double bmi = w/(t*t)*10000;
		if(bmi>40.0) {
			bi = "고도비만";
		}else if(bmi>35.0) {
			bi = "중등도비만";
		}else if(bmi>30.0) {
			bi = "경도비만";
		}else if(bmi>25.0) {
			bi = "과체중";
		}else if(bmi>18.5) {
			bi = "정상";
		}else{
			bi = "저체중";
		}
		res = bmi + bi;
		
		return bi;
	}//bmi end
	public String grade(int a,int b,int c,int d,int e) {
		String dd = "";//로컬변수는 반드시 초기화 해야한다.원치않는 값이 할당됨.
		String gra = "";
		int sum = a+b+c+d+e;
		int avr = sum / 5;
		if(avr >=90) {
			
		}else if(avr >=80) {
			gra = "A";
		}else if(avr >=70) {
			gra = "B";
		}else if(avr >=60) {
			gra = "C";
		}else if(avr >=50) {
			gra = "D";
		}else if(avr >=50) {
			gra = "E";	
		}else {
			gra = "F";
		}
		dd = "평균은:"+avr+","+gra;
		/**
		 국어,영어,수학,과학,사회 과목 점수를 입력받아서 평균을 낸뒤
		 100 ~ 90 A,B,C,D,E,F를 내는것
		 * */
		
		
		
		return dd;
	}
	public String genderChecker(String gender) {
		String b = "";
		char a = gender.charAt(7);
		switch (a) {
		case '1': b = "남";break;
		case '2': b = "여";break;
		case '3': b = "남";break;
		case '4': b = "여";break;
		case '5': b = "외국인";break;
		case '6': b = "외국인";break;
			

		default:b = "다시 입력하세요";break;
		}
		
		return b;
	}
}
