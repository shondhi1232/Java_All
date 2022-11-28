package StringPractice;

public class String_Array_Split {
    public static void main(String[] args) {

        String_Array_Split Mystr = new String_Array_Split();
        String str = "I love dhaka";
        String money = "300.46";

        Mystr.SplitIndexValue(str);
        Mystr.splitAllWord(str);
        Mystr.arrayLnegth(str);
        Mystr.DotSplit(money);
        Mystr.findWord();
    }
    public void splitAllWord( String str){
        String[] array=str.split(" ");
        for (int i=0;i< array.length;i++){

            System.out.println("Splited all world show from array: "+array[i]);
        }
    }
    public void SplitIndexValue(String str){
        String OnlyWordSplit = str.split(" ")[1];

        System.out.println("show splited only index full word :"+OnlyWordSplit);
    }

    public void arrayLnegth(String str){
        int WordLength = str.split(" ").length;
        System.out.println("show array full word length :"+WordLength);
    }

        public void DotSplit(String money){
        String tk = money.split("\\.")[0];
        String paisa = money.split("\\.")[1];
        System.out.println("Tk and Paisa :"+tk+" "+paisa);
    }

    public void findWord(){
        String sen = "I need refreshment so that I can calm my mind and again start my study with fresh mind";

        /////////////////////////////starting index and ending index define ////////////
        String array = sen.substring(sen.indexOf("mi"),sen.indexOf("mi")+5);
        System.out.println("found world is :"+array);
    }

}
