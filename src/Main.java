import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ban muon kiem tra: ");
        int number = sc.nextInt();

        if (number < 2){
            System.out.println(number + " khong la SNT");
        } else {
            int i = 2;
            boolean checker = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    checker = false;
                    break;
                }
                i++;
            }
            if (checker) {
                System.out.println(number + " la SNT");
            } else {
                System.out.println(number + " khong la SNT");
            }
        }
    }
}