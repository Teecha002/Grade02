import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 80) {
            System.out.println("grade A");
            System.out.print("score"+num);
            }
        else if (num >= 70) {
            System.out.println("grade B");
            System.out.print("score"+num);
        }
        else if (num >= 60) {
            System.out.println("grade C");
            System.out.print("score"+num);
        }
        else if (num >= 50) {
            System.out.println("grade D");
            System.out.print("score"+num);
        }
        else  if (num <= 49) {
            System.out.println("grade F");
            System.out.print("score"+num);
        }

    }
    }
