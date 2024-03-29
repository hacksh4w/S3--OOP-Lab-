// (B) Multithreading
import java.util.Random;

class RandomNumbers extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      Random rd = new Random();
      int randomInteger = rd.nextInt(100);
      System.out.println("Random Number generated is : " + randomInteger);
      if ((randomInteger % 2) == 0) {
        SquareThread sThread = new SquareThread(randomInteger);
        sThread.start();
      } else {
        CubeThread cThread = new CubeThread(randomInteger);
        cThread.start();
      }
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}

class SquaresThread extends Thread {
  int number;
  SquaresThread(int randomNumbern) {
    number = randomNumbern;
  }
  public void run() {
    System.out.println("Square of " + number + " = " + (number * number));
  }
}

class CubesThread extends Thread {
  int number;
  CubesThread(int randomNumbern) {
    number = randomNumbern;
  }

  public void run() {
    System.out.println("Cube of " + number + "  = " + (number * number * number));
  }
}

public class MultipleThreads {
  public static void main(String args[]) {
    RandomNumbers rn = new RandomNumbers();
    rn.start();
  }
}
