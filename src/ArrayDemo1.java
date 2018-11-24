public class ArrayDemo1 {
    public static void main(String args[]){
        SortArray a = null;
        a = new SortArray(6);
        System.out.print(a.add(23) + "\t");
        System.out.print(a.add(21) + "\t");
        System.out.print(a.add(2) + "\t");
        System.out.print(a.add(42) + "\t");
        System.out.print(a.add(5) + "\t");
        System.out.print(a.add(6) + "\n");
        print(a.getArray());
    }
    public static void print(int i[]){
        for (int x = 0; x < i.length; x++) {
            System.out.print(i[x] + "   \t");
        }

    }
}
