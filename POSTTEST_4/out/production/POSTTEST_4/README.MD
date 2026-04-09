# Padeline Booking System – Posttest 4

Padeline merupakan aplikasi sederhana berbasis **Java** yang digunakan untuk melakukan pemesanan lapangan padel melalui terminal. Program ini merupakan pengembangan dari **Posttest 3**, dengan tambahan penerapan konsep **Polymorphism** (Statis dan Dinamis).

---

# Konsep yang Digunakan

1.  **Class & Object**  
    Blueprint dan instance untuk mengelola data lapangan serta pemesanan.

2.  **Encapsulation**  
    Atribut `private` dengan akses melalui `getter` dan `setter`.

3.  **Inheritance**  
    Relasi *is-a* antara `Booking` (superclass) dengan `BookingReguler`, `BookingMember`, dan `BookingVIP` (subclass).

4.  **Polymorphism**  
    Kemampuan sebuah method untuk memiliki banyak bentuk, baik dalam satu kelas (**overloading**) maupun antar kelas dalam hirarki pewarisan (**overriding**).

5.  **Access Modifier**  
    Pengaturan visibilitas menggunakan `private` dan `public`.

---

# Penerapan Polymorphism

## 1. Dynamic Polymorphism (Method Overriding)

Method overriding terjadi ketika subclass menyediakan implementasi spesifik untuk method yang sudah didefinisikan di superclass. Pada program ini, overriding diterapkan pada method `hitungDiskon()`.

- Kelas `Booking` menyediakan method dasar `hitungDiskon()` yang mengembalikan nilai `0`.
- Kelas `BookingReguler` mewarisi method tersebut dan mengoverride dengan nilai `0` (tidak ada diskon).
- Kelas `BookingMember` mengoverride method `hitungDiskon()` dan mengembalikan nilai `50000`.
- Kelas `BookingVIP` mengoverride method `hitungDiskon()` dan mengembalikan nilai `100000`.


