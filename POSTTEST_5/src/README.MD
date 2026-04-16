# Padeline Booking System – Posttest 4

Padeline merupakan aplikasi berbasis **Java** yang digunakan untuk melakukan pemesanan lapangan padel melalui terminal. Program ini merupakan pengembangan lanjutan dari posttest sebelumnya dengan penambahan konsep **Abstraction (Abstract Class)** dan **Interface** dalam Object Oriented Programming (OOP).
Pada tahap ini, sistem dibuat lebih terstruktur dengan memisahkan **template data**, **jenis objek**, dan **kontrak perilaku (interface)**.

---

# Konsep OOP yang Digunakan

Program ini menerapkan beberapa konsep penting dalam OOP:

1. **Class & Object**
   Digunakan untuk merepresentasikan data dan objek dalam sistem.

2. **Encapsulation**
   Atribut pada class dibuat `private` dan diakses menggunakan getter dan setter.

3. **Inheritance**
   Class turunan mewarisi atribut dan method dari class induk.

4. **Abstraction (Abstract Class)**
   Digunakan untuk membuat class yang hanya berfungsi sebagai template dan tidak dapat diinstansiasi langsung.

5. **Interface**
   Digunakan sebagai kontrak yang harus diimplementasikan oleh class tertentu.

---

# Abstract Class

Pada program ini, class `Booking` diubah menjadi **abstract class**.

Ciri-ciri yang diterapkan:

* Tidak dapat dibuat objek langsung
* Digunakan sebagai parent class
* Memiliki abstract method

Contoh:

```java
abstract class Booking {
    public abstract int hitungDiskon();
}
```

Abstract method tersebut **tidak memiliki body** dan wajib diimplementasikan oleh subclass.

---

# Inheritance

Program menggunakan konsep **Hierarchical Inheritance**, yaitu satu parent memiliki beberapa child class.

Struktur:

```
Booking (Abstract Class)
│
├── BookingReguler
├── BookingMember
└── BookingVIP
```

Setiap subclass memiliki perbedaan pada perhitungan diskon:

* Reguler → tanpa diskon
* Member → diskon 50.000
* VIP → diskon 100.000

---

# Interface

Program juga menggunakan interface bernama `Pembayaran`.

Interface ini berfungsi sebagai **kontrak pembayaran** yang harus diimplementasikan oleh setiap jenis booking.

Contoh:

```java
interface Pembayaran {
    void prosesPembayaran();
    void tampilkanStruk();
}
```

Class yang mengimplementasikan interface:

* `BookingReguler`
* `BookingMember`
* `BookingVIP`

Setiap class wajib mengimplementasikan seluruh method yang ada di dalam interface.

---

# Struktur Class

Program terdiri dari beberapa class utama:

---

## 1. `Booking.java` (Abstract Class)

Berfungsi sebagai template utama untuk semua jenis booking.

Atribut:

* namaPelanggan
* nomorLapangan
* jamMulai
* durasiJam
* totalHarga

Memiliki abstract method:

* `hitungDiskon()`

---

## 2. `BookingReguler.java`

Subclass dari `Booking`.

* Tidak memiliki diskon
* Mengimplementasikan interface `Pembayaran`

---

## 3. `BookingMember.java`

Subclass dari `Booking`.

* Memiliki diskon sebesar 50.000
* Mengimplementasikan interface `Pembayaran`

---

## 4. `BookingVIP.java`

Subclass dari `Booking`.

* Memiliki diskon sebesar 100.000
* Mengimplementasikan interface `Pembayaran`

---

## 5. `Pembayaran.java` (Interface)

Berisi kontrak method:

* `prosesPembayaran()`
* `tampilkanStruk()`

---

## 6. `Lapangan.java`

Menyimpan data lapangan dan status ketersediaannya.

---

## 7. `Padeline.java`

Merupakan class utama yang menjalankan program.

Fungsi:

* Menampilkan menu
* Mengelola booking
* Mengelola pembayaran
* Menyimpan data menggunakan ArrayList

---

# Fitur Program

1. Registrasi pengguna
2. Booking lapangan
3. Lihat daftar lapangan
4. Lihat detail booking
5. Ganti jam booking
6. Batalkan booking
7. Pembayaran booking

---





# Kesimpulan

Program **Padeline Booking System – Posttest 4** berhasil menerapkan konsep **Abstraction dan Interface** dalam OOP.

* Abstract class digunakan sebagai template utama sistem booking
* Interface digunakan sebagai kontrak untuk fitur pembayaran
* Inheritance digunakan untuk membedakan jenis booking
* Encapsulation menjaga keamanan data

Dengan kombinasi konsep tersebut, program menjadi lebih modular, terstruktur, dan mudah dikembangkan.
