import java.util.HashSet;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue pq=new PriorityQueue();
pq.add(30);
pq.add(100);
pq.add(30);
pq.add(769);
pq.add(598);
//pq.add(null);
System.out.println("Elements :"+pq);
pq.add(pq.peek());
System.out.println("Elements :"+pq);
pq.add(pq.poll());

	}

}
