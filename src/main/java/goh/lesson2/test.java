package goh.lesson2;

public class test {

  public static void main(String[] args) {
    //
    System.out.println(new A().plus(1,2));

    //
    new B() {
      @Override
      public int plus(int a, int b) {
        return a+b;
      }
    };

    //
    B b1 = (a, b) -> a+b;
    B b2 = Integer::sum;
    System.out.println(b1.plus(1,2) + b2.plus(1,2));

  }
}

@FunctionalInterface
interface B{
  int plus(int a, int b);
}

class Super {
  void sout(int n){

  }
  public static class child{
    int num;
  }
}


class A implements B{

  @Override
  public int plus(int a, int b) {
    return  a+b;
  }
}








