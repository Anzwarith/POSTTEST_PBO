class Booking {
    private String namaPelanggan;
    private String nomorLapangan;
    private int jamMulai;
    private int durasiJam;
    private int totalHarga;

    public Booking(String namaPelanggan, String nomorLapangan, int jamMulai, int durasiJam, int totalHarga){
        this.namaPelanggan = namaPelanggan;
        this.nomorLapangan = nomorLapangan;
        this.jamMulai = jamMulai;
        this.durasiJam = durasiJam;
        this.totalHarga = totalHarga;
    }
    public String getNamaPelanggan(){
        return namaPelanggan;
    }
    public void setNamaPelanggan(String namaPelanggan){
        this.namaPelanggan = namaPelanggan;
    }
    public String getNomorLapangan(){
        return nomorLapangan;
    }
    public void setNomorLapangan(String nomorLapangan){
        this.nomorLapangan = nomorLapangan;
    }
    public int getJamMulai(){
        return jamMulai;
    }
    public void setJamMulai(int jamMulai){
        this.jamMulai = jamMulai;
    }
    public int getDurasiJam(){
        return durasiJam;
    }
    public void setDurasiJam(int durasiJam){
        this.durasiJam = durasiJam;
    }
    public int getTotalHarga(){
        return totalHarga;
    }
    public void setTotalHarga(int totalHarga){
        this.totalHarga = totalHarga;
    }
}