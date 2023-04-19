public class Araba {

    private String kasaTipi;
    private String model;
    private int kullanimKm;
    private double fiyat;
    private int kapi;

    public Araba(String kasaTipi, String model, int kullanimKm, int fiyat, int kapi) {
        this.kasaTipi = kasaTipi;
        this.model = model;
        this.kullanimKm = kullanimKm;
        this.fiyat = fiyat;
        this.kapi = kapi;
    }
    public String getKasaTipi() {
        return kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public int getKullanimKm() {
        return kullanimKm;
    }

    public double getFiyat() {
        return fiyat;
    }

    public int getKapi() {
        return kapi;
    }
    public void arabayiSur(int surulenKm){
        this.kullanimKm += surulenKm;
        System.out.println(" Arabanin yeni kilometresi " + this.kullanimKm);
    }
    public double satisFiyati(double yeniSatisFiyati){
        return this.fiyat = yeniSatisFiyati;
    }



}
