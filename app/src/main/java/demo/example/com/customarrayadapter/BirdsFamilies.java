package demo.example.com.customarrayadapter;

import java.util.ArrayList;

/**
 * Created by myuser on 27/01/2016.
 */
public class BirdsFamilies  {
    public static class tarnegolaim
    {
        public void initFamily (ArrayList<BirdsType> birdList) {
            birdList.add(new BirdsType("חוגלת סלעים", "תרנגולאים", R.drawable.hoglatslaim, "hoglatSlaim.html",
                    new int[]{R.drawable.hoglatslaim,R.drawable.hoglatslaim1,R.drawable.hoglatslaim2}, new String[]{"אדום"}, new String[]{"צפון"}));
            birdList.add(new BirdsType("קורא מידברי ", "תרנגולאים", R.drawable.koremidbari, "koreMidbari.html",
                    new int[]{R.drawable.koremidbari,R.drawable.koremidbari1,R.drawable.koremidbari2,R.drawable.koremidbari3}, new String[]{"חום","צהוב"}, new String[]{""}));
            birdList.add(new BirdsType(" פרנקולין שחור ", "תרנגולאים", R.drawable.frankolinshahor, "frankolinShahor.html",
                    new int[]{R.drawable.frankolinshahor1,R.drawable.frankolinshahor2,R.drawable.frankolinshahor3,R.drawable.frankolinshahor4}, new String[]{"שחור","חום"}, new String[]{"צפון"}));
            birdList.add(new BirdsType("  שליו נודד ", "תרנגולאים", R.drawable.slavnoded, "slavNoded.html",
                    new int[]{R.drawable.slavnoded},new String[]{"חום"}, new String[]{""}));

    }
    }
    public static class zolelanim
    {
        public void initFamily (ArrayList<BirdsType> birdList) {
            birdList.add(new BirdsType("צוללן אדום גרון ", "צוללנים", R.drawable.zolelanadomgaron, "",
                    new int[]{R.drawable.zolelanadomgaron}, new String[]{"שחור"}, new String[]{"צפון"}));
        }
    }
    public static class Families

    {
        public void initFamilies (ArrayList<BirdsType> birdList) {
           // ArrayList<BirdsType> birdList = new ArrayList<BirdsType>();
            birdList.add(new BirdsType("תרנגולאים", " ", R.drawable.kore, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("צוללנים", " ", R.drawable.zolelanim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("טבלנים", " ", R.drawable.tavlan, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("יסעוראים", " ", R.drawable.yasuur, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("אווזאים", " ", R.drawable.avazaim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("פלמינגואים", " ", R.drawable.flamingoim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("אנפות וחסידות", " ", R.drawable.anafot, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("שקנאים", " ", R.drawable.saknaim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("דורסי יום", " ", R.drawable.dorseiyom, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("עגוראים", " ", R.drawable.aguraim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("חופמאים", " ", R.drawable.hofamaim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("יונאים", " ", R.drawable.yonaim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("תוכאים", " ", R.drawable.tukaim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("סיסאים", " ", R.drawable.sisaim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("תחמסאים", " ", R.drawable.thamsaim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("ינשופים", " ", R.drawable.yanshufim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("קוקיתיים", " ", R.drawable.kukitiyim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("כחלאים", " ", R.drawable.kakhlaim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("נקראים", " ", R.drawable.nakraim, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
            birdList.add(new BirdsType("ציפורי שיר", " ", R.drawable.shir, "",
                    new int[]{}, new String[]{""}, new String[]{""}));
    }
    }
}
