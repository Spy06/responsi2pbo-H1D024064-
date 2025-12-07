package pert4;

class Member extends Customer {
    private int poinReward;
    private String levelKeanggotaan;

    public Member(String namaLengkap, String nomorIdentitasCustomer, int totalBelanja, int poinReward, String levelKeanggotaan) {
        super(namaLengkap, nomorIdentitasCustomer, totalBelanja);

        this.poinReward = poinReward;
        this.levelKeanggotaan = levelKeanggotaan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();

        System.out.println(
                "Poin Reward: " + this.poinReward +
                        " | Level: " + this.levelKeanggotaan
        );
    }
}