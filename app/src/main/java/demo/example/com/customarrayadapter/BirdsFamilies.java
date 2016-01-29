package demo.example.com.customarrayadapter;

import java.util.ArrayList;

/**
 * Created by myuser on 27/01/2016.
 */
public class BirdsFamilies  {
    public static class tarnegolaim
    {
        public ArrayList<BirdsType> initFamily () {
            ArrayList<BirdsType> birdList = new ArrayList<BirdsType>();
            birdList.add(new BirdsType("חוגלת סלעים", "תרנגולאים", R.drawable.hoglatslaim, "hoglatSlaim.html",
                    new int[]{R.drawable.hoglatslaim,R.drawable.hoglatslaim1,R.drawable.hoglatslaim2}, "חום", ""));
            birdList.add(new BirdsType("קורא מידברי ", "תרנגולאים", R.drawable.koremidbari, "koreMidbari.html",
                    new int[]{R.drawable.koremidbari,R.drawable.koremidbari1,R.drawable.koremidbari2,R.drawable.koremidbari3}, "חום", "דרום"));
            birdList.add(new BirdsType(" פרנקולין שחור ", "תרנגולאים", R.drawable.frankolinshahor, "frankolinShahor.html",
                    new int[]{R.drawable.frankolinshahor1,R.drawable.frankolinshahor2,R.drawable.frankolinshahor3,R.drawable.frankolinshahor4}, "שחור", "עמק הירדן"));
            birdList.add(new BirdsType("  שליו נודד ", "תרנגולאים", R.drawable.slavnoded, "slavNoded.html",
                    new int[]{R.drawable.slavnoded}, "חום", " "));

            return birdList;
    }
    }
    public static class zolelanim
    {
        public ArrayList<BirdsType> initFamily () {
            ArrayList<BirdsType> birdList = new ArrayList<BirdsType>();
            birdList.add(new BirdsType("צוללן אדום גרון ", "צוללנים", R.drawable.zolelanadomgaron, "",
                    new int[]{R.drawable.zolelanadomgaron}, "", ""));
            return birdList;
        }
    }
    public static class Families

    {
        public ArrayList<BirdsType> initFamilies () {
        ArrayList<BirdsType> birdList = new ArrayList<BirdsType>();
            birdList.add(new BirdsType("תרנגולאים", " ", R.drawable.kore, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("צוללנים", " ", R.drawable.zolelanim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("טבלנים", " ", R.drawable.tavlan, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("יסעוראים", " ", R.drawable.yasuur, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("אווזאים", " ", R.drawable.avazaim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("פלמינגואים", " ", R.drawable.flamingoim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("אנפות וחסידות", " ", R.drawable.anafot, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("שקנאים", " ", R.drawable.saknaim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("דורסי יום", " ", R.drawable.dorseiyom, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("עגוראים", " ", R.drawable.aguraim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("חופמאים", " ", R.drawable.hofamaim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("יונאים", " ", R.drawable.yonaim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("תוכאים", " ", R.drawable.tukaim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("סיסאים", " ", R.drawable.sisaim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("תחמסאים", " ", R.drawable.thamsaim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("ינשופים", " ", R.drawable.yanshufim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("קוקיתיים", " ", R.drawable.kukitiyim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("כחלאים", " ", R.drawable.kakhlaim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("נקראים", " ", R.drawable.nakraim, "",
                    new int[]{}, "", ""));
            birdList.add(new BirdsType("ציפורי שיר", " ", R.drawable.shir, "",
                    new int[]{}, "", ""));

       /* birdList.add(new BirdsType("טריסטמית", "ציפורי שיר", R.drawable.tristams, "tristamit.html",
                new int[]{R.drawable.tristams, R.drawable.tristams1, R.drawable.tristams2}, "שחור", "בקעה"));
        birdList.add(new BirdsType("בולבול", "ציפורי שיר", R.drawable.spectacled_bulbul,
                "bulbul.html", new int[]{R.drawable.spectacled_bulbul, R.drawable.bulbul1, R.drawable.bulbul2, R.drawable.bulbul3,
                R.drawable.bulbul3, R.drawable.bulbul4, R.drawable.bulbul5}, "לבן", "צפון"));
        birdList.add(new BirdsType("סיקסאק", "חופמאים", R.drawable.spur_winged_lapwing, "siksak.html",
                new int[]{R.drawable.spur_winged_lapwing, R.drawable.siksak, R.drawable.siksak2, R.drawable.siksak3}, "שחור", "מרכז"));
        birdList.add(new BirdsType("עורבני", "ציפורי שיר\"", R.drawable.orvani, "orvani.html"
                , new int[]{R.drawable.spectacled_bulbul, R.drawable.tristams, R.drawable.tristams}, "כחול", "מרכז"));
        birdList.add(new BirdsType("טריסטמית", "ציפורי שיר", R.drawable.tristams, "tristamit.html",
                new int[]{R.drawable.tristams, R.drawable.tristams, R.drawable.tristams}, "שחור", "south"));
        birdList.add(new BirdsType("בולבול", "ציפורי שיר", R.drawable.spectacled_bulbul,
                "bulbul.html", new int[]{R.drawable.spectacled_bulbul, R.drawable.tristams, R.drawable.tristams}, "לבן", "north"));
        birdList.add(new BirdsType("סיקסאק", "חופמאים", R.drawable.spur_winged_lapwing, "",
                new int[]{R.drawable.spur_winged_lapwing, R.drawable.tristams, R.drawable.tristams}, "שחור", ""));
        birdList.add(new BirdsType("עורבני", "ציפורי שיר\"", R.drawable.orvani, "orvani.html"
                , new int[]{R.drawable.spectacled_bulbul, R.drawable.tristams, R.drawable.tristams}, "כחול", ""));

        birdList.add(new BirdsType("טריסטמית", "ציפורי שיר", R.drawable.tristams, "tristamit.html",
                new int[]{R.drawable.tristams, R.drawable.tristams, R.drawable.tristams}, "שחור", "south"));
        birdList.add(new BirdsType("בולבול", "ציפורי שיר", R.drawable.spectacled_bulbul,
                "bulbul.html", new int[]{R.drawable.spectacled_bulbul, R.drawable.tristams, R.drawable.tristams}, "לבן", "north"));
        birdList.add(new BirdsType("סיקסאק", "חופמאים", R.drawable.spur_winged_lapwing, "",
                new int[]{R.drawable.spur_winged_lapwing, R.drawable.tristams, R.drawable.tristams}, "שחור", ""));
        birdList.add(new BirdsType("עורבני", "ציפורי שיר\"", R.drawable.orvani, "orvani.html"
                , new int[]{R.drawable.spectacled_bulbul, R.drawable.tristams, R.drawable.tristams}, "כחול", ""));*/

        return birdList;
    }
    }
}
