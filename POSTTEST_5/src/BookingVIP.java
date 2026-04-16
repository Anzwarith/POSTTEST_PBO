class BookingVIP extends Booking implements Pembayaran {

    public BookingVIP(String nama, String nomor, int jam, int durasi, int total) {
        super(nama, nomor, jam, durasi, total);
    }

    public int hitungDiskon() {
        return 100000;
    }

    public void prosesPembayaran() {
        System.out.println("Pembayaran VIP diproses");
    }

    public void tampilkanStruk() {
        System.out.println("Struk VIP (Diskon 100rb)");
    }
}