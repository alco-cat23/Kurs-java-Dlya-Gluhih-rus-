//#1 java для глухих
// всем привет и сегодня я вам покажу простой способ высчитать квадратный корень
// для начала портируем класс Scanner
import java.util.Scanner;
// создаем функцию main
public class main {
    public static void main(String[] args){
        //теперь создаем переменную класса Scanner
        Scanner scanner = new Scanner(System.in); // создал переменную scanner
        int num = scanner.nextInt();// теперь создал переменную которая принимает ввод пользователя от переменной scanner
        System.out.println(num*num);// а теперь он выведет корень числа
        // тестируем
        //программа работает коректно
        // а на этом всё
        //этот код я выложу на свой github ссылка будет в описании
        //всем спасибо и всем пока!!!
    }
}
