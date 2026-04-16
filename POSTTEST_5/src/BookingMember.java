class BookingMember extends Booking implements Pembayaran {

    public BookingMember(String nama, String nomor, int jam, int durasi, int total) {
        super(nama, nomor, jam, durasi, total);
    }

    public int hitungDiskon() {
        return 50000;
    }

    public void prosesPembayaran() {
        System.out.println("Pembayaran Member diproses");
    }

    public void tampilkanStruk() {
        System.out.println("Struk Member (Diskon 50rb)");
    }
}