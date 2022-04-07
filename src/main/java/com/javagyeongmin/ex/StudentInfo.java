package com.javagyeongmin.ex;

import java.util.ArrayList;

public class StudentInfo {
	
	private String name;
	private double weight;
	private double height;
	private BMICalculator bmiCalculator; // ��ü ����
	private ArrayList<String> hobbys; // ��� ������ 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}
	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	
	
	public void getInfoPrint() {
		System.out.println("�л��̸� : " + name);
		System.out.println("Ű : " + height);
		System.out.println("������ : " + weight);
		System.out.println("��� : " + hobbys);
		System.out.println("-- BMI ���� ���� --");
		bmiCalculator.bmiCalculation(weight, height);
	}
	

}