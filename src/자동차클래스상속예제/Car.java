package �ڵ���Ŭ������ӿ���;
/*
 * Car Ŭ���� => �θ� Ŭ���� ����
 */
public class Car {
//	��ü�� �������� �Ӽ� => ��� ����
	protected int speed;       //���� �ӵ�, �ʱⰪ�� 0 �̴�. => 130 => 100
	protected int wheelNum;    //������ ��
	protected String carName;  //�ڵ��� �̸�, �ʱⰪ null�̴�.
	/*
	private => protected�� ����(�θ� & �ڽ� �������ؼ�)
//	���� ������ 4���� ������
	default(���������� ����) / public(����) / private(�����) / protected(��ȣ�� ����)
	protected�� �ٲٸ� �ڽ�(����)Ŭ���������� ���ٰ���
	*/
	
//	����Ʈ(default) ������ ����
	public Car() {
		
	}
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
//	�޼ҵ� ����
	public void speedUp() {
		speed = speed + 1;
	}
	public void speedUp(int velocity) {
		speed = speed + velocity;
	}
	public void speedDown() {
		speed = speed - 1;
	}
	public void stop() {
		speed = 0;
	}
}
