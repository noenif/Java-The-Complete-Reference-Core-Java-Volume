package Chapter_3_Basic_knowledge.String;

public class String_basic {
    public static void main(String[] args) {
        String greeting = "Hello";
    //码点
        char first = greeting.charAt(0);
        //代码单元
        int cp = greeting.codePointAt(1);
        System.out.println(first);
        System.out.println(cp);
    }
}
