public class Main {

    public static void main(String[] args) {

        FixedSizeArray<Integer> array = new FixedSizeArray(5);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(5);

        System.out.println(array);
        System.out.println(array.size());

    }
}
