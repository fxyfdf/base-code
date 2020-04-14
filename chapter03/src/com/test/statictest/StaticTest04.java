package com.test.statictest;

/*
	static���εı�����������̬������
		
		�������ࣺ
			1.�ֲ�����
			2.��Ա����(ʵ���������Ǿ�̬����)
			3.��̬����(������)
		
		ʲôʱ����������ɾ�̬������
			�������������еĶ����У�����������Ե�ֵ����ͬ�ģ��������������
			��̬�����ԡ�
		
		
		��Ա����������java�����ʱ���ʼ����
		��̬������������ؽ׶θ�ֵ������ֻ��ֵһ�Ρ�
*/
public class StaticTest04{
	
	public static void main(String[] args){
		
		Animal a1 = new Animal("AAA",10);
		Animal a2 = new Animal("BBB",11);
		
		//��η���(����.)
		System.out.println(Animal.type);
		
		//Ҳ����ʹ�� ����.
		System.out.println(a1.type);
		
		
		Animal a3 = null;
		System.out.println(a3.type); //��̬�����ײ���ʵ�ʱ��һ��ʹ�õ�  ����. �Ͷ����޹أ�������ֿ�ָ���쳣��
		
	}
}


//������ʵ�����еġ�½��������
class Animal{
	
	//Field
	//��Ա����(һ������һ��.)
	//��Ա�����ڴ��������ʱ���ʼ�������Ҵ洢�ڶ��е�ÿһ�������С�
	String name;
	int age;
	
	//��̬���������洢�ڷ�����.
	//���е�java��������һ�ݡ�
	//���Ծ�̬�������༶��ģ�ʹ�á�����.���ķ�ʽ����.
	static String type = "½��";
	
	//Constructor
	Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
}