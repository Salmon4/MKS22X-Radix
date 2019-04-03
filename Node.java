public class Node{
 private Integer data;
 private Node next,prev;
	public Node(T d, Node n, Node p){
		data = d;
		next = n;
		prev = p;
	}

	public Integer getData(){
		return data;
	}

	public Integer setData(T i){
		Integer temp = data;
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
