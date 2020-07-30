package chap07.ex03.execption;

public class ArrayIndex {

	public static void main(String[] args) {
		//ArrayIndexOutOfBoundException : 배열 크기를 넘어선 무언가를 요청 할 경우
		String[] arr = new String[2];
		arr[0] = "data1";
		arr[1] = "data2";
		arr[2] = "data3";//방크기보다 더 넣으려고 할 경우 예외 발생

	}

}
