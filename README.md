# Click-Ninja
Repository ini dibuat sebagai bahan praktik dalam penggunaan frida.

## Cara Kerja Aplikasi
Kalian diminta untuk mengklik tombol FAB yang ada di aplikasi sampai mendapatkan angka 1337 yang mana nantinya akan menampilkan sebuah teks flag ke layar.
Namun sebenarnya tantangan ini tidak mungkin bisa di selesaikan hanya dengan cara mengklik tombol FAB, karena angka yang akan di generate hanya akan ada di antara 2000-10000.

```java
public void onClick(View v) {
  if (v.getId() == R.id.fab_get_random_number) {
    int randomNumber = getRandomNumber();
      if (isSpecialNumber(randomNumber)) {
        tvNumber.setText(R.string.flag_ninja);
      } else {
        tvNumber.setText(String.valueOf(randomNumber));
      }
  }
}

private static int getRandomNumber() {
  Random random = new Random();
  return random.nextInt(10000 - 2000) + 2000;
}

private static boolean isSpecialNumber(int number) {
  return number == 1337;
}
```

Jadi tugas kalian adalah merubah implementasi salah satu function di atas ketika aplikasi sedang digunakan, jadi kalian tidak boleh merubahnya langsung dari source code yang di sediakan di sini.
