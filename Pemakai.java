/**
 * Created by user on 6/9/2015.
 */
public class Pemakai {

    private String namaPemakai;
    private int ukuranSepatu;
    private String kewarganegaraanPemakai;
    private String clubPemakai;

    public Pemakai(String namaPemakai, int ukuranSepatu, String kewarganegaraanPemakai, String clubPemakai) {
        this.namaPemakai = namaPemakai;
        this.ukuranSepatu = ukuranSepatu;
        this.kewarganegaraanPemakai = kewarganegaraanPemakai;
        this.clubPemakai = clubPemakai;
    }

    public String getNamaPemakai() {
        return namaPemakai;
    }

    public void setNamaPemakai(String namaPemakai) {
        this.namaPemakai = namaPemakai;
    }

    public int getUkuranSepatu() {
        return ukuranSepatu;
    }

    public void setUkuranSepatu(int ukuranSepatu) {
        this.ukuranSepatu = ukuranSepatu;
    }

    public String getKewarganegaraanPemakai() {
        return kewarganegaraanPemakai;
    }

    public void setKewarganegaraanPemakai(String kewarganegaraanPemakai) {
        this.kewarganegaraanPemakai = kewarganegaraanPemakai;
    }

    public String getClubPemakai() {
        return clubPemakai;
    }

    public void setClubPemakai(String clubPemakai) {
        this.clubPemakai = clubPemakai;
    }

    @Override
    public String toString() {
        return "Pemakai{" +
                "namaPemakai='" + namaPemakai + '\'' +
                ", ukuranSepatu=" + ukuranSepatu +
                ", kewarganegaraanPemakai='" + kewarganegaraanPemakai + '\'' +
                ", clubPemakai='" + clubPemakai + '\'' +
                '}';
    }
}
