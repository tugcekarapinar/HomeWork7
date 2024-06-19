import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gezegen> gunesSistemi = new ArrayList<>();
        gunesSistemi.add(Gezegen.MERCURY);
        gunesSistemi.add(Gezegen.VENUS);
        gunesSistemi.add(Gezegen.EARTH);
        gunesSistemi.add(Gezegen.MARS);
        gunesSistemi.add(Gezegen.JUPITER);
        gunesSistemi.add(Gezegen.SATURN);
        gunesSistemi.add(Gezegen.URANUS);
        gunesSistemi.add(Gezegen.NEPTUNE);

        for (Gezegen gezegen : gunesSistemi) {
            System.out.println(gezegen.name());
            System.out.println("Sıra Numarası = " + gezegen.getSiraNo());
            System.out.println("Güneşe Olan Uzaklık(AU) = " + gezegen.getGuneseOlanUzaklik());
            System.out.println("Yarıçapı(km) = " + gezegen.getYaricap());
            System.out.println("Güneş Etrafında Dönme Süresi(Yıl) = " + gezegen.getDonmeSuresi());
            System.out.println("-----------------------------");
        }
    }
}