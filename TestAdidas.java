/**
 * Created by user on 6/9/2015.
 */
public class TestAdidas {
    public static void main(String[] args) {

        //class pemakai
        Pemakai Dimas = new Pemakai ("Lionel Messi",42,"p","o");            //cara construcktor pertama
        Dimas.setKewarganegaraanPemakai("Argentina");                       //cara construcktor kedua
        Dimas.setClubPemakai("FC Barcelona");
        System.out.println("Semua Data Pemakai : " + Dimas.toString());

        System.out.println("Nama Pemakai : " + Dimas.getNamaPemakai());
        System.out.println("Ukuran Sepatu : " + Dimas.getUkuranSepatu());
        System.out.println("Kewarganegaraan : " + Dimas.getKewarganegaraanPemakai());
        System.out.println("Club Pemakai : " + Dimas.getClubPemakai()+"\n");

        //class adidas endorsed
        AdidasEndorsed Dwi = new AdidasEndorsed ("Gareth Bale",27,"Mundial Goal",2007,Dimas);
        System.out.println("Semua Data Adidas Endorsed : " + Dwi.toString());
        System.out.println("Nama Endorsed : " + Dwi.getNamaEndorsed());
        System.out.println("Umur Endorsed : " + Dwi.getUmurEndorsed());
        System.out.println("Nama Sepatu Endorsed : " + Dwi.getNamasepatuEndorsed());
        System.out.println("Tahun Endorsed : " + Dwi.getTahunEndorsed());

    }
}
