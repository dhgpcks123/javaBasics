package day21;

public class Circle {
	private int rad; //반지름 기억할 변수
	private double arround; //둘레 기억할 변수
	private double area; //둘레 기억할 변수
	//alt+shift+s source단축키, r누르면 Getters and Setters
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround() {
		this.arround = 2*Math.PI*rad;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = rad*rad*Math.PI;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		// 우리가 만드는 모든 클래스는 Object 클래스를 상속받아서 만드는 클래스가 되므로
		// Object가 가지고 있는 멤버는 모두 가지고 있게 된다.
		return "Circle : rad=" + rad + ", arround=" + arround + ", area=" + area;
	}
	
	//접근지정자가 이 클래스내에서만 접근하도록 되어있으므로
	//데이터를 꺼내고 기억시키는 기능의 함수를 만들어 두자.
}
