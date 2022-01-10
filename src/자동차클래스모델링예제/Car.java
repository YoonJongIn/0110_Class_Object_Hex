package 자동차클래스모델링예제;

public class Car {
//	객체가 가져야할 속성 => 멤버 변수
	private int speed;  //현재 속도
	private int wheelNum;  //바퀴의 수
	private String carName;  //자동차 이름
	
//	생성자1
	public Car(String name) {
		carName = name;
	}
//	생성자2
	public Car(int velocity) {
		speed = velocity;
	}
//	생성자3
	public Car(String name, int velocity) {
		carName = name;
		speed = velocity;
	}
		
	public static void main(String[] args) {
			
	}
}
