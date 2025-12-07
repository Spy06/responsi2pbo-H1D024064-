package pert2;

class BarangMusik {
    private String kodeBarang;
    private String namaAlatMusik;
    private double hargaSatuan;
    private int jumlahStok;

    public BarangMusik(String kode, String nama, double harga, int stok) {
        this.kodeBarang = kode;
        this.namaAlatMusik = nama;
        this.hargaSatuan = harga;
        this.jumlahStok = stok;
    }

    public BarangMusik(String kode, String nama, double harga) {
        // Memanggil constructor lengkap, dengan stok diset 0
        this(kode, nama, harga, 0);
    }

    public BarangMusik(String kode, String nama) {
        this(kode, nama, 0.0);
    }

    public void ubahHarga(double hargaBaru) {
        if (hargaBaru >= 0) {
            this.hargaSatuan = hargaBaru;
        } else {
            System.out.println("Harga tidak valid.");
        }
    }

    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.jumlahStok += jumlah;
        } else {
            System.out.println("Jumlah penambahan stok harus positif.");
        }
    }

    public void tampilInfo() {
        System.out.println(
                "Alat musik " + this.namaAlatMusik +
                        " | Kode: " + this.kodeBarang +
                        " | Harga: Rp " + this.hargaSatuan +
                        " | Stok: " + this.jumlahStok + " unit"
        );
    }
}