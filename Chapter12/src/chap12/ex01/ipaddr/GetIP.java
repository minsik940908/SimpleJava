package chap12.ex01.ipaddr;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress addr = InetAddress.getLocalHost();// 내 컴퓨터의 IP 확인
		System.out.println("내 PC 주소 : " + addr.getHostAddress());
		
		//특정 도메인으로 부터 IP 추출
		String domain = "www.gdu.co.kr";
		addr = InetAddress.getByName(domain);
		System.out.println("www.gdu.co.kr 주소 : " + addr.getHostAddress());
		
		//대형 서비스 하나의 도메인에는 복수개의 IP를 연결한다.
		domain = "www.youtube.com";
		InetAddress[] addrs = InetAddress.getAllByName(domain);
		System.out.println("youtube의 IP들");
		for(InetAddress ip : addrs) {
			System.out.println(ip.getHostAddress());
		}
	}

}
