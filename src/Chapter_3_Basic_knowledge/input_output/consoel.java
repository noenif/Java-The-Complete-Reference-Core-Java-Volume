package Chapter_3_Basic_knowledge.input_output;


import java.io.Console;

public class consoel {
    public static void main(String[] args) {
        Console cons;
        char[] passwd;
        //System.console没有的话就是null
        //console是为了安全而设计的
        if((cons = System.console()) != null &&(passwd = cons.readPassword("[%s]", "Password:")) != null) {
            java.util.Arrays.fill(passwd, ' ');
        }

    }

}
