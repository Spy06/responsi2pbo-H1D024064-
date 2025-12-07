package pert3;

class Manajer extends Karyawan {
    private double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public void tampilInfo() {
        double totalGaji = this.gajiPokok + this.tunjangan;

        System.out.println(
                "Nama: " + this.nama +
                        " | Gaji Pokok: Rp " + this.gajiPokok +
                        " | Tunjangan: Rp " + this.tunjangan
        );
        System.out.println("Total Pendapatan: Rp " + totalGaji);
    }
}