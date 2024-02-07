package linkedList;
public class LinkedListImpl implements LinkedList {
	
	ListItem head;
	
	public Boolean isItemInList(String thisItem)
	// true if it is, false if not
	{
		ListItem current = head;
		while(current != null) {
			if(current.getData().equalsIgnoreCase(thisItem))
				return true;
			current = current.next;
		}
		return false;
	}
	
	public Boolean addItem(String thisItem)
	// true if added, false if it was already there, or an error
	{
		//if it was already there
		if(isItemInList(thisItem) == true)
			return false;
		
		if(head == null) {
			head = new ListItem(thisItem);
			return true;
		}
		
		//else
		//set head to local Node current
		//step thru each element in the list, checking if the .next of this node is null
		//once found, create a new node out of incoming data & set that to current.next
		
		ListItem current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new ListItem(thisItem);
		return true;
	}
	
	public Integer itemCount()
	{
		int count = 0;
		ListItem current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void listItems()
	{
		ListItem current = head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.next;
		}
	}
	@Override
public Boolean deleteItem(String thisItem) {
		// TODO Auto-generated method stub
		if(head == null) {
			return false;
		}
		if(head.getData() == thisItem) {
			head = head.next;
			return true;
		}
		
		ListItem current = head;
		while(current != null) {
			if(current.next.getData().equalsIgnoreCase(thisItem)) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}
		
		return false;
	}


	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		if(head == null) {
			return false;
		}
		
		ListItem current = head;
		while(current != null) {
			if(current.next.getData().equalsIgnoreCase(itemToInsertBefore)) {
				ListItem node = new ListItem(newItem);
				node.next = current.next;
				current.next = node;
				return true;
			}
			current = current.next;
		}
		
		return false;
	}


	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		ListItem current = head;
		while(current != null) {
			if(current.getData().equalsIgnoreCase(itemToInsertAfter)) {
				ListItem node = new ListItem(newItem);
				node.next = current.next;
				current.next = node;
				return true;
			}
			current = current.next;
		}
		
		return false;
	}


	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
}



