# Padeline Booking System

Padeline merupakan sistem booking lapangan padel berbasis online dengan JAVA sebagai bahasa utama untuk memudahkan pelanggan melakukan booking dimanapun dan kapanpun.


# Fitur Padeline

Aplikasi Padeline memiliki beberapa fitur utama, yaitu:

1. **Tambah Lapangan**
   Digunakan untuk menambahkan data lapangan baru ke dalam sistem dengan memasukkan ID lapangan, nomor lapangan, dan harga per jam.

2. **Lihat Lapangan**
   Menampilkan seluruh daftar lapangan yang tersedia di sistem.

3. **Update Lapangan**
   Mengubah data lapangan yang sudah ada berdasarkan ID lapangan yang dipilih.

4. **Hapus Lapangan**
   Menghapus data lapangan dari sistem berdasarkan ID lapangan.

5. **Booking Lapangan**
   Melakukan pemesanan lapangan oleh pelanggan dengan mengisi data booking seperti ID booking, nama pelanggan, nomor lapangan, dan jam bermain.

6. **Lihat Booking**
   Menampilkan semua data booking yang telah dilakukan oleh pelanggan.




# Struktur Class

Program ini terdiri dari tiga class utama yang memiliki fungsi masing-masing.

## 1. Class `Lapangan.java`

Class ini digunakan untuk menampilkan data lapangan yang tersedia pada sistem.

Atribut yang dimiliki:

* `IDLapangan`
  Merupakan identitas unik dari setiap lapangan.

* `NomorLapangan`
  Nomor atau kode lapangan yang digunakan untuk membedakan antar lapangan.

* `hargaPerJam`
  Harga sewa lapangan per jam.

Class ini berfungsi sebagai **model data lapangan** yang akan disimpan dan dikelola oleh sistem.

---

## 2. Class `Booking.java`

Class ini digunakan untuk merepresentasikan data pemesanan lapangan oleh pelanggan.

Atribut yang dimiliki:

* `IDBooking`
  Identitas unik untuk setiap transaksi booking.

* `NamaPelanggan`
  Nama pelanggan yang melakukan pemesanan.

* `NomorLapangan`
  Nomor lapangan yang dipesan oleh pelanggan.

* `JamMain`
  Waktu atau jam penggunaan lapangan oleh pelanggan.

Class ini menyimpan semua informasi terkait proses pemesanan lapangan.


## 3. Class `Padeline.java`

Class ini merupakan class utama(main) yang menjalankan seluruh program.

Fungsi utama dari class ini:

* Menjalankan method `main()` sebagai titik awal program.
* Menampilkan **menu utama aplikasi**.
* Mengelola proses **CRUD data lapangan**.
* Mengelola proses **booking lapangan**.

