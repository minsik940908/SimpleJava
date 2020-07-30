package test0611;

public class Computer {
	
	private boolean 전원;
	
	private int 팬속도;
	
	private int 온도;

	public boolean is전원() {
		return 전원;
	}

	public void set전원(boolean 전원) {
		this.전원 = 전원;
	}

	public int get팬속도() {
		return 팬속도;
	}

	public void set팬속도(int 팬속도) {
		this.팬속도 = 팬속도;
	}

	public int get온도() {
		return 온도;
	}
}
