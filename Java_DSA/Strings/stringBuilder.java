public class stringBuilder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("hello");

        for(char ch = 'a';ch<='z';ch++){
            str.append(" "+ch);
        }
        System.out.println(str);
    }
    
}
