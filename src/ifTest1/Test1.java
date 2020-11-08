package ifTest1;

public class Test1 {

	public static void main(String[] args) {
		int height;
		double dHeight;
		int weight;
		double bmi;
		
		height = 190;
		dHeight =height/100.0;
		weight =90;
		bmi = weight / (dHeight*dHeight);
		System.out.println(bmi);
		System.out.printf("%.2f", bmi);
		
		if(bmi>=30.0) {
			System.out.println("고도비만");
		}else if(bmi >=25.0) {
			System.out.println("비만");
		}else if(bmi >=23.0) {
			System.out.println("과체중");
		}else if(bmi >=18.5) {
			System.out.println("표준체중");
		}else  {
			System.out.println("저제중");
	}
	}

}
