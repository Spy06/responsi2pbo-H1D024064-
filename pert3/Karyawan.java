package pert3;

class Karyawan {
    protected String nama;
    protected double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void tampilInfo() {
        System.out.println(
                "Nama: " + this.nama +
                        " | Gaji Pokok: Rp " + this.gajiPokok
        );
    }
}