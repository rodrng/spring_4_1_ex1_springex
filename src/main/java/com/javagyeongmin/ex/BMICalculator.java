package com.javagyeongmin.ex;

public class BMICalculator {
	
	private double normal; // 정상 bmi 지수
	private double lowWeight; // 저체중
	private double overWeight; // 과체중
	private double obesity; // 비만
	
	public void bmiCalculation (double weight, double height) {
		
		//BMI지수계산식: 몸무게 / (키*0.01)*2		
		double bmi_result = weight / ((height * 0.01) * (height * 0.01));
		
		System.out.println("당신의 BMI 지수는 : " + bmi_result);
		
		if(bmi_result > obesity) {
			System.out.println("당신은 비만입니다");
		} else if(bmi_result > overWeight) {
			System.out.println("당신은 과체중입니다");
		} else if(bmi_result > normal) {
			System.out.println("당신은 정상입니다");
		} else if(bmi_result > lowWeight) {
			System.out.println("당신은 저체중입니다");
		}
	}

	public double getNormal() {
		return normal;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public double getLowWeight() {
		return lowWeight;
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public double getOverWeight() {
		return overWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	
	
}