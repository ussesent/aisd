public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        // Добавляем элементы
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Просмотр первого элемента
        System.out.println("Первый элемент: " + queue.peek()); // 10

        // Извлекаем элементы
        System.out.println("Извлечено: " + queue.removed());   // 10
        System.out.println("Извлечено: " + queue.removed());   // 20

        // Добавляем еще
        queue.add(40);

        // Проверяем пуста ли очередь
        System.out.println("Очередь пуста? " + queue.isEmpty()); // false

        // Извлекаем оставшиеся
        System.out.println("Извлечено: " + queue.removed());   // 30
        System.out.println("Извлечено: " + queue.removed());   // 40

        // Проверяем пустую очередь
        System.out.println("Очередь пуста? " + queue.isEmpty()); // true
    }
}