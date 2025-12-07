package pert7;

public class PaymentTest {

    public static void main(String[] args) {

        double saldoAwal = 150000.0;
        double nominalBayar = 50000.0;
        String layanan = "OVO";

        EWalletPayment eWallet = new EWalletPayment(layanan, nominalBayar, saldoAwal);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        System.out.printf("Saldo awal: %.0f\n", eWallet.getSaldoAwal());
        System.out.printf("Memproses pembayaran sebesar %.0f...\n", eWallet.getNominalPembayaran());
        System.out.printf("(Biaya Transaksi: %.0f)\n", eWallet.getTransactionFee());

        String hasilTransaksi = eWallet.processPayment();

        System.out.println();

        System.out.println(hasilTransaksi);

        System.out.printf("Sisa Saldo: %.0f\n", eWallet.getBalance());

        System.out.println(eWallet.getPaymentDetails());
        System.out.println("=========================================");
    }
}