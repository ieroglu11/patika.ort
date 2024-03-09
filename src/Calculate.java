import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = scanner.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = scanner.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = scanner.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = scanner.nextInt();


        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6 ;

        System.out.println("Ortalamanız: " + sonuc);

        String not = (sonuc >60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(not);

    }
}
