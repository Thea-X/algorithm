package ADT;

/**
 * 链表的基础学习
 * @author Thea
 * QQ: 1508238221
 */
public class LinkedList {
	Node head = null;//链表头部的引用
	
	/**
	 * 项链表中插入数据
	 * 考虑特殊情况，快速返回结果
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
		//考虑边缘情况
		if(index < 0 || index > length()){
			return false;
		}
		
		//删除链表的第一个元素
		if(index == 0){
			head = head.next;
			return true;
		}
		 
		//以下是普遍的情况
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
	 * 对链表进行排序
	 * 返回排序后的头结点
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
		System.out.println("----------------打印生成的链表---------------");
		lists.printList();
		System.out.println("---------------打印链表的长度----------------");
		System.out.println(lists.length());	
		System.out.println("---------------测试链表删除节点的功能----------------");
		lists.deleteNode(1);
		lists.printList();
		System.out.println("---------------测试链表的排序功能----------------");
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