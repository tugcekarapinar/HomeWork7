public enum Gezegen {
    MERCURY(1, 0.39, 2439.7, 0.24),
    VENUS(2, 0.72, 6051.8, 0.62),
    EARTH(3, 1.0, 6371.0, 1.0),
    MARS(4, 1.52, 3389.5, 1.88),
    JUPITER(5, 5.2, 69911.0, 11.86),
    SATURN(6, 9.58, 58232.0, 29.46),
    URANUS(7, 19.22, 25362.0, 84.01),
    NEPTUNE(8, 30.05, 24622.0, 164.8);

    private int siraNo;
    private double guneseOlanUzaklik; // Birim: Astronomik birim (AU)
    private double yaricap; // Birim: Kilometre (km)
    private double donmeSuresi; // Birim: Yıl

    Gezegen(int siraNo, double guneseOlanUzaklik, double yaricap, double donmeSuresi) {
        this.siraNo = siraNo;
        this.guneseOlanUzaklik = guneseOlanUzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSiraNo() {
        return siraNo;
    }

    public double getGuneseOlanUzaklik() {
        return guneseOlanUzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }
}