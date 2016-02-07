import java.util.Scanner;

/**
 * Created by Анна on 04.02.2016.
 */
public class Main {

    public static void main(String[] args) {
    //конкотенация - склейка строк

        Scanner sc = new Scanner(System.in);//принимает еще один єкземпляр класса сканнер, у которого в констр. есть класс system
        System.out.println("Input a: ");
        int a = sc.nextInt();//
        System.out.println("Input b: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("a + b = " + c);

        System.out.println();
    }
}
