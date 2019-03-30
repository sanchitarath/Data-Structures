import java.util.*;
public class QueuetoStack {
	static Queue<Integer> queue1=new LinkedList<Integer>();
	static Queue<Integer> queue2=new LinkedList<Integer>(); 
	
	
	public void Push(int x)
	{
		queue1.add(x);

		}
	
	public void Pop()
	{
		if(queue1.isEmpty())
		{
			System.out.println("empty");
		}
		
		while(queue1.size()!=1)
		{
			int elem=queue1.remove();
			queue2.add(elem);
			
		}
		
		queue1.remove();
		
		queue1.addAll(queue2);
		queue2.clear();
		
	
	}
	
	
	public static void main(String[] args) 
	{
		QueuetoStack q= new QueuetoStack();
		q.Push(1);
		q.Push(2);
		q.Push(3);
		q.Push(4);
		
       q.Pop();
       q.Pop();
       for(int x:queue1)
		{
			System.out.println(x);
		}
	}
}


