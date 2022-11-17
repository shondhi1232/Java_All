package Practice;

public class email_with_random {
    public static void main(String[] args) {


        //random email can be generate
        int max = 200;
        int min = 150;
        double rand = Math.random()*(max - min) + min;
        int id = (int) Math.floor(rand);
        System.out.println("testmail"+id+"@test.com");
    }
}
