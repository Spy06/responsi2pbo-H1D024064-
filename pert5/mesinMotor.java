package pert5;

class mesinMotor extends defaultMesin {
    protected String tipeMotor;

    public mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipe;
    }

    @Override
    public void tampilInfo() {
        System.out.printf("Mesin Motor %s | Tipe: %s | Tenaga: %d HP\n",
                this.namaMesin, this.tipeMotor, this.tenagaHP);
    }

    @Override
    public double nilaiPerforma() {
        return this.tenagaHP * 1.2;
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Motor";
    }

    public String suaraMesin() {
        return "Brummm! Mesin motor menyala!";
    }
}
