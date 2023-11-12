import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a number to see if he is odd or even!");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        LocalDate ld = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date that you used this program: " + ld.format(formatter));


        }
    }
