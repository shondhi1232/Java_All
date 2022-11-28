/*

1. Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>
 */

package String_Manipulation;

public class FindTransaction_ID {
    public static void main(String[] args) {
        String body = "<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";

        String array = body.substring(body.indexOf("TXN"),body.indexOf("TXN")+9);
        System.out.println("found world is :"+array);
    }
}
