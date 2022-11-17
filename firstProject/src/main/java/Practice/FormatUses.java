package Practice;

public class FormatUses {
    public static void main(String[] args) {

        //2f means always count after point 2 decomal number
        double a = 125.251191021;
        System.out.println(String.format("%.2f",a));

        //3f means always count after point 3 decomal number
        System.out.println(String.format("%.3f",a));
    }
}
