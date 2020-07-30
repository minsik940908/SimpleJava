package chap09.ex06.queue;

import java.util.LinkedList;
import java.util.Queue;

public class JobQueue {

	public static void main(String[] args) {
		
		//queue는 인터페이스 일 뿐이다.(규격만 정해 준다.)
		Queue<Job> queue = new LinkedList<Job>();
		//집어 넣을땐 offer
		queue.offer(new Job("send SMS", "Alice"));//1
		queue.offer(new Job("send SMS", "Bryan"));//2
		queue.offer(new Job("send SMS", "Criss"));//3
		queue.offer(new Job("send SMS", "Senis"));//4
		queue.offer(new Job("send SMS", "Eric"));//5
		queue.offer(new Job("send SMS", "Frank"));//6
		
		//뽑아 낼땐 poll&peek
		while(!queue.isEmpty()) {
			Job job = queue.poll();//메서드 체이닝 사용 안함
			System.out.println(job.getCommand() + " " + job.getTo());
			System.out.println("남은 작업 수 : " + queue.size());
		}

	}

}
