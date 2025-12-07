package pert4;

class Customer {
    protected String namaLengkap;
    protected String nomorIdentitasCustomer;
    protected int totalBelanja;

    public Customer(String namaLengkap, String nomorIdentitasCustomer, int totalBelanja) {
        this.namaLengkap = namaLengkap;
        this.nomorIdentitasCustomer = nomorIdentitasCustomer;
        this.totalBelanja = totalBelanja;
    }

    public void tampilkanInfo() {
        System.out.println(
                "Nama: " + this.namaLengkap +
                        " | ID: " + this.nomorIdentitasCustomer +
                        " | Total Belanja: Rp " + this.totalBelanja
        );
    }
}