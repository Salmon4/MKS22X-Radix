public class MyLinkedList{
	private int length;
	private Node start,end;

	public Node end(){
		return end;}
	public MyLinkedList(){
		length = 0;
	}


	public void extend(MyLinkedList other){
		Node oldstart = other.start;
		Node oldend = other.end;
		length += other.size();
		end.setNext(oldstart);
		oldstart.setPrev(end);
		end = oldend;
		other.length = 0;
    }

	private Node getNthNode(int N){
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

	public Integer get(int index){
		if(index < 0 || index > length - 1){
			throw new IndexOutOfBoundsException("Index is negative or too big");
		}
		return getNthNode(index).getData();
	}

	public Integer set(int index, Integer value){
		if (index < 0 || index > length - 1){
			throw new IndexOutOfBoundsException("Index is negative or too big");
		}
		Integer old;
		Node place = getNthNode(index);
		old = place.getData();
		place.setData(value);
		return old;
	}

	public int size(){
		return length;
	}

	public boolean contains(Integer value){
		Node current;
		Node next;
		current = start;
		next = start.next();
		for (int i = 0; i < length; i++){
			if (current.getData() == value){
				return true;
			}
			current = next;
			if (i != length - 1){
			next = current.next();}
		}
		return false;
	}

	public int indexOf(Integer value){
		Node current;
		Node next;
		current = start;
		next = start.next();
		for (int i = 0; i < length; i++){
			if (current.getData() == value){
				return i;
			}
			current = next;
			next = current.next();
		}
		return -1;
	}

	public void add(int index, Integer value){
		if (index  < 0 || index > length){
			throw new IndexOutOfBoundsException("Index is negative or too big");
		}
		Node current;
		Node next;
		Node prev;
		current = start;
		next = current.next();
		prev = current.prev();
		Node input = new Node(value, null,null);
		if (index == 0){
			input.setNext(current);
					input.setPrev(current.prev());
					current.setPrev(input);
					current.setNext(next);
					next = current.next();
					prev = current.prev();
					start = input;
					length++;
		}
		for (int i = 0; i < index; i++){
			if (i == index-1){
				if (i == index-1){
				input.setNext(current.next());
				input.setPrev(current);
				current.setNext(input);
				current = input;
				length++;
				end = input;
				}
			}
			else{
			current = next;
			next = current.next();
			prev = current.prev();}
		}
	}



	public boolean remove(Integer value){
		Node current;
		Node next;
		Node prev;
		current = start;
		next = start.next();
		prev = start.prev();
			for (int i = 0; i < length; i++){
				if (current.getData() == (int)value){
					if (i == 0){
						start = current.next();
						length--;
						return true;
					}
					if (i == length - 1){
						prev.setNext(next);
						end = prev;
						length--;
						return true;
					}

						length--;
						prev.setNext(next);
						next.setPrev(prev);
						current = next;
						next = next.next();
						prev = next.prev();
						return true;

				}
				else{
					current = next;
					if (i != length - 1){
						//current = next;
						next = current.next();
					}
					prev = current.prev();

				}
			}
		return false;
	}



	public Integer remove(int index){
		if (index < 0 || index > length - 1){
			throw new IndexOutOfBoundsException("Index is negative or too big");
		}
		Node current;
		Node next;
		Node prev;
		Integer old = null;
		current = start;
		next = start.next();
		prev = start.prev();
		Node a = start;
		if (index == 0){
			old = start.getData();
			prev = start;
			current = start.next();
			current.setPrev(null);
			start = current;
			length--;
			return old;
		}
		if (index == length - 1){
			old = end.getData();
			prev = end.prev();
			prev.setNext(end.next());
			end = prev;
			length--;
			return old;
		}
		for (int i = 0; i < index; i++){
			if (i == index - 1){
				old = next.getData();
				current.setNext(next.next());
				next.next().setPrev(current);
				length--;
			}
			else{
				current = next;
				next = current.next();
				prev = current.prev();
			}
		}
		return old;
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
