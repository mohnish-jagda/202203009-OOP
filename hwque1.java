/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class hwque1
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
    public void indexOf(int k,int n){
        node curr=head;
        for(int i=1;i<=n;i++)
        {
            if(curr.data==k)
            {
                System.out.println("index: "+i);
                return;
            }
            curr=curr.next;
        }
    }
    
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Main ll=new Main();
	    System.out.println("how many no.s : ");
	    int n=sc.nextInt();
	    System.out.println("enter no.s : ");
	    for(int i=0;i<n;i++)
	    {
	        int m=sc.nextInt();
	        ll.addLast(m);
	    }
	    System.out.println("index of which no. : ");
	    int k=sc.nextInt();
	    ll.indexOf(k,n);
	    
	    
	}
}
