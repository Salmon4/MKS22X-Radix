public class MyLinkedList<E>{
	private int length;
	private Node start,end;

	public Node end(){
		return end;}
	public MyLinkedList(){
		length = 0;
	}


	public void extend(MyLinkedList<E> other){
		Node oldstart = other.start;
		Node oldend = other.end;
		length += other.size();
		end.setNext(oldstart);
		oldstart.setPrev(end);
		end = oldend;
		other.length = 0;
    }



	public int size(){
		return length;
	}




	public boolean add(int value){
		Node input = new Node(value, null, null);
		if (start == null){
			length++;
			start = input;
			return true;
		}
		if (start != null && end == null){
			length++;
			start.setNext(input);
			input.setPrev(start);
			end = input;
			return true;
		}
		if (start != null && end != null){
			length++;
			end.setNext(input);
			input.setPrev(end);
			end = input;
			return true;
		}
		return false;
	}

	public String toString(){
		if (length == 0){
			return "[]";
		}
		Node place = start;
		String ans = "[";
		for (int i = 0; i < length;i++){
			ans += place.getData();
			if (i != length - 1){
				ans += ", ";
			}
			place = place.next();

		}
		ans += "]";
		return ans;
	}

}
