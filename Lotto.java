package real;

import java.util.Random;

public class Lotto {
	public String randomNum() {
		Random random = new Random();
		String num = "";
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = random.nextInt(45);
			num += lotto[i]+",";
		}
		
		
		
		
		return num;
	}
}
