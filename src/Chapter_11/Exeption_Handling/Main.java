package Chapter_11.Exeption_Handling;

public class Main {

    public static void main(String args[]) {

        int a = args.length;

        int b = 42 / a;
        System.out.println("a = " + a);

        for (var i = 0; i < 5; i++) {
            if (i == 1) {
                var l = i / 0;
            } else {
                var l = i / 2;
            }
        }


    }
}



