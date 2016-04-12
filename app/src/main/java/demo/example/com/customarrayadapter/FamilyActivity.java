package demo.example.com.customarrayadapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private  BirdsAdapter MyBirdsAdapter;
    private ArrayList<BirdsType> familyList= new ArrayList<BirdsType>();
    String familyName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        if(savedInstanceState == null || !savedInstanceState.containsKey("family")) {
            initDataInAdapter();
            //birdList = new ArrayList<BirdsType>(Birds);
        }
        else {
            familyList = savedInstanceState.getParcelableArrayList("family");
        }
/*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
        MyBirdsAdapter = new BirdsAdapter(this, familyList);
        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) findViewById(R.id.listview_family);
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
        outState.putParcelableArrayList("family", familyList);
        super.onSaveInstanceState(outState);
    }

    private void initDataInAdapter() {
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("familyName")) {
            String familyName = intent.getStringExtra("familyName");
            familyList.clear();
            switch (familyName)
            {
                case "צוללנים":
                    BirdsFamilies.zolelanim zolelanim = new BirdsFamilies.zolelanim();
                    zolelanim.initFamily(familyList);
                    break;
                case "תרנגולאים":
                    BirdsFamilies.tarnegolaim tarnegolaim = new BirdsFamilies.tarnegolaim();
                    tarnegolaim.initFamily(familyList);
                    break;
                case "טבלנים":
                    BirdsFamilies.tavlanim tavlanim = new BirdsFamilies.tavlanim();
                    tavlanim.initFamily(familyList);
                    break;
                case "יסעוראים":
                    BirdsFamilies.yasuraim yasuraim = new BirdsFamilies.yasuraim();
                    yasuraim.initFamily(familyList);
                    break;
                case "אווזאים":
                    BirdsFamilies.avazaim avazaim = new BirdsFamilies.avazaim();
                    avazaim.initFamily(familyList);
                    break;


            }




        }
    }

}
