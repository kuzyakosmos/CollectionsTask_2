public class Main {

    public static void main(String[] args) {

        MyArray<Integer> myArray = new MyArray<Integer>(5);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(5);

        System.out.println(myArray);
        System.out.println(myArray.size());

    }
}
