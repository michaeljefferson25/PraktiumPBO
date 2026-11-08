// 4. Inheritance[cite: 2]
public class Motor extends Kendaraan implements LayananTransaksi {
    private String shiftPengisian;
    private int jumlahPengisian;

    public Motor(String platNomor, String namaPemilik, double kapasitasTangki, String shiftPengisian) {
        super(platNomor, namaPemilik, kapasitasTangki);
        this.shiftPengisian = shiftPengisian;
        this.jumlahPengisian = 0;
    }

    public String getShiftPengisian() {
        return shiftPengisian;
    }

    @Override
    public void tampilkanInfo() {
        System.out.print("MOTOR     -> [" + getPlatNomor() + "] " + getNamaPemilik() + " | Tangki: " + (int)getIsiTangki() + "/" + (int)getKapasitasTangki() + " L | Shift: " + shiftPengisian + " | Pengisian: " + jumlahPengisian);
    }

    @Override
    public void isiBBM(double liter) {
        if (getIsiTangki() + liter <= getKapasitasTangki()) {
            setIsiTangki(getIsiTangki() + liter);
            this.jumlahPengisian++;
            System.out.println("[SPBU] Berhasil isi " + (int)liter + "L Pertalite ke Motor " + getPlatNomor() + " (" + getNamaPemilik() + "). Tangki kini: " + (int)getIsiTangki() + " L");
        }
    }

    @Override
    public double hitungTotalBiaya() {
        return getIsiTangki() * HARGA_PERTALITE;
    }

    @Override
    public void cetakStruk() {
        System.out.println("Struk SPBU Motor " + getPlatNomor() + " selesai.");
    }
}