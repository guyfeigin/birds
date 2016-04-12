package demo.example.com.customarrayadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;

public class ListActivity extends AppCompatActivity {
    String color;
    boolean colorBlack=false;
    boolean colorBrown=false;
    boolean colorWhite=false;
    boolean colorRed=false;
    boolean colorYellow=false;
    boolean colorGreen=false;
    boolean colorBlue=false;
    String area;
    private  BirdsAdapter MyBirdsAdapter;
    private ArrayList<BirdsType> birdList= new ArrayList<BirdsType>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        color = intent.getStringExtra("Color");
        colorBlack=intent.getBooleanExtra("ColorBlack",false);
        colorBrown=intent.getBooleanExtra("ColorBrown",false);
        colorWhite=intent.getBooleanExtra("ColorWhite",false);
        colorRed=intent.getBooleanExtra("ColorRed",false);
        colorYellow=intent.getBooleanExtra("ColorYellow",false);
        colorGreen=intent.getBooleanExtra("ColorGreen",false);
        colorBlue=intent.getBooleanExtra("ColorBlue",false);
        area = intent.getStringExtra("Area");



        if(savedInstanceState == null || !savedInstanceState.containsKey("birdsList")) {
            initDataWithBirds();
            setDataOnAdapter(color,area);
            //birdList = new ArrayList<BirdsType>(Birds);
        }
        else {
            birdList = savedInstanceState.getParcelableArrayList("birdsList");
        }

        MyBirdsAdapter = new BirdsAdapter(this, birdList);
        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) findViewById(R.id.listview_list);
        listView.setAdapter(MyBirdsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                BirdsType tempBird = MyBirdsAdapter.getItem(position);
                // Toast.makeText(getActivity(), tempBird.BirdName, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplication(), DetailActivity.class);
                intent.putExtra("name", tempBird.BirdName);
                intent.putExtra("family", tempBird.BirdFamily);
                intent.putExtra("image", tempBird.image);
                intent.putExtra("Description", tempBird.Description);
                intent.putExtra("pics", tempBird.pics);
                startActivity(intent);

            }
        });
        }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putParcelableArrayList("birdsList", birdList);
        super.onSaveInstanceState(outState);
    }
    private void setDataOnAdapter(String color,String area){

        if (colorIsEmpty() && area.isEmpty())
        {
           //MyBirdsAdapter.notifyDataSetChanged();
            return;
        }
        for (Iterator<BirdsType> iterator =birdList.iterator(); iterator.hasNext();) {
            BirdsType bird = iterator.next();
            //check to see if bird has the selected color by user
            if (!colorIsEmpty() && !containsColor(bird)){
                // Remove the current element from the iterator and the list.
                iterator.remove();
                continue;
            }
            //check to see if bird has the selected area by user
            if (!area.isEmpty() && !containsArea(area,bird)){
                // Remove the current element from the iterator and the list.
                iterator.remove();
                continue;
            }
        }

        //MyBirdsAdapter.notifyDataSetChanged();
    }
    private boolean colorIsEmpty(){
        boolean empty=true;
        if(colorBlack||colorBlue||colorBrown||colorGreen
                ||colorRed||colorWhite||colorYellow) {
            empty=false;
        }
        return empty;
    }
    private boolean containsColor(BirdsType bird) {
        boolean found = false;
        if (colorBlack) {
            for (String curVal : bird.colors) {
                if (curVal.contains("שחור")) {
                    found = true;
                }
            }
            if (!found) return false;
        }
        if (colorBrown) {
            for (String curVal : bird.colors) {
                if (curVal.contains("חום")) {
                    found = true;
                }
            }
            if(!found) return false;
            }
        if (colorWhite) {
            for (String curVal : bird.colors) {
                if (curVal.contains("לבן")) {
                    found = true;
                }
            }
            if(!found) return false;
        }
        if (colorRed) {
            for (String curVal : bird.colors) {
                if (curVal.contains("אדום")) {
                    found = true;
                }
            }
            if(!found) return false;
        }
        if (colorYellow) {
            for (String curVal : bird.colors) {
                if (curVal.contains("צהוב")) {
                    found = true;
                }
            }
            if(!found) return false;
        }
        if (colorGreen) {
            for (String curVal : bird.colors) {
                if (curVal.contains("ירוק")) {
                    found = true;
                }
            }
            if(!found) return false;
        }
        if (colorBlue) {
            for (String curVal : bird.colors) {
                if (curVal.contains("כחול")) {
                    found = true;
                }
            }
            if(!found) return false;
        }

        return found;
        }
    private boolean containsArea(String area,BirdsType bird){
        boolean found = false;
        for (String curVal : bird.areas) {
            if (curVal.contains(area)) {
                found = true;
            }
        }
        return found;
    }
    private void initDataWithBirds() {
        birdList.clear();
        BirdsFamilies.tarnegolaim tarnegolaim = new BirdsFamilies.tarnegolaim();
        tarnegolaim.initFamily(birdList);
        BirdsFamilies.zolelanim zolelanim = new BirdsFamilies.zolelanim();
        zolelanim.initFamily(birdList);
        BirdsFamilies.tavlanim tavlanim = new BirdsFamilies.tavlanim();
        tavlanim.initFamily(birdList);
        BirdsFamilies.yasuraim yasuraim = new BirdsFamilies.yasuraim();
        yasuraim.initFamily(birdList);
        BirdsFamilies.avazaim avazaim = new BirdsFamilies.avazaim();
        avazaim.initFamily(birdList);

    }
}

