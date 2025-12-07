package pert5;
import java.util.Arrays;
import java.util.Comparator;

class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] inventarisMesin = new defaultMesin[5];
        inventarisMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        inventarisMesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0); // Diubah tarik ke 5.0 agar sesuai output
        inventarisMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        inventarisMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        inventarisMesin[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        for (defaultMesin mesin : inventarisMesin) {
            mesin.tampilInfo();
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.printf("Performa: %.1f\n\n", mesin.nilaiPerforma());
        }


        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin mesin : inventarisMesin) {
            if (mesin instanceof mesinMotor) {
                mesinMotor motor = (mesinMotor) mesin;
                System.out.println(motor.namaMesin + " → " + motor.suaraMesin());
            } else if (mesin instanceof mesinTraktorListrik) {
                mesinTraktorListrik traktorListrik = (mesinTraktorListrik) mesin;
                System.out.println(traktorListrik.namaMesin + " → " + traktorListrik.suaraMesin());
            } else if (mesin instanceof mesinTraktor) {
                mesinTraktor traktor = (mesinTraktor) mesin;
                System.out.println(traktor.namaMesin + " → " + traktor.suaraMesin());
            }
        }

        defaultMesin mesinTertinggi = null;
        double performaTertinggi = -1.0;

        for (defaultMesin mesin : inventarisMesin) {
            double performaSaatIni = mesin.nilaiPerforma();
            if (performaSaatIni > performaTertinggi) {
                performaTertinggi = performaSaatIni;
                mesinTertinggi = mesin;
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        if (mesinTertinggi != null) {
            System.out.printf("%s → %.1f\n", mesinTertinggi.namaMesin, performaTertinggi);
        }

        Arrays.sort(inventarisMesin, new Comparator<defaultMesin>() {
            @Override
            public int compare(defaultMesin m1, defaultMesin m2) {
                return Double.compare(m2.nilaiPerforma(), m1.nilaiPerforma());
            }
        });

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        int limit = Math.min(3, inventarisMesin.length);
        for (int i = 0; i < limit; i++) {
            defaultMesin mesin = inventarisMesin[i];
            System.out.printf("%d. %s → %.1f\n", (i + 1), mesin.namaMesin, mesin.nilaiPerforma());
        }
    }
}