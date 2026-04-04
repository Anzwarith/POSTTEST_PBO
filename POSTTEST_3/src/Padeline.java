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
            System.out.println("2. Lihat Lapangan");
            System.out.println("3. Lihat Booking");
            System.out.println("4. Ganti Jam Booking");
            System.out.println("5. Batalkan Booking");
            System.out.println("6. Bayar Booking");
            System.out.println("0. Exit");
            System.out.print("Pilih Menu: ");
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
        } while(menu != 0);
    }

    static void regis(){
        System.out.print("Masukkan Nama Anda: ");
        namaUser = input.nextLine();
    }

    static void lihatLapangan(){
        for(Lapangan l : listLapangan){
            String status = l.getTersedia() ? "Tersedia" : "Penuh";
            System.out.println("Nomor Lapangan: " + l.getNomorLapangan() + " | Status: " + status);
        }
    }

    static void bookingLapangan(){
        lihatLapangan();
        System.out.print("Pilih Nomor Lapangan: ");
        String nomor = input.nextLine();
        Lapangan terpilih = null;
        for(Lapangan l : listLapangan){
            if(l.getNomorLapangan().equals(nomor) && l.getTersedia()){
                terpilih = l;
                break;
            }
        }

        if(terpilih != null){
            System.out.print("Durasi (Jam): ");
            int durasi = input.nextInt();
            System.out.print("Jam Mulai: ");
            int jam = input.nextInt();
            input.nextLine();
            System.out.println("Jenis Member:");
            System.out.println("1. Reguler");
            System.out.println("2. Member (Diskon 50rb)");
            System.out.println("3. VIP (Diskon 100rb)");
            System.out.print("Pilih: ");
            int jenis = input.nextInt();
            input.nextLine();
            int total = hargaPerJam * durasi;
            Booking b;

            if(jenis == 2){
                total -= 50000;
                b = new BookingMember(namaUser, nomor, jam, durasi, total);
            } else if(jenis == 3){
                total -= 100000;
                b = new BookingVIP(namaUser, nomor, jam, durasi, total);
            } else {
                b = new BookingReguler(namaUser, nomor, jam, durasi, total);
            }
            listBooking.add(b);
            terpilih.setTersedia(false);
            System.out.println("Booking Berhasil!");
        } else {
            System.out.println("Lapangan tidak tersedia.");
        }
    }

    static void lihatBooking(){
        for(Booking b : listBooking){
            System.out.println("Nama: " + b.getNamaPelanggan() +
                    " | Lapangan: " + b.getNomorLapangan() +
                    " | Jam: " + b.getJamMulai() +
                    " | Total: " + b.getTotalHarga());
        }
    }

    static void gantiJam(){
        System.out.print("Nomor Lapangan: ");
        String nomor = input.nextLine();
        for(Booking b : listBooking){
            if(b.getNomorLapangan().equals(nomor)){
                System.out.print("Jam Baru: ");
                int jamBaru = input.nextInt();
                input.nextLine();
                b.setJamMulai(jamBaru);
                System.out.println("Berhasil diubah");
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }

    static void batalBooking(){
        System.out.print("Nomor Lapangan: ");
        String nomor = input.nextLine();
        for(int i = 0; i < listBooking.size(); i++){
            if(listBooking.get(i).getNomorLapangan().equals(nomor)){
                for(Lapangan l : listLapangan){
                    if(l.getNomorLapangan().equals(nomor)){
                        l.setTersedia(true);
                        break;
                    }
                }
                listBooking.remove(i);
                System.out.println("Booking dibatalkan");
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }

    static void bayarBooking(){
        System.out.print("Nomor Lapangan: ");
        String nomor = input.nextLine();
        for(Booking b : listBooking){
            if(b.getNomorLapangan().equals(nomor)){
                System.out.println("Total Bayar: " + b.getTotalHarga());
                System.out.println("Pembayaran Berhasil");
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }
}