/*
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

import demo.example.com.customarrayadapter.BirdsAdapter;
import demo.example.com.customarrayadapter.BirdsFamilies;
import demo.example.com.customarrayadapter.BirdsType;
import demo.example.com.customarrayadapter.FamilyActivity;
import demo.example.com.customarrayadapter.PickerActivity;
import demo.example.com.customarrayadapter.R;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

import demo.example.com.customarrayadapter.BirdsAdapter;
import demo.example.com.customarrayadapter.BirdsFamilies;
import demo.example.com.customarrayadapter.BirdsType;
import demo.example.com.customarrayadapter.FamilyActivity;
import demo.example.com.customarrayadapter.PickerActivity;
import demo.example.com.customarrayadapter.R;

imimport android.support.v4.widget.DrawerLayout;
        port android.view.LayoutInflater;
        i*mport android.support.v4.widget.DrawerLayout;
        /package demo.example.com.customarrayadapter;

*/
/**
 * A fragment containing the list view of Android versions.
 *//*

public class MainActivityFragment extends Fragment {
    static final int PICK_COLOR_REQUEST = 1;  // The request code
    private BirdsAdapter MyBirdsAdapter;
    private ArrayList<BirdsType> birdList= new ArrayList<BirdsType>();
    String color="",area="";
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    //private ArrayList<BirdsType> Birds = new ArrayList<BirdsType>();

    public MainActivityFragment() {
    }
    private void setDataOnAdapter(String color,String area){

       if (color.isEmpty() && area.isEmpty())
       {
           MyBirdsAdapter.notifyDataSetChanged();
           return;
       }
        for (Iterator<BirdsType> iterator =birdList.iterator(); iterator.hasNext();) {
            BirdsType bird = iterator.next();
            if (!bird.color.equals(color) && !color.isEmpty()) {
                // Remove the current element from the iterator and the list.
                iterator.remove();
                continue;
            }
            if (!bird.area.equals(area) && !area.isEmpty()) {
                // Remove the current element from the iterator and the list.
                iterator.remove();
                continue;
            }
        }

        MyBirdsAdapter.notifyDataSetChanged();
    }
    private void initDataInAdapter() {
        birdList.clear();
        BirdsFamilies.Families families = new BirdsFamilies.Families();
        birdList = families.initFamilies();
        */
/*birdList.add(new BirdsType("טריסטמית", "ציפורי שיר", R.drawable.tristams, "tristamit.html",
                new int[]{R.drawable.tristams, R.drawable.tristams1, R.drawable.tristams2}, "שחור", "בקעה"));
        birdList.add(new BirdsType("בולבול", "ציפורי שיר", R.drawable.spectacled_bulbul,
                "bulbul.html",new int[] {R.drawable.spectacled_bulbul,R.drawable.bulbul1,R.drawable.bulbul2,R.drawable.bulbul3,
                R.drawable.bulbul3, R.drawable.bulbul4,R.drawable.bulbul5},"לבן","צפון"));
        birdList.add(new BirdsType("סיקסאק", "חופמאים", R.drawable.spur_winged_lapwing,"siksak.html",
                new int[] {R.drawable.spur_winged_lapwing,R.drawable.siksak,R.drawable.siksak2,R.drawable.siksak3},"שחור","מרכז"));
        birdList.add(new BirdsType("עורבני", "ציפורי שיר\"", R.drawable.orvani, "orvani.html"
                , new int[]{R.drawable.spectacled_bulbul, R.drawable.tristams, R.drawable.tristams}, "כחול", "מרכז"));
        birdList.add(new BirdsType("טריסטמית", "ציפורי שיר", R.drawable.tristams, "tristamit.html",
                new int[]{R.drawable.tristams, R.drawable.tristams, R.drawable.tristams}, "שחור", "south"));
        birdList.add(new BirdsType("בולבול", "ציפורי שיר", R.drawable.spectacled_bulbul,
                "bulbul.html",new int[] {R.drawable.spectacled_bulbul,R.drawable.tristams,R.drawable.tristams},"לבן","north"));
        birdList.add(new BirdsType("סיקסאק", "חופמאים", R.drawable.spur_winged_lapwing,"",
                new int[] {R.drawable.spur_winged_lapwing,R.drawable.tristams,R.drawable.tristams},"שחור",""));
        birdList.add(new BirdsType("עורבני", "ציפורי שיר\"", R.drawable.orvani,"orvani.html"
                ,new int[] {R.drawable.spectacled_bulbul,R.drawable.tristams,R.drawable.tristams},"כחול",""));

        birdList.add(new BirdsType("טריסטמית", "ציפורי שיר", R.drawable.tristams, "tristamit.html",
                new int[]{R.drawable.tristams, R.drawable.tristams, R.drawable.tristams}, "שחור", "south"));
        birdList.add(new BirdsType("בולבול", "ציפורי שיר", R.drawable.spectacled_bulbul,
                "bulbul.html",new int[] {R.drawable.spectacled_bulbul,R.drawable.tristams,R.drawable.tristams},"לבן","north"));
        birdList.add(new BirdsType("סיקסאק", "חופמאים", R.drawable.spur_winged_lapwing,"",
                new int[] {R.drawable.spur_winged_lapwing,R.drawable.tristams,R.drawable.tristams},"שחור",""));
        birdList.add(new BirdsType("עורבני", "ציפורי שיר\"", R.drawable.orvani,"orvani.html"
                ,new int[] {R.drawable.spectacled_bulbul,R.drawable.tristams,R.drawable.tristams},"כחול",""));*//*



    }

    @Override
    public void onCreateOptionsMenu(Menu menu,MenuInflater inflater) {
        // Inflate the menu; this adds items to the action bar if it is present.
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main, menu);

    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if(savedInstanceState == null || !savedInstanceState.containsKey("birds")) {
            initDataInAdapter();
            //birdList = new ArrayList<BirdsType>(Birds);
        }
        else {
            birdList = savedInstanceState.getParcelableArrayList("birds");
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putParcelableArrayList("birds", birdList);
        super.onSaveInstanceState(outState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                               Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mainold, container, false);

        //MyBirdsAdapter = new BirdsAdapter(getActivity(), Arrays.asList(Birds));
        MyBirdsAdapter = new BirdsAdapter(getActivity(), birdList);
        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) rootView.findViewById(R.id.listview_flavor);
        listView.setAdapter(MyBirdsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                BirdsType tempBird = MyBirdsAdapter.getItem(position);
                // Toast.makeText(getActivity(), tempBird.BirdName, Toast.LENGTH_SHORT).show();
                */
/*Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra("name", tempBird.BirdName);
                intent.putExtra("family", tempBird.BirdFamily);
                intent.putExtra("image", tempBird.image);
                intent.putExtra("Description", tempBird.Description);
                intent.putExtra("pics", tempBird.pics);
                startActivity(intent);*//*

                Intent intent = new Intent(getActivity(), FamilyActivity.class);
                intent.putExtra("familyName", tempBird.BirdName);
                startActivity(intent);
            }
        });
        //
        mPlanetTitles = getResources().getStringArray(R.array.planets_array);
        mDrawerLayout = (DrawerLayout) getActivity().findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) getActivity().findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        mDrawerList.setAdapter(new ArrayAdapter<String>(getActivity(),
                R.layout.drawer_list_item, mPlanetTitles));
        // Set the list's click listener
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getActivity(), PickerActivity.class);
                intent.putExtra("Color","");
                intent.putExtra("Area","");
                startActivityForResult(intent, PICK_COLOR_REQUEST);
                mDrawerLayout.closeDrawer(mDrawerList);
            }
        });
        //
        return rootView;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(getActivity(), "Settings menu item pressed", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id==R.id.help)
        {
            //Toast.makeText(getApplicationContext(), "Help menu item pressed", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getActivity(), PickerActivity.class);
            intent.putExtra("Color",color);
            intent.putExtra("Area",area);
            startActivityForResult(intent, PICK_COLOR_REQUEST);
            //startActivity(intent);
            return true;
        }
              return super.onOptionsItemSelected(item);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == PICK_COLOR_REQUEST) {
            // Make sure the request was successful
            // The user chose colors and area.
            String myColor = data.getStringExtra("SelectedColor");
            String myArea = data.getStringExtra("SelectedArea");
            color=myColor;
            area=myArea;
            Toast.makeText(getActivity(), "color : " + " " + color + "area" + area, Toast.LENGTH_LONG).show();

           */
/* birdList.clear();
            MyBirdsAdapter.notifyDataSetChanged();*//*

            initDataInAdapter();
            setDataOnAdapter(color, area);
            //MyBirdsAdapter.notifyDataSetChanged();

        }
    }
}*/
