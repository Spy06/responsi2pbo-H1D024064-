package pert1;

class UjiPengguna {
    public static void main(String[] args) {
        Pengguna p = new Pengguna();

        p.umur = 25;
        p.beratBadan = 60.0;
        p.tinggiBadan = 170.0;

        p.tampilInfo();

        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");
    }
}