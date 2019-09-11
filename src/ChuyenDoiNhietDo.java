import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {

        String[] chuyenDoi = {"1. Fahrenheit to Celsius", "2. Celsius to Fahrenheit", "0. EXIT"};

        for (String i : chuyenDoi) {
            System.out.println(i);
        }
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Enter Choice number");
        choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    fahrenheitToCelsius();
                    break;
                case 2:
                    celsiusToFahrenheit();
                    break;
                default:
                    System.out.println("lua chon cua ban khong hop le");

        }


    }

    private static void celsiusToFahrenheit() {
        double fahrenheit,celsius;
        System.out.println("Moi Ban Nhap Vao DO C : ");
        celsius = new Scanner(System.in).nextDouble();
        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("nhiet do F : " +fahrenheit);

    }

    private static void fahrenheitToCelsius() {
        double fahrenheit,celsius;
        System.out.println("Moi Ban Nhap Vao Do F : ");
        fahrenheit = new Scanner(System.in).nextDouble();
        celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("nhiet do C : " + celsius);
    }
}
