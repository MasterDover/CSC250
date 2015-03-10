
public class Queue {

	private Person firstPerson;
	private int queueSize;
	
	public Queue() {
		firstPerson = null;
		queueSize = 0;
	}
	
	public void enqueue(Person p) {
		if(firstPerson == null){
			this.firstPerson = p;
			this.queueSize++;
		}
		else
		{
			Person curr = this.firstPerson;
			for(int i = 0; i < queueSize-1; i++)
			{
				curr = curr.getNextPerson();
			}
			curr.setNextPerson(p);
			this.queueSize++;
		}
	}
	
	public void dequeue() {
		if(firstPerson == null)
		{
			System.out.println("empty queue");
		}
		else
		{
			Person p = this.firstPerson;
			this.firstPerson = p.getNextPerson();
			p.display();
			queueSize--;
		}
	}
}
