package lab2_assignment;

public class ListElement {
private ListElement head;
private ListElement next;
private ListElement previous;
private int data;


public ListElement ()
{
this.data = 0;
this.next = null;
this.previous = null;
}

public void addElement(ListElement le,int data)
{
	
	ListElement new_node = new ListElement();	
	new_node.setData(data);
	new_node.setNext(null);
	
	
	if (le.head == null)
	{
		le.head = new_node;	
	}
	else 
	{
		ListElement temp = le.head;
		while (temp.next != null)
		{
		temp=temp.next;
		}
		temp.next = new_node;	
     }
}


public ListElement getElement(ListElement ls,int index)
{
	ListElement temp =ls.head;
	
	while(temp.data != index && temp.next !=null)
	{
		temp=temp.next;
	}		
	return temp;
	
}
public ListElement deleteElement(int index)
{
	
	
	
	return next;
}
public void printLinkedListTail(ListElement ls)
{
	
	
	if (ls == null) return;

	printLinkedListTail(ls.next);
	System.out.print(ls.data + " ");

	
		
}
public void printLinkedListHead(ListElement ls)
{
	ListElement curr = ls.head;
	System.out.print("List: ");

	while (curr != null) {
		
		System.out.print(curr.data + " ");
		curr= curr.next;
	}
		
}


public ListElement getNext() {
	return next;
}
public void setNext(ListElement next) {
	this.next = next;
}
public ListElement getPrevious() {
	return previous;
}
public void setPrevious(ListElement previous) {
	this.previous = previous;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}

public ListElement getHead() {
	return head;
}

public void setHead(ListElement head) {
	this.head = head;
}


public static void main(String[] args)
{
	ListElement ls = new ListElement();
	
    ls.addElement(ls, 1);
    ls.addElement(ls, 2);
    ls.addElement(ls, 3);
    ls.addElement(ls, 4);
    ls.addElement(ls, 5);
    ls.addElement(ls, 6);
    ls.addElement(ls, 7);
    
    
    ls.printLinkedListHead(ls);
 
    System.out.print("Reversed List: ");
    ls.printLinkedListTail(ls.head);

}
}