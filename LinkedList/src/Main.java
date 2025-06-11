public class Main {

    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();
        list.add("Java");
        list.add("is");
        list.add("best");

        list.remove("is");
        System.out.println(list.get(1));
    }
}