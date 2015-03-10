public class Node 
{
	private Node nextNode;
	private Person payload;
	
	

	public Node(Person payload)
	{
		this.payload = payload;
		this.nextNode = null;
	}
	
	public Node getNextNode() 
	{
		return this.nextNode;
	}

	public void setNextNode(Node nextNode) 
	{
		this.nextNode = nextNode;
	}

	public Person getPayload() {
		return this.payload;
	}
	
	
	
}