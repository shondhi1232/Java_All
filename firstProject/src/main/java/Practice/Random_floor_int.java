package Practice;

public class Random_floor_int {
    public static void main(String[] args) {

        // In this action always consider the value with decimal numbers
        Double random = Math.random();
        System.out.println(random * 10);

        // always consider the number of 1st part of value and decimal part will consider zero
        System.out.println(Math.floor(random * 10));

        // only exact value will show
        int max = 10;
        int min = 5;
        double rand = Math.random()*(max - min) + min;
        System.out.println((int) Math.floor(rand));



    }
}
