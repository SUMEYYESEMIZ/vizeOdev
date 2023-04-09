public class Main {
    private String ad;
    private String soyad;
    private String email;

    public Main(String ad, String soyad, String email) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
    }

    // Getters ve Setters
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}