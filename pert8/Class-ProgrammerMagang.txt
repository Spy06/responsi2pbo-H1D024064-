// CLASS ProgrammerMagang harus MENGIMPLEMENTASIKAN (implements) KaryawanKontrak dan AksesSistem
public class ProgrammerMagang /* LENGKAPI implements KaryawanKontrak, AksesSistem */ {
    
    // ==========================================================
    // ATRIBUT/STATE (Dibutuhkan untuk menyimpan data objek)
    // ==========================================================
    
    // Deklarasikan 4 atribut private:
    // 1. String nama
    // 2. double gajiPerJam
    // 3. String pinRahasia
    // 4. boolean sedangLogin
    
    
    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    
    // Buat satu constructor yang menerima 3 parameter (nama, gajiPerJam, pinRahasia).
    // Inisialisasi atribut sedangLogin dengan nilai default 'false'.
    
    
    // ==========================================================
    // IMPLEMENTASI METHOD DARI KaryawanKontrak
    // ==========================================================
    
    // @Override: IMPLEMENTASIKAN hitungGaji(int jamKerja)
    // LOGIKA: Hitung gaji (jamKerja * gajiPerJam) dan tampilkan hasilnya.
    
    // @Override: IMPLEMENTASIKAN perpanjangKontrak(int durasiBulan)
    // LOGIKA: Tampilkan pesan konfirmasi perpanjangan kontrak.
    
    // @Override: IMPLEMENTASIKAN getStatusCuti() (Override Default Method)
    // LOGIKA: Kembalikan nilai String yang spesifik untuk magang: "Tersedia 5 hari".
    
    
    // ==========================================================
    // IMPLEMENTASI METHOD DARI AksesSistem
    // ==========================================================
    
    // @Override: IMPLEMENTASIKAN login(String pin)
    // LOGIKA: Cek apakah pin yang diterima sama dengan pinRahasia. 
    //         Jika sama, ubah sedangLogin = true dan tampilkan pesan berhasil.
    //         Jika tidak, tampilkan pesan gagal.
    
    // @Override: IMPLEMENTASIKAN logout()
    // LOGIKA: Ubah sedangLogin = false dan tampilkan pesan logout.
    
    // @Override: IMPLEMENTASIKAN getRoleAkses() (Override Default Method)
    // LOGIKA: Kembalikan nilai String yang spesifik untuk magang: "Magang IT".
    
}