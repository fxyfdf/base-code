package com.test.statictest;

/*
	static���εķ���������̬����
		
		һ������¹������еķ����󲿷ֶ��Ǿ�̬������
		
		��̬�������ô�������Ҳ��ֱ�ӷ��ʸ÷�����
		
*/
public class StaticTest03{
	
	//��Ա����
	//��Ա��������ʹ�á�����.������
	public void m1(){
		
	}
	
	//��̬����
	//����ʹ�á�����.����ʽ����.Ҳ�����á�����.������ʹ�õ��ǡ�����.�����ײ㻹���õġ�����.��
	//��̬�����в���ֱ�ӷ��ʷǾ�̬����.
	//��̬�����в���ʹ��this
	public static void m2(){
		System.out.println("m2....");
	}
	
	//���
	public static void main(String[] args){
		
		StaticTest03 st = new StaticTest03();
		st.m1();
		
		m2();
		
		//��̬�ķ�����������ķ�ʽ���ʣ�������.��
		//��̬�ķ���Ҳ���á�����.������
		st.m2(); //����׶μ���st��StaticTest03���ͣ�����ͨ�������е�ʱ����Ȼʹ�� "StaticTest03."�ķ�ʽ���ʡ�
					//�÷���ִ�в���Ҫ����
		
		
		//�յ�����ȥ���ʳ�Ա��ʱ�����ֿ�ָ���쳣��
		//m2�������ǡ���Ա�����Ǿ�̬�ġ�
		//���Լ�ʹ�����ǿյģ�Ҳ���ᱨ��ָ���쳣��
		StaticTest03 s = null;
		s.m2(); 
		
	}
	
}

