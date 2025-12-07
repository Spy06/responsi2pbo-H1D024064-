package pert6;

public class KapalEksplorasi extends KendaraanGalaksi {
    private int modulScan;

    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }

    @Override
    public void aktifkanMesin() {
        if (this.levelEnergi < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        double konsumsi = jarak * 2.0;

        if (this.levelEnergi < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            this.levelEnergi -= (int) konsumsi;
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiAwal = this.levelEnergi;
        this.levelEnergi = Math.min(100, this.levelEnergi + jumlah);
        System.out.println("Mengisi energi Kapal Eksplorasi. Energi naik dari " + energiAwal + "% menjadi " + this.levelEnergi + "%.");
    }

    public void scanPlanet(String namaPlanet) {
        System.out.println(
                "Melakukan scan pada planet " + namaPlanet +
                        " dengan modul level " + this.modulScan + "."
        );
    }
}