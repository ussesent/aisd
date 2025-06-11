public class Main {
    public static void main(String[] args) {
        MyHashMap<Key, String> map = new MyHashMap<>();

        Key key1 = new Key("one");
        Key key2 = new Key("two");

        // Добавляем элементы
        map.put(key1, "Apple");
        map.put(key2, "Banana");

        // Получаем значения
        System.out.println("one -> " + map.get(key1));  // Apple
        System.out.println("two -> " + map.get(key2));  // Banana

        // Удаляем один элемент
        map.remove(key1);
        System.out.println("one after remove -> " + map.get(key1));  // null

        // Проверяем наличие
        System.out.println("Contains 'two': " + map.containsKey(key2));  // true
    }
}