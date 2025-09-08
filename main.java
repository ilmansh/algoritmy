import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Стек
    Stack<String> stack = new Stack <>();
    stack.push("А")
    stack.push("Б")
    System.out.println("Верхний элемент: " + stack.peek()); // вершина
    System.out.println("Убрали " + stack.pop());
    System.out.println("Верхний элемент: " + stack.peek()); // вершина

    // Массив
    ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5, 3, 6, 1));
    System.out.println("2: " + array.get(2)); // второй элемент
    array.add(105); // добавляем
    array.remove(Integer.valueOf(6)); // удаляем по знач
    System.out.println(array);
  }
}
