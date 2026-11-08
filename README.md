# Responsi Akhir Praktikum PBO - Sistem SPBU

Project ini dibuat untuk memenuhi Tugas Responsi Akhir Praktikum Pemrograman Berorientasi Objek (PBO) Jurusan Informatika, Universitas Jenderal Soedirman.

## Identitas Mahasiswa
- **Nama**: [Michael Jefferson]
- **NIM**: [H1D025132]
- **Digit Terakhir NIM**: 2
- **Tema Sistem**: SPBU

---

## Deskripsi Singkat Sistem
Sistem Operasional SPBU ini dirancang untuk mengelola transaksi pengisian BBM pada berbagai jenis kendaraan (Mobil dan Motor). Sistem ini mengimplementasikan 10 konsep utama Pemrograman Berorientasi Objek Java seperti Enkapsulasi, Inheritance, Polymorphism Interface, Multiple Interface, Abstract Class, dan State Control.

---

## Pemenuhan 10 Persyaratan Teknis PBO

1. **State dan Behavior**: Atribut `isiTangki`, method prosedur (`void isiBBM`), dan method fungsi (`double getIsiTangki()`).
2. **Immutability**: Konstanta global `public static final double HARGA_PERTALITE` dan atribut instans kekal `private final String platNomor`.
3. **Enkapsulasi dan Overloading**: Seluruh atribut berstatus `private` dengan getter & setter, kata kunci `this`, dan memiliki 2 variasi konstruktor (*overloaded constructor*).
4. **Inheritance**: Class `Mobil` dan `Motor` meng-extends class `Kendaraan`. Class `Main` dipisahkan.
5. **Super Chaining**: Pemanggilan `super(...)` pada konstruktor subclass dan `super.tampilkanInfo()`.
6. **Method Overriding**: Penggunaan anotasi `@Override` pada method `isiBBM()` dan `tampilkanInfo()`.
7. **Abstract Class**: Class `Kendaraan` berstatus `abstract` dan memiliki abstract method `public abstract void isiBBM(double liter)`.
8. **Logika State Percabangan**: Method `isiBBM()` memuat logika `if/else` untuk membaca dan mengubah state internal `isiTangki` serta `kapasitasTangki`.
9. **Polimorfisme Interface**: Pemanggilan method objek melalui variabel referensi interface `LayananTransaksi mobilCitra = new Mobil(...);`.
10. **Multiple Interface**: Class `Mobil` mengimplementasikan dua interface sekaligus (`implements LayananTransaksi, OperasionalSPBU`).

---

## Petunjuk Compile dan Run (Terminal)

Prasyarat: JDK 11 atau yang lebih baru.

```bash
# 1. Clone repositori dari GitHub
git clone <URL-REPOSITORI-ANDA>
cd SPBUPBO

# 2. Compile seluruh source code Java (Hasil kompilasi disimpan ke folder out)
javac -d out src/*.java

# 3. Jalankan program Main
java -cp out Main
```
## Screenshot Luaran Program

> Jalankan program, ambil screenshot terminal, simpan di folder `screenshots/`, lalu ganti baris di bawah.

Persyaratan 1-6:

![Luaran 1-6](1-6.png)

Persyaratan 7-10:

![Luaran 7-10](7-10.png)

