package Chapter_8_Generic_Programming;

public class Generic_Array {

    public static void main(String[] args) {
        Comparable[] names = ArrayAlg2.minmax("Tom", "Dick", "Harry");
        System.out.println(names);
    }


}
class ArrayAlg2{
    public static <T extends Comparable> T[] minmax(T... a)
    {
        //不能创建发你下那个数组，就是不同用T[]
        var mm = new Comparable[2]; // ERROR
        return (T[]) mm;
    }
}