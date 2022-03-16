import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        
        System.out.println("Nama \t: Arieska Kharzani");
        System.out.println("NIM \t: 2111521025");
        System.out.println("Queue Project");
        System.out.println("===========================");
        System.out.println("");
        
        String pelanggan;
        int i=0;
        boolean bool = true;

        Queue <String> antrian = new LinkedList<>();
        
        Scanner pilih = new Scanner(System.in);

        System.out.println("ANTRIAN TOKO ROTI");
        System.out.println("----------------------");

        
            System.out.println("1. Antrian Masuk");
            System.out.println("2. Antrian Keluar");
            System.out.println("3. Pelanggan Awal");
            System.out.println("4. Bersihkan Antrian");
            System.out.println("5. Apakah Antrian kosong? ");
            System.out.println("6. Tampilkan Antrian");
            System.out.println("7. Banyaknya Antrian ");
            System.out.println("8. Selesai");
            System.out.print("MASUKAN PILIHAN [1-8]: ");
        do {
            int input=pilih.nextInt();
            switch(input){
                case 1: //Enqueque untuk menambah data/pelanggan yang baru datang
                    System.out.print("Banyak Data Yang Akan Ditambah: ");
                    i=0;
                    int h=pilih.nextInt();
                    do{
                        System.out.print("Masukan Nama Pelanggan: ");
                        pelanggan=pilih.next();
                        antrian.add(pelanggan);
                        i++;
                    }
                    while(i<h);
                    System.out.println("Antrian: "+antrian);
                    System.out.println("");
                    break;
                
                case 2: //Dequeque untuk memanggil nama pelanggan ketika pesanan sudah siap/ selesai
                    System.out.println("Memanggil Nama: "+antrian.poll()); 
                    System.out.println("");
                    break;

                case 3: //untuk menunjukkan nama atau elemen paling awal
                    System.out.println("Nama Pelanggan Awal: "+antrian.peek()); 
                    System.out.println("");
                    break;
                
                case 4: //untuk membersihkan data/antrian
                    antrian.clear();
                    System.out.println("Antrian Telah Dibersihkan");
                    System.out.println("");
                    break;
                    
                case 5: //memeriksa apakah antrian kosong
                    System.out.println("Apakah Antrian Kosong? "+antrian.isEmpty());
                    System.out.println("");
                    break;

                case 6: //Menampilkan antrian yang tersisa
                    System.out.println("Antrian: "+antrian);
                    System.out.println("");
                    break;

                case 7: //menampilkan jumlah antrian
                    System.out.println("Banyak Antrian " +antrian.size());
                    System.out.println("");
                    break;
                
                case 8:
                    System.exit(0);
                    break;
                
                default:
                System.err.println("Pilihan Anda Salah");
                System.out.println("");
            }
        }
        while(bool);

    }
}