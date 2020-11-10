/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan43.gajipegawai;

/**
 *
 * @author Fiona Avila
 */


public class OOGajiPegawai {
    
    private String nama = "Fiona Avila";
    private String alamat = "Jalan Pasar Malintang Dalam No.3";
    private int uangTransport = 250000;
    private int uangTunjangan = 300000;
    private int gajiPokok = 4500000;
    private int totalGaji;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public int getUangTransport(){
        return uangTransport;
    }
    
    public void setUangTrasport(int uangTransport){
        this.uangTransport = uangTransport;
    }
    
    public int getUangTunjangan(){
        return uangTunjangan;
    }
    
    public void setUangTunjangan(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }
    
    public int getGajiPokok(){
        return gajiPokok;
    }
    
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public int getTotalGaji(){
        return totalGaji;
    }
    
    public void setTotalGaji(int totalGaji){
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
        System.out.println("Nama karyawan\t: " + nama);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Uang transport\t: Rp " + uangTransport);
        System.out.println("Uang tunjangan\t: Rp " + uangTunjangan);
        System.out.println("Gaji pokok\t: Rp " + gajiPokok);
        System.out.println("Total gaji\t: Rp " + totalGaji);
    }
    
    public static void main(String[] args) {
        
        OOGajiPegawai oo = new OOGajiPegawai();
        String nama = oo.nama;
        String alamat = oo.alamat;
        int uangTunjangan = oo.uangTunjangan;
        int uangTransport = oo.uangTransport;
        int gajiPokok = oo.gajiPokok;
        int totalGaji = oo.totalGaji(uangTunjangan,uangTransport,gajiPokok);
        System.out.println("### DATA GAJI KARYAWAN UD. SINAR JAYA PADANG ###");
        System.out.println("------------------------------------------------");
        oo.tampilData(nama,alamat,uangTunjangan,uangTransport,gajiPokok,totalGaji);
        
    }
    
}
