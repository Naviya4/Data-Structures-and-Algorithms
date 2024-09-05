package Array;

public class Main {
    public static void main(String[] args) {

        Array arrOps = new Array(5);

        arrOps.append(10);
        arrOps.append(20);
        arrOps.append(30);
        arrOps.append(40);
        arrOps.append(50);
//        arrOps.printArray();

        arrOps.prepend(5);
//        arrOps.printArray();

        arrOps.removeFirst();
//        arrOps.printArray();

        arrOps.removeLast();
//        arrOps.printArray();

        int value = arrOps.get(0);
//        System.out.println(value);

        arrOps.set(1,15);
//        arrOps.printArray();

        arrOps.insert(2, 20);
//        arrOps.printArray();

        arrOps.remove(1);
//        arrOps.printArray();

        arrOps.reverse();
//        arrOps.printArray();

    }
}
