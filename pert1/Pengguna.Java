package pert1;

class Pengguna {
    int umur; // tahun
    double beratBadan; // kilogram
    double tinggiBadan; // centimeter
    final double faktorAktivitas = 1.2;

    double hitungBMI() {
        double tinggiMeter = tinggiBadan / 100.0;

        return beratBadan / (tinggiMeter * tinggiMeter);
    }

    void tampilKategori() {
        double bmi = hitungBMI();

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        return beratBadan * faktorAktivitas * 10;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + beratBadan + " kg");
        System.out.println("Tinggi: " + tinggiBadan + " cm");

        double bmi = hitungBMI();
        System.out.printf("BMI: %.2f\n", bmi);

        tampilKategori();

        double kalori = hitungKalori();
        System.out.printf("Kebutuhan Kalori: %.0f kal/hari\n", kalori);
        System.out.println("====================================");
    }
}