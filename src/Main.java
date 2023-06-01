import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    //Задача 1
    //Найти минимальное чётное число в последовательности положительных чисел или вывести -1,
    // если такого числа не существует.
    //Оценить временную и пространственную сложность алгоритма.
    Scanner scanner = new Scanner(System.in);
    int min = -1;
    System.out.println("Сколько чисел ?");
    int n = scanner.nextInt();
    for (int i = 0; i < n; ++i) {
      int z = scanner.nextInt();
      if (z % 2 == 0) {
        if (min == -1) {
          min = z;
        } else if (z < min) {
          min = z;
        }
      }
    }
    System.out.println("минимальное чётное : " + min);

    //Задача 2* (не обязательно)
    //Дана последовательность слов (количество, а затем и сами слова, каждое слово с новой строки).
    //Вывести все самые короткие слова через пробел.
    //Оценить временную и пространственную сложность алгоритма.
  }
}
