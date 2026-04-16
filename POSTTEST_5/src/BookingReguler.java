class BookingReguler extends Booking implements Pembayaran {

    public BookingReguler(String nama, String nomor, int jam, int durasi, int total) {
        super(nama, nomor, jam, durasi, total);
    }

    public int hitungDiskon() {
        return 0;
    }

    public void prosesPembayaran() {
        System.out.println("Pembayaran Reguler diproses");
    }

    public void tampilkanStruk() {
        System.out.println("Struk Reguler");
    }
}