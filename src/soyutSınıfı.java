
public abstract class soyutSınıfı {
    
    private int id;
    private String tc;
    private String ad;
    public String soyad;
    private String tarih;
    private String saat;

    public soyutSınıfı(int id, String tc, String ad, String soyad, String tarih, String saat) {
        this.id = id;
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.tarih = tarih;
        this.saat = saat;
    }
    
    
    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    
}
