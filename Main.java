package real;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		JOptionPane opt = new JOptionPane();	

		while(true) {
			String menu = JOptionPane.showInputDialog("0.종료\n 1.회원관리 \n2.계산기\n"
					+ "3.로또\n 4.달력\n");

			switch(menu) {
			case "0" : JOptionPane.showMessageDialog(null,"시스템종료"); return;
			case "1" :Member m = new Member();
			String name = JOptionPane.showInputDialog("이름 입력");
			m.name = name;
			JOptionPane.showMessageDialog(null,String.format("환영합니다 %s 님",m.name));
			String mMenu = JOptionPane.showInputDialog("[회원관리 메뉴]\n 1.BMI\n "
					+ "2.학점(국어,영어,수학,과학,사회)\n "
					+ "3.성별체크(ssn)");

			switch(mMenu) {
			case "1" :
				String temp = opt.showInputDialog(null, "키,몸무게입력");
				String[] arr = temp.split(",");
				/*		m.bmi(Double.parseDouble(arr[0]),Double.parseDouble(arr[1]));

				/*m.bmi(arr);*/
				JOptionPane.showMessageDialog(null, m.bmi(Double.parseDouble(arr[0]),Double.parseDouble(arr[1])));
				break;
			case "2": 
				String temp1 = opt.showInputDialog(null,"국어,수학,영어,사회,과학점수를 입력하세요");
				String[] arr1 = temp1.split(",");
				String grade =	m.grade(Integer.parseInt(arr1[0]),Integer.parseInt(arr1[1]),Integer.parseInt(arr1[2]),
						Integer.parseInt(arr1[3]),Integer.parseInt(arr1[4]));
				JOptionPane.showMessageDialog(null,String.format("%s님의 %s",m.name,grade));
				break;
			case "3":
				String temp2=JOptionPane.showInputDialog(null,"주민등록번호를 입력하세요");
				/*String gender = m.genderChecker();*/
				JOptionPane.showMessageDialog(null,String.format("%s의 성별은 %s입니다.",m.name,m.genderChecker(temp2)));
				break;	

			}
			break;
			case "2":
				Calc c = new Calc();
				String n = JOptionPane.showInputDialog(null,"1.계산기\n 2.구구단");

				switch (n) {
				case "1":

					String[] op =JOptionPane.showInputDialog(null,"계산기입니다.").split(" ");


					switch(op[1]) {
					case "+" :
						JOptionPane.showMessageDialog(null,String.format("계산 결과는 %s입니다.",c.plus(Integer.parseInt(op[0]),Integer.parseInt(op[2]))));
						break;
					case "-" :
						JOptionPane.showMessageDialog(null,String.format("계산 결과는 %s입니다.",c.minus(Integer.parseInt(op[0]),Integer.parseInt(op[2]))));
						break;
					case "*" :
						JOptionPane.showMessageDialog(null,String.format("계산 결과는 %s입니다.",c.multi(Integer.parseInt(op[0]),Integer.parseInt(op[2]))));
						break;
					case "/" : 
						JOptionPane.showMessageDialog(null,String.format("계산 결과는 %s입니다.",c.divid(Integer.parseInt(op[0]),Integer.parseInt(op[2]))));
						break;
					case "%" :
						JOptionPane.showMessageDialog(null,String.format("계산 결과는 %s입니다.",c.aa(Double.parseDouble(op[0]),Double.parseDouble(op[2]))));
					}

					break;
				case "2" : 
					String gugu=JOptionPane.showInputDialog(null,"구구단입니다 숫자를 입력하세요");
					
					 
					
					JOptionPane.showMessageDialog(null,String.format("%s",c.gugudan(gugu)) );


					break;
				}
				break;
			case "3" : Lotto lotto = new Lotto();
			
				JOptionPane.showMessageDialog(null, String.format("오늘의 로또번호 %s",lotto.randomNum()));
				
				break;
				
			case "4" : 
				Mycalender mycalender = new Mycalender();
				String yun = JOptionPane.showInputDialog(null,"년도를 입력하세요");
				
				
				JOptionPane.showMessageDialog(null,String.format("올해는 %s 입니다",mycalender.leapYear(yun)));
				
				


			}
		}














		/*System.out.println("키,몸무게");
		double t = scanner.nextDouble();
		double w = scanner.nextDouble();
		String res = m.bmi(t,w);
		System.out.println(res);*/
	}
}
