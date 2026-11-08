public abstract class Kendaraan {
    // 2. Immutability: Konstanta global (public static final)[cite: 2]
    public static final double HARGA_PERTALITE = 10000.0;

    // 2. Immutability: Atribut instans kekal (private final)[cite: 2]
    private final String platNomor;

    // 1 & 3. Enkapsulasi: Atribut private[cite: 2]
    private String namaPemilik;
    private double kapasitasTangki;
    private double isiTangki;

    // 3. Overloaded Constructor 1[cite: 2]
    public Kendaraan(String platNomor, String namaPemilik, double kapasitasTangki) {
        this.platNomor = platNomor;
        this.namaPemilik = namaPemilik;
        this.kapasitasTangki = kapasitasTangki;
        this.isiTangki = 0.0;
    }

    // 3. Overloaded Constructor 2[cite: 2]
    public Kendaraan(String platNomor, String namaPemilik, double kapasitasTangki, double isiTangkiAwal) {
        this.platNomor = platNomor;
        this.namaPemilik = namaPemilik;
        this.kapasitasTangki = kapasitasTangki;
        this.isiTangki = isiTangkiAwal;
    }

    // Getter dan Setter[cite: 2]
    public String getPlatNomor() {
        return platNomor;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public double getKapasitasTangki() {
        return kapasitasTangki;
    }

    public void setKapasitasTangki(double kapasitasTangki) {
        this.kapasitasTangki = kapasitasTangki;
    }

    public double getIsiTangki() {
        return isiTangki;
    }

    public void setIsiTangki(double isiTangki) {
        this.isiTangki = isiTangki;
    }

    // 1. Behavior Method Prosedur (void)[cite: 2]
    public void kurangiBBM(double liter) {
        if (this.isiTangki >= liter) {
            this.isiTangki -= liter;
        } else {
            this.isiTangki = 0.0;
        }
    }

    public void tampilkanInfo() {
        System.out.print("KENDARAAN -> [" + platNomor + "] " + namaPemilik + " | Tangki: " + (int)isiTangki + "/" + (int)kapasitasTangki + " L");
    }

    // 7. Abstract Method[cite: 2]
    public abstract void isiBBM(double liter);
}