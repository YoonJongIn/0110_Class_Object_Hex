package �ڵ���Ŭ�����𵨸�����;

public class Car {
//	��ü�� �������� �Ӽ� => ��� ����
	private int speed;  //���� �ӵ�
	private int wheelNum;  //������ ��
	private String carName;  //�ڵ��� �̸�
	
//	������1
	public Car(String name) {
		carName = name;
	}
//	������2
	public Car(int velocity) {
		speed = velocity;
	}
//	������3
	public Car(String name, int velocity) {
		carName = name;
		speed = velocity;
	}
		
	public static void main(String[] args) {
			
	}
}
