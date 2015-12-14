package ADT;

/**
 * ����Ļ���ѧϰ
 * @author Thea
 * QQ: 1508238221
 */
public class LinkedList {
	Node head = null;//����ͷ��������
	
	/**
	 * �������в�������
	 * ����������������ٷ��ؽ��
	 * @param d
	 */
	public Node addNode(int d){
		Node newNode = new Node(d);
		if(head == null){
			head = newNode;
			return newNode;		
		}
		
		Node tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;			
		}
		tmp.next = newNode;
		return newNode;
	}
	
	public Boolean deleteNode(int index){
		//���Ǳ�Ե���
		if(index < 0 || index > length()){
			return false;
		}
		
		//ɾ������ĵ�һ��Ԫ��
		if(index == 0){
			head = head.next;
			return true;
		}
		 
		//�������ձ�����
		int i = 0;
		Node preNode = head;
		Node curNode = preNode.next;
		while (curNode != null) {
			if(i == index){
				preNode.next = curNode.next;
				return true;
			}
			
			preNode = curNode;
			curNode = curNode.next;
			i ++;
		}
		return true;
		
	}
	/**
	 * �������������
	 * ����������ͷ���
	 * @return
	 */
	public Node orderList(){
		Node nextNode = null;
		int tmp = 0;
		Node curNode = head;
		while(curNode.next != null){
			nextNode = curNode.next;
			while(nextNode != null){
				if(curNode.data > nextNode.data){
					tmp = curNode.data;
					curNode.data = nextNode.data;
					nextNode.data = tmp;
				}
				
				nextNode = nextNode.next;
			}
			
			curNode = curNode.next;
		}
		
		return head;
	}
	
	public int length() {
		int length = 0;
		Node tmp = head;
		while(tmp != null){
			length ++;
			tmp = tmp.next;
		}
		
		return length;
	}
	
	public void printList(){
		Node tmp =head;
		while(tmp != null){
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList lists = new LinkedList();
	    lists.addNode(5);	
		lists.addNode(3);
		lists.addNode(2);
		System.out.println("----------------��ӡ���ɵ�����---------------");
		lists.printList();
		System.out.println("---------------��ӡ����ĳ���----------------");
		System.out.println(lists.length());	
		System.out.println("---------------��������ɾ���ڵ�Ĺ���----------------");
		lists.deleteNode(1);
		lists.printList();
		System.out.println("---------------���������������----------------");
		lists.orderList();
		lists.printList();
	}
}

class Node{
	Node next = null;
	int data;
	public Node(int data){
		this.data = data;
	}
}