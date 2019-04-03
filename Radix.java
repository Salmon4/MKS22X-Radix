public class Radix{
  public static void radixsort(int[] data){
    int max = 0;
    for (int i = 0; i < data.length; i++){
      if (data[i] > max){
        max = data[i];
      }
    }
    int maxdigits = String.valueOf(max).length();

    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    for(int i = 0; i < buckets.length; i++){
      buckets[i] = new MyLinkedList<>();
    }

    for (int i = 0; i < data.length; i++){
      int ones = data[i] % 10;
      if (data[i] < 0){
        buckets[].add() //positive
      }
      else{
        buckets[].add() //negative
      }
    }

    MyLinkedList<Integer> data2 = new MyLinkedList<>();
    for (int i = 0; i < buckets.length; i++){
      data2.extend(buckets[i]);
    }

    for (int currentDigit = 1; currentDigit < maxdigits; currentDigit++){
      
    }
    //for (int i = 0; i < data.length; i++){
    //  data2.add(data[i]);
    //}
    //for (int deciPlace = 1; max/deciPlace > 0; deciPlace *= 10){
      //deciSort(data2,deciPlace);
    //}

  }

/**
  private static void deciSort(MyLinkedList data, int num){
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    for (int i = 0; i < data.size();i++){
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


    buckets[0].extend(bucket[1]);
    buckets[0].extend(bucket[2]);
    buckets[0].extend(bucket[3]);
    buckets[0].extend(bucket[4]);
    buckets[0].extend(bucket[5]);
    buckets[0].extend(bucket[6]);
    buckets[0].extend(bucket[7]);
    buckets[0].extend(bucket[8]);
    buckets[0].extend(bucket[9]);
    data = bucket[0];
  }
  **/
}
