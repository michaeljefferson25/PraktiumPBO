public class Main {
    public static void main(String[] args) {
        // === 1. State & Behavior ===
        System.out.println("=== 1. State & Behavior ===");
        Mobil mobil1 = new Mobil("R-1234-AB", "Andi", 60.0, "SUV", 5000);
        mobil1.setIsiTangki(50);
        mobil1.tampilkanInfo();
        System.out.println();
        mobil1.kurangiBBM(5);
        System.out.println("Setelah kurangiBBM(5): tangki = " + (int)mobil1.getIsiTangki());
        System.out.println();

        // === 2. Immutability ===
        System.out.println("=== 2. Immutability ===");
        System.out.println("Konstanta global HARGA_PERTALITE       = " + (int)Kendaraan.HARGA_PERTALITE);
        System.out.println("Plat nomor (private final, tanpa setter) = " + mobil1.getPlatNomor());
        System.out.println();

        // === 3. Enkapsulasi & Overloading Constructor ===
        System.out.println("=== 3. Enkapsulasi & Overloading Constructor ===");
        mobil1.setNamaPemilik("Andi Pratama");
        System.out.println("Nama lewat getter/setter: " + mobil1.getNamaPemilik());
        Motor motor1 = new Motor("R-5678-CD", "Sari", 15.0, "Pagi");
        motor1.setIsiTangki(10);
        Motor motor2 = new Motor("R-9999-EF", "Budi", 15.0, "Malam");
        motor2.setIsiTangki(12);

        motor1.tampilkanInfo(); System.out.println();
        motor2.tampilkanInfo(); System.out.println();
        System.out.println();

        // === 4. Inheritance ===
        System.out.println("=== 4. Inheritance (Kendaraan -> Mobil & Motor) ===");
        System.out.println(mobil1.getNamaPemilik() + " membawa Kendaraan -> Mobil");
        System.out.println(motor1.getNamaPemilik() + " membawa Kendaraan -> Motor");
        System.out.println(motor2.getNamaPemilik() + " membawa Kendaraan -> Motor");
        System.out.println();

        // === 5. Super Chaining ===
        System.out.println("=== 5. Super Chaining (super(...) dan super.tampilkanInfo()) ===");
        System.out.println("Mobil.tampilkanInfo() memanggil super.tampilkanInfo():");
        mobil1.setIsiTangki(45);
        mobil1.tampilkanInfo();
        System.out.println("\n");

        // === 6. Method Overriding ===
        System.out.println("=== 6. Method Overriding (@Override) ===");
        System.out.println("isiBBM() & tampilkanInfo() ditimpa di Mobil & Motor:");
        mobil1.tampilkanInfo(); System.out.println();
        motor1.tampilkanInfo(); System.out.println();
        motor2.tampilkanInfo(); System.out.println();
        System.out.println();

        // === 7 & 8. Abstract Method + Logika if/else State ===
        System.out.println("=== 7 & 8. Abstract Method + Logika if/else State ===");
        Mobil mobilRina = new Mobil("R-3333-GH", "Rina", 60.0, "Sedan", 2000);
        mobilRina.isiBBM(10); // Tangki: 10/60 L
        mobilRina.isiBBM(10); // Tangki: 20/60 L
        mobilRina.isiBBM(10); // Tangki: 30/60 L
        mobilRina.isiBBM(10); // Tangki: 40/60 L
        mobilRina.isiBBM(10); // Tangki: 50/60 L
        mobilRina.isiBBM(20); // Pengisian gagal karena (50+20 = 70 > 60 L)!

        mobilRina.kurangiBBM(40); // Mobil Rina dipakai jalan-jalan (Tangki sisa 10 L)
        System.out.println("[SPBU] Mobil Rina digunakan berkendara. Tangki sisa " + (int)mobilRina.getIsiTangki() + " L");
        mobilRina.isiBBM(15); // Tangki: 25/60 L

        motor2.setIsiTangki(5);
        motor2.isiBBM(5); // Tangki: 10/15 L
        System.out.println();

        // === 9. Polimorfisme Interface ===
        System.out.println("=== 9. Polimorfisme Interface ===");
        LayananTransaksi mobilCitra = new Mobil("R-7777-IJ", "Citra", 60.0, "MPV", 5000);
        Mobil citra = (Mobil) mobilCitra;
        citra.isiBBM(20);
        citra.isiBBM(20);

        System.out.println("Tagihan Mobil Citra: 40 Liter x Rp10000 + Rp5000 = Rp" + (int)mobilCitra.hitungTotalBiaya());
        System.out.println("Total tarif: Rp" + (int)mobilCitra.hitungTotalBiaya());

        Motor motorDewi = new Motor("R-8888-KL", "Dewi", 15.0, "Siang");
        System.out.println("Motor Dewi mengisi pada shift " + motorDewi.getShiftPengisian());
        motorDewi.setIsiTangki(10);
        System.out.println("[Motor] Tangki Motor Dewi kini " + (int)motorDewi.getIsiTangki() + " L");
        System.out.println();

        // === 10. Multiple Interface ===
        System.out.println("=== 10. Multiple Interface (Mobil implements LayananTransaksi, OperasionalSPBU) ===");
        Mobil mobilTest = new Mobil("R-3333-GH", "Rina", 60.0, "Sedan", 2000);
        System.out.println("mobilTest instanceof LayananTransaksi : " + (mobilTest instanceof LayananTransaksi));
        System.out.println("mobilTest instanceof OperasionalSPBU   : " + (mobilTest instanceof OperasionalSPBU));
        System.out.println("Tagihan Mobil Rina: Total Pengisian = Rp" + (int)(30 * 10000));
        mobilTest.tampilkanStatusJalur();
    }
}