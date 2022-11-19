package Practice;

public class method {

    public int doSum(int num1, int num2){

        return num1+num2;
    }

    public int doMultiply(int num){

        return num*5;
    }


    public static void main(String[] args) {

      method m = new method();
      int sum =m.doSum(4,4);

      System.out.println(m.doMultiply(sum));

    }
}
