
public class LinkedList {
	Node head;
	
	public Node reverseList(Node head) {
		Node prev=null;
		Node curr=head;
		Node next=head;
		
		while(curr!=null) {
			next = curr.nextNodeRef;
			curr.nextNodeRef=prev;
			prev=curr;
			curr=next;
		}
		head = prev;
		return head;
	}
	
	public void addNode(Node newNode) {
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.nextNodeRef!=null) {
			temp=temp.nextNodeRef;
		}
		temp.nextNodeRef=newNode;
	}
	
	public void traverseAndPrint(Node head) {
		System.out.println("Elements of the linked list are");
		while(head!=null) {
			System.out.println(head.value);
			head=head.nextNodeRef;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedlist= new LinkedList();
		linkedlist.addNode(new Node(10));
		linkedlist.addNode(new Node(20));
		linkedlist.addNode(new Node(30));
		
		linkedlist.traverseAndPrint(linkedlist.head);
		
		linkedlist.traverseAndPrint(linkedlist.reverseList(linkedlist.head));
	}

}
