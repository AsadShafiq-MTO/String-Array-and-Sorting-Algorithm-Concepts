package LinkedList;

public class Main {

	public static void main(String[] args) {
		
		String str="";
		Node node=new Node(str);
		node.addfirst("ad");
		node.addfirst("as");
		node.print();
		node.addLast("ba");		
		node.print();
//		node.deleteFirst();
//		node.print();
//		node.deleteLast();
//		node.print();
		node.reverseItrative();
		node.print();
	}
	
}
