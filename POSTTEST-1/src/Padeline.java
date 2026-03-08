import java.util.ArrayList;
import java.util.Scanner;

class Padeline {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Lapangan> listLapangan = new ArrayList<>();
    static ArrayList<Booking> listBooking = new ArrayList<>();
    static String namaUser;
    static int hargaPerJam = 350000;

    public static void main(String[] args) {
        listLapangan.add(new Lapangan("1"));
        listLapangan.add(new Lapangan("2"));
        listLapangan.add(new Lapangan("3"));
        regis();
        int menu;

        do{
            System.out.println("\n=== PADELINE BOOKING SYSTEM ===");
            System.out.println("1. Booking Lapangan");
            System.out.println("2. Lihat Lapangan Tersedia");
            System.out.println("3. Lihat Detail Booking");
            System.out.println("4. Ganti Jam Booking");
            System.out.println("5. Batalkan Booking");
            System.out.println("6. Bayar Booking");
            System.out.println("0. Exit");
            System.out.print("Pilih Menu : ");
            menu = input.nextInt();
            input.nextLine();

            switch(menu){
                case 1:
                    bookingLapangan();
                    break;
                case 2:
                    lihatLapangan();
                    break;
                case 3:
                    lihatBooking();
                    break;
                case 4:
                    gantiJam();
                    break;
                case 5:
                    batalBooking();
                    break;
                case 6:
                    bayarBooking();
                    break;
            }
        }while(menu != 0);
    }

    static void regis(){
        System.out.println("=== REGISTRASI ===");
        System.out.print("Masukkan Nama Anda : ");
        namaUser = input.nextLine();
        System.out.println("Selamat datang "+namaUser);
    }

    static void lihatLapangan(){
        System.out.println("\nJam Operasional : 10 - 20");
        for(Lapangan l : listLapangan){
            if(l.tersedia){
                System.out.println("Lapangan "+l.nomorLapangan+" : Tersedia");
            }else{
                System.out.println("Lapangan "+l.nomorLapangan+" : Tidak tersedia");
            }
        }
    }

    static void bookingLapangan(){
        lihatLapangan();
        System.out.print("Pilih Nomor Lapangan : ");
        String nomor = input.nextLine();
        System.out.print("Jam Mulai (10-20) : ");
        int jam = input.nextInt();
        System.out.print("Berapa Jam Main : ");
        int durasi = input.nextInt();
        input.nextLine();
        int total = durasi * hargaPerJam;
        System.out.println("Total Harga : "+total);
        Booking b = new Booking(namaUser,nomor,jam,durasi,total);
        listBooking.add(b);
        System.out.println("Booking berhasil");
    }

    static void lihatBooking(){
        if(listBooking.isEmpty()){
            System.out.println("Anda belum melakukan booking");
            return;
        }
        for(Booking b : listBooking){
            System.out.println(
                    "Lapangan : "+b.nomorLapangan+
                            " | Jam Mulai : "+b.jamMulai+
                            " | Durasi : "+b.durasiJam+
                            " | Total : "+b.totalHarga);
        }
    }

    static void gantiJam(){
        if(listBooking.isEmpty()){
            System.out.println("Tidak ada booking");
            return;
        }

        System.out.print("Masukkan nomor lapangan yang ingin diubah : ");
        String nomor = input.nextLine();
        for(Booking b : listBooking){
            if(b.nomorLapangan.equals(nomor)){
                System.out.print("Jam Baru : ");
                b.jamMulai = input.nextInt();
                input.nextLine();
                System.out.println("Jam booking berhasil diganti");
            }
        }
    }

    static void batalBooking(){
        System.out.print("Masukkan nomor lapangan yang ingin dibatalkan : ");
        String nomor = input.nextLine();
        for(int i=0;i<listBooking.size();i++){
            if(listBooking.get(i).nomorLapangan.equals(nomor)){
                listBooking.remove(i);
                System.out.println("Booking berhasil dibatalkan");
            }
        }
    }

    static void bayarBooking(){
        if(listBooking.isEmpty()){
            System.out.println("Belum ada booking untuk dibayar");
            return;
        }

        System.out.print("Masukkan nomor lapangan yang ingin dibayar : ");
        String nomor = input.nextLine();
        for(Booking b : listBooking){
            if(b.nomorLapangan.equals(nomor)){
                System.out.println("Total yang harus dibayar : "+b.totalHarga);
                System.out.println("Pembayaran berhasil");
            }
        }
    }
}