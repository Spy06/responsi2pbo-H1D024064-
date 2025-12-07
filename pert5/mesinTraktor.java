package pert5;
class mesinTraktor extends defaultMesin {
    protected double kapasitasTarik;

    public mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    public void tampilInfo() {
        System.out.printf("Mesin Traktor %s | Tarik: %.1f ton | Tenaga: %d HP\n",
                this.namaMesin, this.kapasitasTarik, this.tenagaHP);
    }

    @Override
    public double nilaiPerforma() {
        return (this.tenagaHP * 1.05) + (this.kapasitasTarik * 5.0);
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor";
    }

    public String suaraMesin() {
        return "GGGRRRR! Hidup mesinnn!";
    }
}
