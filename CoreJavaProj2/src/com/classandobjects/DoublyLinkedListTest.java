class Node
    {
	 int data;
	 Node prev;
	 Node next;
	}

 class DoublyLinkedList
    {
       Node head=null;
	   Node newnode;
	   public void add(int data)
	      {
		 newnode=new Node();
		     newnode.data=data;
		  }
				public void insert()
					{
						newnode.next=head;
						newnode.prev=null;
						if(head!=null)
						head.prev=newnode;
							head=newnode;
					}
					public void printList()
					{
						 while(node!=null))
							  
    }

  
class DoublyLinkedListTest
   {
    public static void main(String args[])
       {
        DoublyLinkedList d=new DoublyLinkedList();
          d.add(10);
          d.add(20);
        }
   }		