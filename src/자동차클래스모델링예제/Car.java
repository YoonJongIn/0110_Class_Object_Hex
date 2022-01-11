package �ڵ���Ŭ�����𵨸�����;

public class Car {
//	��ü�� �������� �Ӽ� => ��� ����
	private int speed;       //���� �ӵ�
	private int wheelNum;    //������ ��
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
	/*
	��ü�� �������� ���(����, ����) => �޼ҵ�
	[�߿�] ������ ������ �Ѱ��� ��� => �޼ҵ� �����ε��� ���ؼ� ���� �����ϴ�.
//	�޼ҵ� �����ε��̶�? => �ϳ��� Ŭ�������� ���� �̸��� �޼ҵ尡 ������ ������
//	�޼ҵ� ����� ���
	public ��ȯŸ�� �޼ҵ��(�Ű�������1, �Ű�������2, ..., �Ű�����n)
	��ȯŸ���� void�� ó���ϰ� ��ȯŸ���� ����(����)
	*/
	public void speedUp() {
		speed = speed + 1;
	}
	public void speedUp(int velocity) {  //�޼ҵ� �����ε�(����� �Ȱ����� ������� �ٸ�)
		speed = speed + velocity;
	}
	public void speedDown() {
		speed = speed - 1;
	}
	public void stop() {
		speed = 0;
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("���׽ý�");  //���׽ý���� ���ڿ��� ��ü�� ���� myCar = ���׽ý�
		System.out.println("����ī�� " + myCar.carName + "�̴�.");
		
		Car yourCar = new Car(120);
		System.out.println("����ī�� ����ӵ��� " + yourCar.speed + "km�̴�.");
		
		Car hisCar = new Car("�׷���", 110);
		System.out.println(hisCar.carName + "�� ����ӵ��� " + hisCar.speed + "km�̴�.");
		
	}
}
