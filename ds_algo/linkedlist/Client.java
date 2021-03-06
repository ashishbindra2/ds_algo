package linkedlist;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        LinkedList ls = new LinkedList();
        ls.display();
        ls.addFirst(10);
        ls.display();
        ls.addLast(20);
        ls.display();
        ls.addFirst(20);
        ls.display();
        System.out.println(ls.getAt(1));
        System.out.println(ls.getFirst());
        System.out.println(ls.removeFirst());
        ls.display();
        ls.reversData();
        ls.display();
	}

}
