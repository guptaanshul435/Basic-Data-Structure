//Conver Binary To decimal

class Node{
 int data;
 Node next;
 public Node(int data){
   this.data=data;
 }
}
class DecimalToBinary{
	static Node head,temp;
static int deciToBin(int data){
	int i=data%2;
	Node newNode=new Node(i);
	if(data==1){
		return 1;
	}
if(head==null){
	head=newNode;
}else{
	temp=head;
	while(temp.next!=null){
		temp=temp.next;
	}
	temp.next=newNode;
}
System.out.print(deciToBin((int)data/2));
return data%2;
}
public static void main(String args[]){
System.out.print(DecimalToBinary.deciToBin(22));
}
}