# Padeline Booking System – Posttest 2
Padeline merupakan aplikasi sederhana berbasis **Java** yang digunakan untuk melakukan pemesanan lapangan padel melalui terminal. Program ini merupakan pengembangan dari **Posttest sebelumnya**, dengan tambahan penerapan konsep **Encapsulation** dalam pemrograman berorientasi objek.
Pada Posttest 2 ini, atribut pada setiap class dibuat lebih aman dengan menggunakan **access modifier** serta **method getter dan setter** untuk mengakses data.

---

# Konsep OOP yang Digunakan
Program ini menerapkan beberapa konsep dasar **Object Oriented Programming (OOP)**, yaitu:
1. **Class**
   Digunakan sebagai blueprint untuk membuat objek.
2. **Object**
   Instance dari class yang digunakan untuk menyimpan data.
3. **Encapsulation**
   Menyembunyikan data dengan menjadikan atribut sebagai `private` dan menyediakan akses melalui `getter` dan `setter`.
4. **Access Modifier**
   Digunakan untuk mengatur tingkat akses terhadap atribut dan method.

---

# Access Modifier yang Digunakan

Program ini menggunakan minimal **dua jenis access modifier**, yaitu:

### 1. Private
Digunakan pada atribut class agar tidak dapat diakses langsung dari luar class.
Contoh:

```java
private String nomorLapangan;
private int jamMulai;
```

Dengan menggunakan `private`, data menjadi lebih aman karena hanya dapat diakses melalui method tertentu.

---

### 2. Public
Digunakan pada constructor serta method getter dan setter agar dapat diakses dari class lain.

Contoh:

```java
public String getNomorLapangan()
public void setJamMulai(int jamMulai)
```

---

# Getter dan Setter
Getter dan Setter digunakan untuk **mengambil dan mengubah nilai atribut** dari suatu class tanpa mengakses atribut secara langsung.

Contoh getter:

```java
public String getNomorLapangan(){
    return nomorLapangan;
}
```

Contoh setter:

```java
public void setJamMulai(int jamMulai){
    this.jamMulai = jamMulai;
}
```

---

# Fitur Program
Aplikasi Padeline memiliki beberapa fitur utama sebagai berikut:
1. **Registrasi User**
   Pengguna diminta memasukkan nama sebelum menggunakan sistem booking.
2. **Booking Lapangan**
   Pengguna dapat memilih nomor lapangan, menentukan jam mulai bermain, serta menentukan durasi bermain. Sistem akan otomatis menghitung total biaya berdasarkan harga per jam.
3. **Lihat Lapangan Tersedia**
   Menampilkan daftar lapangan yang tersedia maupun yang sedang tidak tersedia.
4. **Lihat Detail Booking**
   Menampilkan seluruh informasi booking yang telah dilakukan oleh pengguna.
5. **Ganti Jam Booking**
   Pengguna dapat mengubah jam bermain dari booking yang sudah dibuat.
6. **Batalkan Booking**
   Pengguna dapat menghapus booking yang telah dibuat sebelumnya.
7. **Bayar Booking**
   Menampilkan total biaya yang harus dibayarkan oleh pengguna.
---

# Struktur Class
Program ini terdiri dari tiga class utama.

## 1. Class `Lapangan.java`
Class ini merepresentasikan data lapangan yang tersedia pada sistem.
Atribut yang dimiliki:
* `nomorLapangan` → nomor identitas lapangan
* `tersedia` → status ketersediaan lapangan
Class ini juga memiliki method getter dan setter untuk mengakses atribut tersebut.

---

## 2. Class `Booking.java`
Class ini digunakan untuk menyimpan informasi pemesanan lapangan.
Atribut yang dimiliki:
* `namaPelanggan` → nama pengguna yang melakukan booking
* `nomorLapangan` → lapangan yang dipilih
* `jamMulai` → waktu mulai bermain
* `durasiJam` → lama bermain
* `totalHarga` → total biaya yang harus dibayar
Seluruh atribut dibuat `private` dan diakses menggunakan **getter dan setter**.

---

## 3. Class `Padeline.java`
Class ini merupakan **class utama** yang menjalankan seluruh program.
Fungsi utama class ini:
* Menjalankan method `main()` sebagai titik awal program
* Menampilkan menu sistem booking
* Mengelola proses booking lapangan
* Menyimpan data menggunakan **ArrayList**

---

# Kesimpulan

Program **Padeline Booking System – Posttest 2** merupakan pengembangan dari sistem booking sebelumnya dengan menerapkan konsep **Encapsulation** pada class yang digunakan. Dengan penggunaan **access modifier** serta **getter dan setter**, data pada program menjadi lebih aman dan terstruktur.

