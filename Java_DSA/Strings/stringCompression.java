
public class stringCompression {

    public static String compressString(String str) {

        StringBuilder str_1 = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {

            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            str_1.append(str.charAt(i));
            if (count > 1) {
                str_1.append(count.toString());
            }
        }

        return str_1.toString();
    }

    public static void main(String[] args) {

        String str = "aaabbbbccccccd";

        System.out.println(compressString(str));

    }
}
