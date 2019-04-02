public class Radix{
  public static void radixsort(int[]data){
    int max = 0;
    for (int i = 0; i < data.length; i++){
      if (data[i] > max){
        max = data[i];
      }
    }

    for (int deciPlace = 1; max/deciPlace > 0; deciPlace *= 10){
      deciSort(data,deciPlace);
    }

  }

  private static void deciSort(int[]data, int num){
    MyLinkedList<Integer> zeros = new MyLinkedList();
    MyLinkedList<Integer> ones = new MyLinkedList();
    MyLinkedList<Integer> twos = new MyLinkedList();
    MyLinkedList<Integer> threes = new MyLinkedList();
    MyLinkedList<Integer> fours = new MyLinkedList();
    MyLinkedList<Integer> fives = new MyLinkedList();
    MyLinkedList<Integer> sixs = new MyLinkedList();
    MyLinkedList<Integer> sevens = new MyLinkedList();
    MyLinkedList<Integer> eights = new MyLinkedList();
    MyLinkedList<Integer> nines = new MyLinkedList();
    for (int i = 0; i < data.length;i++){
      int currentDigit = (data[i]/num)%10;
      if (){}
    }
  }
}
