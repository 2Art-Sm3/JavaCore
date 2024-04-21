package lr3.Example11;


import java.util.Scanner;

public class List0 {

    static Scanner scanner = new Scanner(System.in);
    private static int i = 1;
    private static int j = 1;
    private static Node head0 = null;

//    Метод для создания списка с головы
    public static Node createHead() {
        Node head = null;
        Node tail = null;

        System.out.println("Введите кол-во элементов списка");
        int count = scanner.nextInt();

        for (int i = 0 ; i < count ; i++) {
            System.out.println("Введите " + (i + 1) + " элемент списка");
            int value = scanner.nextInt();
            Node newNode = new Node(value, null);
            if (head == null) {
                head = newNode; // Первый элемент становится и головой, и хвостом
                tail = newNode;
            } else {
                tail.next = newNode; // Связываем текущий хвост с новым узлом
                tail = newNode; // Новый узел становится хвостом
            }
        }

        return head; // Возвращаем голову списка
    }

//    Метод для создания списка с хвоста
    public static Node createTail() {
        Node head = null;
        System.out.println("Введите кол-во элементов списка");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Введите " + (i + 1) + " элемент списка");
            int value = scanner.nextInt();
            head = new Node(value, head);
        }

        // Найдем хвост списка
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Изменяем порядок ссылок
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Возвращаем новую голову (бывший хвост)
        return prev;
    }

    // Метод для добавления нового элемента в начало списка
    public static Node addFirst(Node head) {
        System.out.println("Введите значение нового 1-го элемента");
        int value = scanner.nextInt();
        head = new Node(value, head);
        return head;
    }

    // Метод для добавления нового элемента в конец списка
    public static void addLast(Node head) {
        System.out.println("Введите значение нового хвоста");
        int value = scanner.nextInt();
        Node newTail = new Node(value, null);

        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
    }

    // Метод для вставки элемента с указанным номером
    public static Node insert(Node head) {
        System.out.println("Введите значение элемента");
        int value = scanner.nextInt();
        System.out.println("Введите под каким номеро должен встать новый элемент");
        int number = scanner.nextInt();

        Node newNode = new Node(value, null);
        Node ref = head;
        int k = 1;
        while (ref.next != null && k < number) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
        return head;
    }

    // Метод для удаления элемента с головы списка
    public static Node removeFirst(Node head) {
        Node newHead = head.next;
        head.next = null;
        return newHead;
    }

    // Метод для удаление последнего элемента списка
    public static void removeLast(Node head) {
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    // Метод для удаления элемента с указанным номером
    public static void remove(Node head) {
        Node ref = head;
        System.out.println("Введите номер удаляемого элемента");
        int number = scanner.nextInt();
        int k = 1;
        while (ref.next != null && k < number) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
    }

    // Рекурсивный метод ввод с головы
    public static Node createHeadRec(int count) {
        if (count <= 0)
            return null;
        System.out.println("Введите значение " + i + "-го элемента списка");
        i++;
        int value = scanner.nextInt();
        Node newNode = new Node(value, null);
        newNode.next = createHeadRec(count - 1); // Рекурсивно вызываем метод для создания следующего элемента списка
        return newNode;
    }

    // Рекурсивный метод ввод с хвоста
    public static Node createTailRec(int count, Node head) {
        if (count <= 0)
                return head;

        System.out.println("Введите значение " + count + " элемента списка");
        int value = scanner.nextInt();
        Node newNode = new Node(value, head);
        return createTailRec(count - 1, newNode);
    }

    // Рекурсивный вывод списка
    public static String toStringRec(Node head) {
        if (head == null) {
            return ""; // Базовый случай: если текущая голова списка равна null, возвращаем пустую строку
        }

        StringBuilder strBldr = new StringBuilder(); // Создаем StringBuilder для формирования строки
        strBldr.append(head.value).append(", "); // Добавляем значение текущей головы в строку

        // Рекурсивно вызываем метод для вывода оставшейся части списка
        strBldr.append(toStringRec(head.next));

        return strBldr.toString(); // Возвращаем строковое представление списка
    }

    public static void main(String[] args) {

        Node newNode1 = createHead();
        System.out.println(newNode1);
        Node newNode2 = createTail();
        System.out.println(newNode2.toString());

        newNode1 = addFirst(newNode1);
        System.out.println(newNode1);
        newNode2 = addFirst(newNode2);
        System.out.println(newNode2);

        addLast(newNode1);
        System.out.println(newNode1);
        addLast(newNode2);
        System.out.println(newNode2);

        newNode1 = insert(newNode1);
        System.out.println(newNode1);

        Node newNode3 = removeFirst(newNode1);
        System.out.println(newNode3);

        removeLast(newNode3);
        System.out.println(newNode3);

        remove(newNode3);
        System.out.println(newNode3);
        Node newNode4 = createHeadRec(5);
        System.out.println(newNode4);

        Node newNode5 = createTailRec(5, null);
        System.out.println(toStringRec(newNode5));
        System.out.println(toStringRec(newNode4));

    }

}
