/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front;
	QueueNode rear;
	
	void push(int a)
	{
	    //if queue is empty, then new node is front and rear both.
		if (rear==null)
		{
			rear = new QueueNode(a);
			front = rear;
		}
		//adding the new node at the end of queue and changing rear.
		else
		{
			QueueNode temp = new QueueNode(a);
			rear.next=temp;
			rear=temp;
		}
	}
	
	int pop()
	{
		QueueNode temp = front;
		//if queue is empty, we return NULL.
		if(temp==null)
			return -1;
		//if more than one node is present, we move temp one node ahead and 
        //delete front. we also update front as new temp.
		if(temp.next != null)
		{
			temp = temp.next;
			int k = front.data;
			front = temp;
			//returning the popped element.
			return k;
		}
		//else we delete front and make both rear and front as NULL.
		else
		{
			int k = front.data;
			front = null;
			rear = null;
			//returning the popped element.
			return k;
		}
	}
}
