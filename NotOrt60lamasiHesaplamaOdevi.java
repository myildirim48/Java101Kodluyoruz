import java.util.Scanner;
public class NotOrt60lamasiHesaplamaOdevi {

        public static void main(String[] args) {
            //Scanner'in tanımlanması
            Scanner inp = new Scanner(System.in);

            //Değişkenlerin oluşturulması
            int fizik, kimya, mat, turkce, muzik, tarih;

            //Verilerin Kullanıcıdan Alınması
            System.out.println("Fizik Notunuz : ");
            fizik = inp.nextInt();

            System.out.println("Kimya Notunuz : ");
            kimya = inp.nextInt();

            System.out.println("Matematik Notunuz : ");
            mat = inp.nextInt();

            System.out.println("Türkçe Notunuz : ");
            turkce = inp.nextInt();

            System.out.println("Müzik Notunuz : ");
            muzik = inp.nextInt();

            System.out.println("Tarih Notunuz : ");
            tarih = inp.nextInt();


            //Verilerin Hesaplanması
            int toplam = (fizik + mat + kimya + turkce + muzik + tarih);
            double ortalama = toplam / 6.0;

            //Ortalamaya göre geçti kaldı
            String sonuc = ortalama >= 60 ? "Sınıfı Geçtiniz... Tebrikler..." : "Sınıfta Kaldınız...";

            //Sonucu Ekrana Yazdırma
            System.out.print("Not Ortalamanız : " + ortalama + " " + sonuc);

        }
    }
