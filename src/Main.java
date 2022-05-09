

public class Main {

    public static void main(String[] args) {

    TransposeList<Integer> list = new TransposeList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.find(6);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add(10);
        System.out.println(list);
        System.out.println(list.find(6));
        System.out.println(list.remove(3));
        list.add(3);
        System.out.println(list);
    }
}