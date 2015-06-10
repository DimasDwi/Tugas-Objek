/**
 * Created by user on 6/9/2015.
 */
public class AdidasEndorsed {

    //atribut
    private String namaEndorsed;
    private int umurEndorsed;
    private String namasepatuEndorsed;
    private int tahunEndorsed;
    private Pemakai adidas;

    public AdidasEndorsed(String namaEndorsed, int umurEndorsed, String namasepatuEndorsed, int tahunEndorsed, Pemakai adidas) {
        this.namaEndorsed = namaEndorsed;
        this.umurEndorsed = umurEndorsed;
        this.namasepatuEndorsed = namasepatuEndorsed;
        this.tahunEndorsed = tahunEndorsed;
        this.adidas = adidas;
    }

    public String getNamaEndorsed() {
        return namaEndorsed;
    }

    public void setNamaEndorsed(String namaEndorsed) {
        this.namaEndorsed = namaEndorsed;
    }

    public int getUmurEndorsed() {
        return umurEndorsed;
    }

    public void setUmurEndorsed(int umurEndorsed) {
        this.umurEndorsed = umurEndorsed;
    }

    public String getNamasepatuEndorsed() {
        return namasepatuEndorsed;
    }

    public void setNamasepatuEndorsed(String namasepatuEndorsed) {
        this.namasepatuEndorsed = namasepatuEndorsed;
    }

    public int getTahunEndorsed() {
        return tahunEndorsed;
    }

    public void setTahunEndorsed(int tahunEndorsed) {
        this.tahunEndorsed = tahunEndorsed;
    }

    public Pemakai getAdidas() {
        return adidas;
    }

    public void setAdidas(Pemakai adidas) {
        this.adidas = adidas;
    }


}
