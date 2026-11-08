// Multiple Interface (implements LayananTransaksi, OperasionalSPBU) [Point 10]
// Inheritance (extends Kendaraan) [Point 4]
public class Mobil extends Kendaraan implements LayananTransaksi, OperasionalSPBU {
    // 1. Deklarasi Atribut yang Sebelumnya Hilang/Belum Ada
    private String jenisMobil;
    private double biayaAdmin;
    private double totalLiterPengisian;

    // 2. Overloaded Constructor (Super Chaining)
    public Mobil(String platNomor, String namaPemilik, double kapasitasTangki, String jenisMobil, double biayaAdmin) {
        super(platNomor, namaPemilik, kapasitasTangki);
        this.jenisMobil = jenisMobil;
        this.biayaAdmin = biayaAdmin;
        this.totalLiterPengisian = 0.0;
    }

    public Mobil(String platNomor, String namaPemilik, double kapasitasTangki, double isiTangkiAwal, String jenisMobil, double biayaAdmin) {
        super(platNomor, namaPemilik, kapasitasTangki, isiTangkiAwal);
        this.jenisMobil = jenisMobil;
        this.biayaAdmin = biayaAdmin;
        this.totalLiterPengisian = 0.0;
    }

    // 3. Override Method Abstract dari Kendaraan (Memperbaiki error "does not override abstract method isiBBM")
    @Override
    public void isiBBM(double liter) {
        if (getIsiTangki() + liter > getKapasitasTangki()) {
            System.out.println("[SPBU] Pengisian Mobil " + getPlatNomor() + " (" + getNamaPemilik() + ") gagal! Melebihi kapasitas tangki (Tangki saat ini: " + (int)getIsiTangki() + "/" + (int)getKapasitasTangki() + " L).");
        } else {
            setIsiTangki(getIsiTangki() + liter);
            this.totalLiterPengisian += liter;
            System.out.println("[SPBU] Berhasil isi " + (int)liter + "L Pertalite ke Mobil " + getPlatNomor() + " (" + getNamaPemilik() + "). Sisa tangki: " + (int)getIsiTangki() + " L");
        }
    }

    // 4. Override Method dari Superclass Kendaraan
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println(" | Jenis: " + jenisMobil + " | Biaya Admin: Rp" + (int)biayaAdmin);
    }

    // 5. Override Method dari Interface LayananTransaksi
    @Override
    public double hitungTotalBiaya() {
        return (totalLiterPengisian * HARGA_PERTALITE) + biayaAdmin;
    }

    @Override
    public void cetakStruk() {
        System.out.println("Struk SPBU Mobil " + getPlatNomor() + ": Total Biaya = Rp" + (int)hitungTotalBiaya());
    }

    // 6. Override Method dari Interface OperasionalSPBU
    @Override
    public void tampilkanStatusJalur() {
        System.out.println("Mobil " + getPlatNomor() + " sedang dilayani di Jalur Roda 4 SPBU.");
    }
}