abstract class Booking {

    private String namaPelanggan;
    private String nomorLapangan;
    private int jamMulai;
    private int durasiJam;
    private int totalHarga;

    public Booking(String namaPelanggan, String nomorLapangan, int jamMulai, int durasiJam, int totalHarga) {
        this.namaPelanggan = namaPelanggan;
        this.nomorLapangan = nomorLapangan;
        this.jamMulai = jamMulai;
        this.durasiJam = durasiJam;
        this.totalHarga = totalHarga;
    }

    public String getNamaPelanggan() { return namaPelanggan; }
    public String getNomorLapangan() { return nomorLapangan; }
    public int getJamMulai() { return jamMulai; }
    public int getDurasiJam() { return durasiJam; }
    public int getTotalHarga() { return totalHarga; }

    public void setJamMulai(int jamMulai) { this.jamMulai = jamMulai; }
    public void setTotalHarga(int totalHarga) { this.totalHarga = totalHarga; }

    // 🔥 ABSTRACT METHOD
    public abstract int hitungDiskon();

    public void cetakInfo() {
        System.out.println("Nama: " + namaPelanggan + ", Lapangan: " + nomorLapangan);
    }

    public void cetakInfo(boolean detail) {
        if (detail) {
            System.out.println("Booking: " + namaPelanggan + " | Lap " + nomorLapangan +
                    " | Jam " + jamMulai + " (" + durasiJam + " jam) | Total " + totalHarga);
        } else {
            cetakInfo();
        }
    }
}