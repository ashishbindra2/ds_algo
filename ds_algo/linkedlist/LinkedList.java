package linkedlist;

public class LinkedList {
     private class Node{
    	 int data;
    	 Node next;
     }
     
     private Node head;
     private Node tail;
     private int size;
     
     public void display() {
    	 Node temp = this.head;
    	 System.out.println("-------------------");
    	 while(temp!=null) 
    	 {
	    	 System.out .print(temp.data+", ");
//	    	 System.out.println("->");
	    	 temp=temp.next;
         }
    	 System.out.println("-end");
    }
    
     public void addFirst(int data) 
     {
    	 //create a node with data initialization
    	 Node nn= new Node();
    	 nn.data = data;
    	 nn.next=null;
    	 //attachment
    	 if(this.size >= 1) {
    		nn.next=head; 
    	 }
    	 //summary object
    	 if(this.size==0)
    	 {
    		 this.head=nn;
    		 this.tail=nn;
    		 this.size++;
    	 }else {
    		 this.head=nn;
    		 this.size++;
    	 }
       }

     public void addLast(int iteam) {
    	 //Create a Node
    	 Node nn = new Node();
    	 nn.data=iteam;
    	 nn.next=null;
    	 
    	 //attached
    	 if(this.size>0) {
    		this.tail.next=nn;
    	 }
    	 //summary
    	 if(this.size==0) {
    		 this.head =nn;
    		 this.tail = nn;
    	 }else {
    		 
    		 this.tail = nn;
    		 
    	 }
    	 this.size++;
     }
     
//      O(n)
     public void addAt(int iteam,int idx) throws Exception  {
    	 if(idx < 0 || idx > size) {
    		 throw new Exception("Invalid index!!");
    	 }
    	 if(idx ==0 ) {
    		 addFirst(iteam);
    	 }else if(idx==this.size) {
    		 addLast(iteam);
    	 }else {
//    		 Create a Node
    		 Node nn =new Node();
    		 nn.data = iteam;
    		 nn.next = null;
//    		 attach
    		 Node nm1 = getNodeAt(idx-1);
    		 Node np1 = nm1.next;
    		 nm1.next=nn;
    		 nn.next=np1;
//    		 summary
    		 this.size++;
    		 
    	 }
     }

	 public int getAt(int idx)throws Exception {
		if(this.size==0) {
			throw new Exception("LL is Empty");
		}
			if(idx < 0 || idx >= this.size) {
				throw new Exception("Invalid Index!");
			}
			Node temp = this.head;
			for(int i=1;i<=idx;i++) {
				temp=temp.next;
				}
		
		return temp.data;
	}
	 private Node getNodeAt(int idx) throws Exception {
		if(this.size==0) {
			throw new Exception("LL is Empty");
		}
			if(idx < 0 || idx >= this.size) {
				throw new Exception("Invalid Index!");
			}
			Node temp = this.head;
			for(int i=1;i<=idx;i++) {
				temp=temp.next;
				}
		
		return temp;
	}
	
//	
	 public int getFirst() throws Exception{
		if(this.size==0) {
			throw new Exception("LL is Empty");
		}
		return this.head.data;
	}
		
	 public int size() {
		return this.size;
	}
	 public boolean isEmpty() {
	return this.size()==0;
}
//	O(1)
	 public int getLast() throws Exception{
		if(this.size==0) {
			throw new Exception("LL is Empty");
		}
		return this.tail.data;
	}
	
//	O(1)
	public int removeFirst() throws Exception{
		if(this.size == 0) {
			throw new Exception("LL is empty");
		}
		int rv = this.head.data;
		if(this.size==1) {
			this.head=null;
			this.tail=null;
			this.size=0;
			
		}else {
			this.head=this.head.next;
			this.size--;
			
		}
		return rv;
	}
//  O(n)
	public int removeAt(int idx) throws Exception{
		if(this.size == 0) {
			throw new Exception("LL is Empty");
		}
		if(idx <0 || idx >= this.size) {
			throw new Exception("Invalid !!");
		}
		if(idx ==0) {
			return removeFirst();
		}
		else if(idx == this.size-1) {
			return removeLast();
			
		}
		else {
			Node nm1 = getNodeAt(idx-1);
			Node n = nm1.next;
			Node np1 = n.next;
			nm1.next = np1;
			this.size--;return n.data;	
		}
		
	}

    public  int removeLast() throws Exception{
	if(this.size==0) {
		throw new Exception("LL is Empty");
	}
	int rv = this.tail.data;
	if(this.size==1) {
		this.head=null;
		this.tail=null;
		this.size=0;
	}else {
		Node sizem2 = getNodeAt(this.size-2);
		this.tail = sizem2;
		this.tail.next = null;
		this.size--;
	}
	return rv;
}
//    reverse 
    public void reversData() throws Exception {
    	int left = 0;
    	int right = this.size-1;
    	while(left<right) {
    		Node ln = getNodeAt(left);
    		Node rn = getNodeAt(right);
    		int temp = ln.data;
    		ln.data = rn.data;
    		rn.data = temp;
    		left++;
    		right--;
    	}
    }
    public void reversePointer() {
    	Node prev = this.head;
    	Node curr = prev.next;
    	while(curr.next!=null) {
    		Node ahead = curr.next;
    		curr.next = prev;
    		curr = ahead;
//    		swap
    		Node t =this.head;
    		this.head = this.tail;
    		this.tail = t;
    		this.tail.next = null;
    	}
    }
// mid point of linked list without using size
    public int mid() {
    	Node slow =this.head;
    	Node fast = this.head;
    	while(fast.next!=null && fast.next.next!=null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	return slow.data;
    }
    
}
