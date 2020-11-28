import java.util.Scanner;

public class tentukanOlahraga {
    public static void main(String[] args) {
      Scanner kaloriO = new Scanner(System.in);
      
      String nama;
      String namaMakanan;
      float kaloriMakanan;

      System.out.println("Masukkan nama kamu?");
      nama = kaloriO.nextLine();

      System.out.println("Makanan yang kamu makan hari ini?");
      namaMakanan = kaloriO.nextLine();

      System.out.println("Jumlah kalori dari makanan kamu?");
      kaloriMakanan = kaloriO.nextFloat();

      System.out.println();
      
      if(kaloriMakanan >= 750){
        System.out.println("Dari data makanan dan jumlah kalori makanan yang kamu masukkan." +
        "\nNama makanan: " + namaMakanan +
        "\nJumlah kalori: " + kaloriMakanan + " Kalori");
        System.out.println("");
        System.out.println(nama + ", Olahraga yang cocok untukmu adalah Lari.");
        System.out.println("Dengan waktu olahraga +- " + kaloriMakanan / 10 + " menit.");
      }else if(kaloriMakanan >= 500){
        System.out.println("Dari data makanan dan jumlah kalori makanan yang kamu masukkan." +
        "\nNama makanan: " + namaMakanan +
        "\nJumlah kalori: " + kaloriMakanan + " Kalori");
        System.out.println("");
        System.out.println(nama + ", Olahraga yang cocok untukmu adalah Badminton.");
        System.out.println("Dengan waktu olahraga +- " + kaloriMakanan / 10 + " menit.");
      }else{
        System.out.println("Dari data makanan dan jumlah kalori makanan yang kamu masukkan." +
        "\nNama makanan: " + namaMakanan +
        "\nJumlah kalori: " + kaloriMakanan + " Kalori");
        System.out.println("");
        System.out.println(nama + ", Olahraga yang cocok untukmu adalah Renang.");
        System.out.println("Dengan waktu olahraga +- " + kaloriMakanan / 10 + " menit.");
      }
    }
  }