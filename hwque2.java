import java.util.Scanner;
public class hwque2
{
    class node{
        int data;
        node next;
        
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    node head;
    public void addLast(int data){
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        node currnode=head;
        while(currnode.next!=null)
        {currnode=currnode.next;}
        currnode.next=newnode;
        
    }
    public void printList(){
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    public void deleteList(int n){
        node curr=head;
        int c=0,k=1;
        for(int i=1;i<=n;i++)
        {
            if(curr.data>25)
            {
                if(k==i)
                {
                    curr=curr.next;
                    head=head.next;
                    c++;
                    k++;
                    
                }
                else if(i==n)
                {
                      
                        if(head == null){
		                  	System.out.println("The list is empty");
	                	}
	
                    	if(head.next == null){
	                    	head = null;
                    	}
                    	else{
		                node secondLast = head;
		                node lastNode = head.next;
	                	while(lastNode.next != null){
		                   	lastNode = lastNode.next;
		                	secondLast = secondLast.next;
			
	                	}
	                	secondLast.next = null;
                    	}
                }
                else
                {
                    curr=curr.next;
                    node now=head;
                    node prev=null;
                    int j=1;
                    while(j< i-c){
		              	prev = now;
		            	now = now.next;
		             	j++;
	             	}
		            prev.next = now.next;
		            now.next = null;
		            c++;
                }
                
                
                
                
            }
            else
            curr=curr.next;
        }
    }
    
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    hwque2 ll=new hwque2();
	    System.out.println("how many no.s : ");
	    int n=sc.nextInt();
	    System.out.println("enter no.s between 1 to 50 : ");
	    for(int i=0;i<n;i++)
	    {
	        int m=sc.nextInt();
	        ll.addLast(m);
	    }
	    ll.deleteList(n);
	    ll.printList();
	    
	    
	}
}
