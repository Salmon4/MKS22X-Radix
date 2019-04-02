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
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    for (int i = 0; i < data.length;i++){
      int currentDigit = (data[i]/num)%10;
      if (currentDigit == 0){
        buckets[0].add(data[i]);
      }
      if (currentDigit == 1){
        buckets[1].add(data[i]);
      }
      if (currentDigit == 2){
        buckets[2].add(data[i]);
      }
      if (currentDigit == 3){
        buckets[3].add(data[i]);
      }
      if (currentDigit == 4){
        buckets[4].add(data[i]);
      }
      if (currentDigit == 5){
        buckets[5].add(data[i]);
      }
      if (currentDigit == 6){
        buckets[6].add(data[i]);
      }
      if (currentDigit == 7){
        buckets[7].add(data[i]);
      }
      if (currentDigit == 8){
        buckets[8].add(data[i]);
      }
      if (currentDigit == 9){
        buckets[9].add(data[i]);
      }
    }
  }
}
