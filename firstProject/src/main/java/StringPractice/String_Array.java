package StringPractice;

public class String_Array {
    public static void main(String[] args) {

        String_Array string = new String_Array();
       // String greet = "hello world";
        //string.ConvertToCharArray(greet);
        string.ConvertToCharArray("Hello world");

        //Getlength method
        int lenValue = string.GetLength("Salam");
        System.out.println(lenValue);

        string.returnChar();
        string.Use_IndexOf();
        string.Use_Of_Contain();


        string.String_replace();

    }
    public void ConvertToCharArray(String str){

        // converting into character array
        char ch [] = str.toCharArray();
        // printing index no. 2 value
        System.out.println(ch[2]);

    //printing all index value
        for (int i=0;i< ch.length;i++){

            System.out.println("String array value is "+ch[i]);

        }
    }
    public int GetLength(String strlen){
        return strlen.length();
    }

    public void returnChar(){
        String m = "Ammu";
        char ch = m.charAt(0);
        System.out.println("Char array value is "+ch);
    }

    public void Use_IndexOf(){
        String s = "Love";
       int mylove = s.indexOf("v");
        System.out.println("Index of value is "+mylove);
    }

    public void Use_Of_Contain(){
        String heart = "Love you love";
        String beat = "love";
        boolean test = heart.contains(beat);
        System.out.println(test);

    }
    public void String_replace(){
        String str = "love beat";
        String re= str.replace("love","heart");
        System.out.println("replace value : "+re);
    }
}
