package linkedList;


public class LinkedListImpl implements LinkedList {
	ListItem head;

	//N
	@Override
	public Boolean isItemInList(String thisItem) {
		// true if it is, false if not
		ListItem current = head;
		while(current != null) {
			if(current.getData().equalsIgnoreCase(thisItem)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}


	//N
	@Override
	public Boolean addItem(String thisItem) {
		//if it was already there
		if(isItemInList(thisItem) == true) {
			return false;
		}

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


	//N
	@Override
	public Integer itemCount() {
		int count = 0;
		ListItem current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	//N
	@Override
	public void listItems() {
		ListItem current = head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.next;
		}
	}


	//C
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

	//C
	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		if(head == null) {
			return false;
		}

		if(head.getData().equalsIgnoreCase(itemToInsertBefore)) {
			ListItem node = new ListItem(newItem);
			node.next = head.next;
			head.next = node;
			return true;
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

	//C
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

	//C
	@Override
	public void sort() {
		ListItem current = head;
		while(current != null) {
			ListItem min = current;
			ListItem minNext = current.next;
			while(minNext != null) {
				if(minNext.data.compareTo(min.data) < 0) {
					min = minNext;
				}
			}
			
			String temp = current.data;
			current.data = min.data;
			min.data = temp;

			current = current.next;
			}
	}
}
