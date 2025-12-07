package pert6;

public class PesawatTempur extends KendaraanGalaksi {
    private int jumlahRudal;

    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    public void aktifkanMesin() {
        if (this.levelEnergi < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    public void jelajah(int jarak) {
        double konsumsi = jarak * 3.0;

        if (this.levelEnergi < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            this.levelEnergi -= (int) konsumsi;
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiAwal = this.levelEnergi;
        this.levelEnergi = Math.min(100, this.levelEnergi + jumlah);
        System.out.println("Mengisi energi Pesawat Tempur. Energi naik dari " + energiAwal + "% menjadi " + this.levelEnergi + "%.");
    }

    public void tembakRudal(int jumlah) {
        if (this.jumlahRudal >= jumlah) {
            this.jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal menembak. Jumlah rudal (" + this.jumlahRudal + ") tidak mencukupi.");
        }
    }
}