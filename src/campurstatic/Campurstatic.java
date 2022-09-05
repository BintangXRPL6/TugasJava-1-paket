package campurstatic;
/*
Percabangan, Operator, Scanner
Bintang Aji Wibowo 
X-RPL-6
Absen 10
*/
import java.util.Scanner;
public class Campurstatic
{
    public static Campurstatic shap = new Campurstatic();
    public static int hasil;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int pilihans;
        String pilihans0;
        
        
        System.out.println("Operasi luas dan Bangun 2d");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjan");
        System.out.println("4. Lingkaran");
        System.out.println("5. Exit");
        System.out.println("Pilih operasi di atas: ");
        pilihans = input.nextInt();
        
        switch (pilihans)
                {
                    case 1 : shap.Segitiga();break;
                    case 2 : shap.Persegi();break;
                    case 3 : shap.Persegipnjg();break;
                    case 4 : shap.Lingkaran();break;
                    case 5 : System.exit(0);
                    default : System.out.println("Operasi tidak ada");
                }
        System.out.println("Ingin melakukannya lagi? ya / tidak");
        pilihans0 = input.next();
        
        if (pilihans0.equalsIgnoreCase("ya"))
        {
            System.out.println("Ok");main(null);
        }else if (pilihans0.equalsIgnoreCase("tidak"))
        {
            System.out.println("Terima kasih!");System.exit(0);
        }else System.out.println("End");
        
    }/*-------------------------Akhir dari Main-------------------------*/
    private void Segitiga()
    {
        int alas, tinggi;
        System.out.println("Operasi luas segitiga");
        System.out.print("Masukan alas: ");
        alas = input.nextInt();
        System.out.print("Masukan tinggi: ");
        tinggi = input.nextInt();
        hasil = alas*tinggi/2;
        System.out.println("Hasil luas segitga: "+hasil);
    }
    private void Persegi()
    {
        int sisi;
        System.out.println("Operasi luas persegi");
        System.out.print("Masukan sisi: ");
        sisi = input.nextInt();
        hasil = sisi*sisi;
        System.out.println("Hasil luas persegi: "+hasil);
    }
    private void Persegipnjg()
    {
        System.out.println("Operasi luas persegi panjang");
        System.out.print("Masukan panjang: ");
        int panjang = input.nextInt();
        System.out.print("Masukan lebar: ");
        int lebar = input.nextInt();
        hasil = lebar * panjang;
        System.out.println("Hasil luas persegi panajng: "+hasil);
    }
    private void Lingkaran()
    {
        double hasil1;
        System.out.println("Operasi luas lingkaran");
        System.out.print("Masukan jari - jari<r>: ");
        int r = input.nextInt();
        hasil1 = r*r*3.14;
        System.out.println("Hasil luas lingkaran: "+hasil1);
    }
}//Akhir dari class
