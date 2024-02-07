package linkedList;
public class LinkedListTester {
	public static void main(String[] args) {
		// create implementation, then...
		LinkedListImpl tested = new LinkedListImpl();
		tested.addItem("Dog");
		tested.addItem("Frog");
		tested.addItem("Bird");
		tested.addItem("Cat");
		tested.addItem("Bird");
		tested.addItem("Fish");
		
		tested.listItems();
		
		System.out.println(); //adding space
		
		System.out.println(tested.isItemInList("Tree"));
		System.out.println(tested.isItemInList("Frog"));
		System.out.println(tested.isItemInList("Dog"));
		System.out.println(tested.isItemInList("Fish"));
		
		System.out.println();
		
		System.out.println("Item count: " + tested.itemCount());
		
		System.out.println(); //adding space
		
		tested.deleteItem("Dog");
		
		tested.insertBefore("squirrel", "Bird");
		tested.insertAfter("Snake", "Cat");
		
		tested.listItems();


	}
}

