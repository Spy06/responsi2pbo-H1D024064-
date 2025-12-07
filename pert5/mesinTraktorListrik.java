package pert5;

class mesinTraktorListrik extends mesinTraktor {
    protected double kapasitasBaterai;

    public mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    public void tampilInfo() {
        System.out.printf("Mesin Traktor Listrik %s | Tarik: %.1f ton | Baterai: %.0f kWh | Tenaga: %d HP\n",
                this.namaMesin, this.kapasitasTarik, this.kapasitasBaterai, this.tenagaHP);
    }

    @Override
    public double nilaiPerforma() {
        return (this.tenagaHP * 0.9) + (this.kapasitasTarik * 10.0) + (this.kapasitasBaterai * 5.0);
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    @Override
    public String suaraMesin() {
        return "Bzzzzz! Mesin traktor listrik aktif!";
    }
}