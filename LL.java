class LL {
	
	class Node{
		int data;
		Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
		}
	}
	Node head;
	
	public void addFirst(int data){
		Node newNode = new Node(data);
		
		if(head == null)
		{
				head = newNode;
				return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		
		Node curr = head;
		while(curr.next != null){
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	
	public void printList(){
		if(head == null){
			System.out.println("empty");
			return;
		}
		Node curr = head;
		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
	}
	
	public void deleteFirst(){
		if(head == null){
			System.out.println("empty");
			return;
		}
		head = head.next;
	}
	
	public void deleteLast(){
	if(head == null){
			System.out.println("empty");
			return;
		}
	if(head.next == null){
		head = null;
		return;
	}
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null){
			lastNode = lastNode.next;
			secondLast = secondLast.next;
			
		}
		secondLast.next = null;
	}
	
	public void deleteAtIndex(int index){
          Node now=head;
          Node prev=null;
          int j=1;
          while(j< index){
              prev = now;
	       	  now = now.next;
		      j++;
	             	}
		            prev.next = now.next;
		            now.next = null;
	}
	
	public void addAtIndex(int data,int index){
	    Node ptr=new Node(data);
	    Node p=head;
	    int i=0;
        while(i!=index-1)
        {
          p=p.next;
          i++;
        }
        ptr.data=data;
        ptr.next=p.next;
        p.next=ptr;
	}
	
	

	
	public static void main(String args[]){
		LL list = new LL();
	    list.addFirst(1);
	    list.addAtIndex(3,1);
	    list.printList();
	    System.out.println();
	    list.addFirst(5);
	    list.printList();
	    System.out.println();
	    list.deleteLast();
	    list.printList();
	    
	    
	    
		
	}
}