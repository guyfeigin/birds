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
            birdList.add(new BirdsType("צוללן שחור גרון ", "צוללנים", R.drawable.zolelanshorgaron, "zolelanShhorGaron.html",
                    new int[]{R.drawable.zolelansh1,R.drawable.zolelansh2
                    ,R.drawable.zolelansh3}, new String[]{"שחור"}, new String[]{"אילת"}));
        }
    }
    public static class tavlanim
    {
        public void initFamily (ArrayList<BirdsType> birdList) {
            birdList.add(new BirdsType("  טבלן גמדי ", "טבלנים", R.drawable.tavlangamadi1, "",
                    new int[]{R.drawable.tavlangamadi1,R.drawable.tavlangamadi2,R.drawable.tavlangamadi3,R.drawable.tavlangamadi4,
                    R.drawable.tavlangamadi5}, new String[]{"שחור"}, new String[]{"צפון","מרכז"}));
            birdList.add(new BirdsType("טבלן אפור-לחיים", "טבלנים", R.drawable.tavlanaforlehayayim1, "",
                    new int[]{R.drawable.tavlanaforlehayayim1,R.drawable.tavlanaforlehayayim2,
                            R.drawable.tavlanaforlehayayim3,R.drawable.tavlanaforlehayayim4}, new String[]{"שחור"}, new String[]{"אילת"}));
        }
    }
    public static class yasuraim
    {
        public void initFamily (ArrayList<BirdsType> birdList) {
            birdList.add(new BirdsType("יסעור גדול", "יסעוראים", R.drawable.yasurgadol, "yasurGadol.html",
                    new int[]{R.drawable.yasurgadol2,R.drawable.yasurgadol3,R.drawable.yasurgadol4}, new String[]{"שחור"}, new String[]{"",""}));
            birdList.add(new BirdsType("יסעור כהה", "יסעוראים", R.drawable.yasurkehe, "yasurKehe.html",
                    new int[]{R.drawable.yasurkehe1,R.drawable.yasurkehe2,
                            R.drawable.yasurkehe3,R.drawable.yasurkehe4}, new String[]{"שחור"}, new String[]{"אילת"}));
            birdList.add(new BirdsType(" יסעור מצוי", "יסעוראים", R.drawable.yasurmazuy, "yasurMazuy.html",
                    new int[]{R.drawable.yasurmazuy}, new String[]{"שחור"}, new String[]{""}));
            birdList.add(new BirdsType(" יסעורון אטלנטי ", "יסעוראים", R.drawable.yasuronatlanty, "yasurAtlanty.html",
                    new int[]{R.drawable.yasuronatlanty}, new String[]{"שחור"}, new String[]{""}));
        }
    }
    public static class avazaim
    {
        public void initFamily (ArrayList<BirdsType> birdList) {

            birdList.add(new BirdsType(" אווז לבן מצח", "אווזאים", R.drawable.avazlavanmezah, "avazLavanMezah.html",
                    new int[]{R.drawable.avazlavanmezah,R.drawable.avazlavanmezah1}, new String[]{"לבן"}, new String[]{"",""}));
            birdList.add(new BirdsType("אווז קטן", "אווזאים", R.drawable.avazkatan, "avazKatan.html",
                    new int[]{R.drawable.avazkatan,R.drawable.avazkatan1}, new String[]{"לבן"}, new String[]{"",""}));
            birdList.add(new BirdsType("אווז אחו ", "אווזאים", R.drawable.avazahu, "avazAhu.html",
                    new int[]{R.drawable.avazahu,R.drawable.avazahu1,R.drawable.avazahu2,R.drawable.avazahu3,
                            R.drawable.avazahu4}, new String[]{""}, new String[]{"",""}));
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
