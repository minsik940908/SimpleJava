package chap04.ex12.prv;

public class Computer {
	
	
	private boolean power = false;//전원(켜고/끄고) - 읽기/쓰기
	private int panSpeed = 0;//팬스피드 - 읽기/쓰기
	private int temp = 25;//Cpu 온도 - 읽기
	
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getPanSpeed() {
		return panSpeed;
	}
	public void setPanSpeed(int panSpeed) {
		this.panSpeed = panSpeed;
	}
	public int getTemp() {
		return temp;
	}
	
	
	
	
}
