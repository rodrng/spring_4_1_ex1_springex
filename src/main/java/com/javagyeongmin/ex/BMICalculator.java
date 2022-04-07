package com.javagyeongmin.ex;

public class BMICalculator {
	
	private double normal; // ���� bmi ����
	private double lowWeight; // ��ü��
	private double overWeight; // ��ü��
	private double obesity; // ��
	
	public void bmiCalculation (double weight, double height) {
		
		//BMI��������: ������ / (Ű*0.01)*2		
		double bmi_result = weight / ((height * 0.01) * (height * 0.01));
		
		System.out.println("����� BMI ������ : " + bmi_result);
		
		if(bmi_result > obesity) {
			System.out.println("����� ���Դϴ�");
		} else if(bmi_result > overWeight) {
			System.out.println("����� ��ü���Դϴ�");
		} else if(bmi_result > normal) {
			System.out.println("����� �����Դϴ�");
		} else if(bmi_result > lowWeight) {
			System.out.println("����� ��ü���Դϴ�");
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