class Lapangan {
    private String nomorLapangan;
    private boolean tersedia;

    public Lapangan(String nomorLapangan){
        this.nomorLapangan = nomorLapangan;
        this.tersedia = true;
    }
    public String getNomorLapangan(){
        return nomorLapangan;
    }
    public void setNomorLapangan(String nomorLapangan){
        this.nomorLapangan = nomorLapangan;
    }
    public boolean getTersedia(){
        return tersedia;
    }
    public void setTersedia(boolean tersedia){
        this.tersedia = tersedia;
    }
}