// (C) Garbage Collection in Java

class GarbageCollector{
  public static void main(String args[]){
    Runtime r = Runtime.getRuntime();
    long mem1, mem2;
    Integer s[] = new Integer[1000];
    System.out.println("Total memory is: " + r.totalMemory());
    mem1 = r.freeMemory();
    System.out.println("Total free memory: " + mem1);
    r.gc();
    mem1 = r.freeMemory();
    System.out.println("After garbage collection: " + mem1);
    for (int i=0; i<1000; i++){
      s[i] = i;
    }
    mem2 = r.freeMemory();
    System.out.println("Free memory after allocation:" + mem2);
    System.out.println("Memory used by allocation: " + (mem1-mem2));
    for (int i=0; i<1000; i++){
      s[i] = null;
    }
    r.gc();
    mem2 = r.freeMemory();
    System.out.println("Free memory after collecting discarded integers: " + mem2);
  }
}

