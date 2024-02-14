package stack; 

public class StackImpl implements Stack {

	@Override
	public void push(String s) {
	
		System.out.println("thing i added to stack: " + s);
	
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		if (top == -1)
			return true;
		else
			return false;
	}

	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		if (top+1 == size)
			return true;
		else
			return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return elements[top];
	}

	@Override
	public void setCapacity(int size) {
		// TODO Auto-generated method stub
		elements = new String[size];
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for (String s : elements)
			System.out.println(s);
	}
 

}
