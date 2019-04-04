public class Node<T>{
 private T data;
 private Node next,prev;
	public Node(T d, Node n, Node p){
		data = d;
		next = n;
		prev = p;
	}

	public T getData(){
		return data;
	}

	public T setData(T i){
		T temp = data;
		data = i;
		return data;
	}

	public Node next(){
		return next;
	}

	public Node prev(){
		return prev;
	}

	public void setNext(Node other){
		next = other;
	}

	public void setPrev(Node other){
		prev = other;
	}

	public String toString(){
		String ans = "" + data;
		return ans;
	}


}
