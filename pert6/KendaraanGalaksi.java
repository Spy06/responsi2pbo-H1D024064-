package pert6;

public abstract class KendaraanGalaksi {
    private String namaKendaraan;
    protected int levelEnergi; // Menggunakan protected agar subclass mudah mengakses
    private int kapasitasPenumpang;

    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100; // levelEnergi default = 100
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public final void tampilStatus() {
        System.out.println(
                this.namaKendaraan +
                        " | Energi: " + this.levelEnergi + "%" +
                        " | Kapasitas: " + this.kapasitasPenumpang + " orang"
        );
    }

    public abstract void aktifkanMesin();

    public abstract void jelajah(int jarak);

    public abstract void isiEnergi(int jumlah);
}