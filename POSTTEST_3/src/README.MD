
# Padeline Booking System – Posttest 3

Padeline merupakan aplikasi sederhana berbasis **Java** yang digunakan untuk melakukan pemesanan lapangan padel melalui terminal. Program ini merupakan pengembangan dari **Posttest 2**, dengan tambahan penerapan konsep **Inheritance.**

Pada Posttest 3 ini, sistem dikembangkan agar memiliki klasifikasi jenis booking yang berbeda (Reguler, Member, dan VIP) yang semuanya diturunkan dari satu basis kelas yang sama.

-----

# Konsep yang Digunakan

1.  **Class & Object**
    Digunakan sebagai blueprint dan instance untuk mengelola data lapangan dan reservasi.
2.  **Encapsulation**
    Menyembunyikan data dengan atribut `private` dan menyediakan akses melalui `getter` dan `setter`.
3.  **Inheritance (Pewarisan)**
    Menerapkan hubungan *is-a* di mana kelas anak (*subclass*) mewarisi sifat dari kelas induk (*superclass*).
4.  **Access Modifier**
    Mengatur tingkat akses atribut dan method menggunakan `private` dan `public`.

-----

# Penerapan Inheritance

### 1\. Superclass: `Booking`

Merupakan kelas induk yang menampung atribut umum seperti nama pelanggan, nomor lapangan, jam mulai, durasi, dan total harga.

### 2\. Subclass:

* **`BookingReguler`** → Digunakan untuk pemesanan standar dengan harga normal.
* **`BookingMember`** → Digunakan untuk pengguna terdaftar dengan potongan harga (Diskon Rp50.000).
* **`BookingVIP`** → Digunakan untuk layanan premium dengan potongan harga lebih besar (Diskon Rp100.000).

-----

# Struktur Class

Program ini terdiri dari beberapa class yang saling berhubungan.

## 1\. Class `Lapangan.java`

Class ini merepresentasikan data fisik lapangan.

* **Atribut:** `nomorLapangan`, `tersedia`.
* **Method:** Getter dan Setter untuk status ketersediaan.

## 2\. Class `Booking.java` (dan Subclass)

Class ini mengelola logika pewarisan data pemesanan.

* **Konstruktor:** Menggunakan keyword `super()` untuk mengirim data dari subclass ke superclass.
* **Relasi:** \* `BookingReguler` *is-a* `Booking`
    * `BookingMember` *is-a* `Booking`
    * `BookingVIP` *is-a* `Booking`

## 3\. Class `Padeline.java`

Class utama yang menjalankan alur program.

* **Logika Baru:** Menambahkan pilihan jenis member saat melakukan proses `bookingLapangan()`.
* **Penyimpanan:** Menggunakan **ArrayList (Booking)** yang secara efisien dapat menyimpan objek dari berbagai subclass (Reguler, Member, VIP) dalam satu daftar yang sama.

-----

# Kesimpulan

Program **Padeline Booking System – Posttest 3** telah berhasil menerapkan konsep **Inheritance** secara logis. Dengan adanya pewarisan,  karena atribut umum cukup didefinisikan satu kali di superclass, sementara perbedaan spesifik ditangani oleh masing-masing subclass.