package javaTest;

/*여기만 스스로 만들어 보자*/
public class CommonData {
	
	private String data = null;

	//syncronized 가 없으면 예외가 발생
	// wait(), notify(), notifyAll() 호출은 synchronized 안에서 해야한다.
	public synchronized void getData() {		
		
		try {			
			if(data != null) {		//값이 있네?		
				System.out.println("가져온 데이터 : "+data);//있으면 가져오고
				data = null;//가져갔으니 값은 비워 주고
			}
			//producer 깨우고 난 자야지(값이 있던지 없던지)
			notify();
			wait();
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}

	public synchronized void setData(String data) {
		try {			
			if(this.data == null) {//값이 없네?		
				System.out.println("넣은 데이터 : "+data);
				this.data = data;//데이터 넣고				
			}
			//consumer 깨우고 난 쉬어야지(값이 있던지 없던지)
			notify();
			wait();
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}
	
	

}
