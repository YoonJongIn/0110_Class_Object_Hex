package 자동차클래스상속예제;
/*
 * Car 클래스 => 부모 클래스 역할
 */
public class Car {
//	객체가 가져야할 속성 => 멤버 변수
	protected int speed;       //현재 속도, 초기값이 0 이다. => 130 => 100
	protected int wheelNum;    //바퀴의 수
	protected String carName;  //자동차 이름, 초기값 null이다.
	/*
	private => protected로 변경(부모 & 자식 연결위해서)
//	접근 지정자 4가지 차이점
	default(접근지정자 생략) / public(공개) / private(비공개) / protected(보호된 공개)
	protected로 바꾸면 자식(하위)클래스에서도 접근가능
	*/
	
//	디폴트(default) 생성자 생성
	public Car() {
		
	}
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
//	메소드 구현
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
