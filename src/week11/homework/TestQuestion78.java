package week11.homework;

/**
 * Java certification questions. The result is true, false, This question is about the difference between .equals method and == sign.
 */
public class TestQuestion78 {
    public static void main(String[] args) {
        String str1 = "Java";
        String [] str2 = {"J", "a", "v", "a"};
        String str3 = "";
        for (String str: str2
             ) {
            str3 = str3 + str;
        }
        System.out.println(str3);
        boolean b1 = (str1.equals(str3));
        boolean b2 = (str1 == str3);
        System.out.println(b1 + ", " + b2);
    }
}
