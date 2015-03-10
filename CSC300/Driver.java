
public class Driver 
{
	public static void main(String[] elephant)
	{
		Queue q = new Queue();
		for(int i = 0; i < 100; i++)
		{
			Person p = new Person("Person " + i);
			q.enqueue(p);
		}
		System.out.println("finished enqueue");
		for(int x = 0; x < 100; x++)
		{
			q.dequeue();
		}
	}
}