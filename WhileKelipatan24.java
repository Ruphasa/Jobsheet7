import java.util.Scanner;

public class WhileKelipatan24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1, kelipatan, jumlah=0, counter=0;
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();
        while (i <= 50) {
            i++;
            if (i%kelipatan==0) {
                jumlah += i;
                counter++;
            }
        }
        double rata =(double) jumlah / counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 ada %d\n", kelipatan, jumlah);
        System.out.printf("Rata - rata dari seluruh bilangan kelipatan %d adalah %.2f\n", kelipatan, rata);
    }
}
