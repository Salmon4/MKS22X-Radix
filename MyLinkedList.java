public class MyLinkedList<E>{
	private int length;
	private Node start,end;

	public Node end(){
		return end;}
	public MyLinkedList(){
		length = 0;
	}
	public E removeFront(){
			E temp = (E)start.getData();
			if (size() == 1){
				clear();
				return temp;
			}
			start = start.next();
			start.setPrev(null);
			length--;
			return temp;
		}
	public void clear() {
	        this.length = 0;
	        this.start = null;
	        this.end = null;
	    }

	public void extend(MyLinkedList<E> other){
		if (other.size() == 0){
			return;
		}
		else{
			if (this.size() == 0){
				this.start = other.start;
				this.end = other.end;
				this.length = other.size();
				other.clear();
			}
			else{
				Node otherStart = other.getNthNode(0);
				end.setNext(otherStart);
				otherStart.setPrev(end);
				end = other.end;
				length += other.size();
				other.clear();
			}
		}
		/**
		Node oldstart = other.start;
		Node oldend = other.end;
		length += other.size();
		end.setNext(oldstart);
		oldstart.setPrev(end);
		end = oldend;
		other.length = 0;
		**/
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

	public Node getNthNode(int N){
		Node current;
		Node next;
		current = start;
		next = start.next();
		for (int i = 0; i < N; i++){
			current = next;
			next = current.next();
		}
		return current;
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
