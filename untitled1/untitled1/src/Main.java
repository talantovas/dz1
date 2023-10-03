
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String myFavoriteSinger;
        final int NUM = -2;
        String word = "  cat";
        myFavoriteSinger = NUM + " The Weekend " + word;
        System.out.println(" " + myFavoriteSinger + " " + NUM + " " + word);
        if( NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("Введите ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Привет " + name + "!");


    }
}