import java.util.Arrays;

public class Radix {
  @SuppressWarnings("unchecked")
  public static void radixsort(int[] data) {
    if (data.length == 0) return;
    int max = data[0];
    for (int x = 0; x < data.length; x++) {
      if (data[x] > max) max = data[x];
    }
    int maxDigits = String.valueOf(max).length();
    //@SuppressWarnings("unchecked")
    MyLinkedList<Integer>[] buckets = new MyLinkedList[20];
    for (int i = 0; i < buckets.length; i++) {
      buckets[i] = new MyLinkedList();
    }
    MyLinkedList data2 = new MyLinkedList();

    for (int i = 0; i < maxDigits; i++) {
      for (int j = 0; j < data.length; j++) {
        int ans = (data[j]/(int)Math.pow(10,i))%10;
      if (data[j] > 0) {
        buckets[10+Math.abs(ans)].add(data[j]);
      } else {
        buckets[9-Math.abs(ans)].add(data[j]);
        }
      }
      for (int k = 0; k < buckets.length; k++) {
        data2.extend(buckets[k]);
      }
      for (int l = 0; i < data.length; l++) {
        data[l] = (int)data2.removeFront();
      }
    }
  }


  public static void main(String[]args){
  System.out.println("Size\t\tMax Value\tquick/builtin ratio ");
  int[]MAX_LIST = {1000000000,500,10};
  for(int MAX : MAX_LIST){
    for(int size = 31250; size < 2000001; size*=2){
      long qtime=0;
      long btime=0;
      //average of 5 sorts.
      for(int trial = 0 ; trial <=5; trial++){
        int []data1 = new int[size];
        int []data2 = new int[size];
        for(int i = 0; i < data1.length; i++){
          data1[i] = (int)(Math.random()*MAX);
          data2[i] = data1[i];
        }
        long t1,t2;
        t1 = System.currentTimeMillis();
        Radix.radixsort(data2);
        t2 = System.currentTimeMillis();
        qtime += t2 - t1;
        t1 = System.currentTimeMillis();
        Arrays.sort(data1);
        t2 = System.currentTimeMillis();
        btime+= t2 - t1;
        if(!Arrays.equals(data1,data2)){
          System.out.println("FAIL TO SORT!");
          System.exit(0);
        }
      }
      System.out.println(size +"\t\t"+MAX+"\t"+1.0*qtime/btime);
    }
    System.out.println();
  }
}
}


/**
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
        buckets[9 + ones].add(data[i]); //positive
      }
      else{
        buckets[10 + ones].add(data[i]); //negative
      }
    }

    MyLinkedList<Integer> data2 = new MyLinkedList<>();
    for (int i = 0; i < buckets.length; i++){
      data2.extend(buckets[i]);
    }

    Node currentNode = data2.getNthNode(1);
    for (int currentDigit = 1; currentDigit < maxdigits; currentDigit++){
      for (int i2 = 0; i2 < data2.size(); i2++){
        //System.out.println("" + (int)currentNode.getData());
        int value = (int)currentNode.getData();
        int place = (value / power(data[currentDigit])) % 10;
        if (value < 0){
          buckets[9 + place].add(value);
        }
        else{
          buckets[10 + place].add(value);
        }
        currentNode = currentNode.next();
      }
      for (int i = 0; i < buckets.length; i++){
        data2.extend(buckets[i]);
      }
    }
    int j = 0;
    currentNode = data2.getNthNode(0);
    for (int i = 0; i < data2.size(); i++){
      data[j] = (int)currentNode.getData();
      j++;
      currentNode = currentNode.next();
    }
  }


    //for (int i = 0; i < data.length; i++){
    //  data2.add(data[i]);
    //}
    //for (int deciPlace = 1; max/deciPlace > 0; deciPlace *= 10){
      //deciSort(data2,deciPlace);
    //}



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
