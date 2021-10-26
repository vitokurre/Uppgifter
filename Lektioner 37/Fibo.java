public class Fibo{


  public static void main(String[] args) {
    System.out.print("Fibnacci sequence: ");
    for(int i=1; i<6; i++){
      System.out.print(fibonacciSeq(i)+"  ");
    }
  }


    public static int fibonacciSeq(int i){
      if (i == 1 || i ==2){
        return 1;
      }

      return fibonacciSeq(i-2) + fibonacciSeq(i-1);
    }


  }
/*
exempel
fibonacciSeq(4)=
=fibonacciSeq(2)+fibonacciSeq(3)=
=fibonacciSeq(2)+fibonacciSeq(1)+fibonacciSeq(2)=
= 0+1+1=2
*/
