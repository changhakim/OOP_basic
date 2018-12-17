package real;

public class Calc {
	public String plus(int a,int b) {

		String res = "";
		int sum = a + b;
		res = "답은"+sum;
		return res;
	}
	public String minus(int a,int b) {
		String res = "";
		int sum = a - b;
		res = "답은"+sum;
		return res;

	}public String multi(int a,int b) {
		String res = "";
		int sum = a * b;
		res = "답은"+sum;
		return res;
	}public String divid(int a,int b) {
		String res = "";
		int sum = a / b;
		res = "답은"+sum;
		return res;
	}public String aa(double a,double b) {
		String res = "";
		double sum = a % b;
		res = "답은"+sum;
		return res;
	}

	public String gugudan(String a) {
    String res ="";
    int b = Integer.parseInt(a);
    int[] gugu = new int[9];
    for(int i=0;i<gugu.length;i++) {
    	gugu[i] = b * (i+1);
    	if((i+1) != gugu.length) {
    	
    	res += a+"x"+(i+1)+"="+gugu[i]+",";
    	}else {
    	
    	res += a+"x"+(i+1)+"="+gugu[i]+"";
    	}
    	
    }
    return res;
    
	}

}



