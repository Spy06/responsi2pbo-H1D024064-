package pert7;

public class EWalletPayment implements PaymentMethod {

    private String namaLayanan;
    private double nominalPembayaran;
    private double saldoAwal;
    private double saldoPengguna;

    private static final double FEE = 2000.0;

    public EWalletPayment(String namaLayanan, double nominalPembayaran, double saldoPengguna) {
        this.namaLayanan = namaLayanan;
        this.nominalPembayaran = nominalPembayaran;
        this.saldoAwal = saldoPengguna; // Menyimpan saldo awal untuk ditampilkan
        this.saldoPengguna = saldoPengguna;
    }

    @Override
    public String processPayment() {
        double totalBiaya = this.nominalPembayaran + getTransactionFee();

        if (this.saldoPengguna >= totalBiaya) {
            this.saldoPengguna -= totalBiaya;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi: Pembayaran dilakukan melalui " + this.namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return FEE;
    }

    @Override
    public double getBalance() {
        return this.saldoPengguna;
    }

    public double getSaldoAwal() {
        return this.saldoAwal;
    }

    public double getNominalPembayaran() {
        return this.nominalPembayaran;
    }
}