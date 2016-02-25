package demo.example.com.customarrayadapter;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    static final int PICK_COLOR_REQUEST = 1;  // The request code
    static final int SHOW_BIRDS_LIST = 2;
    private  BirdsAdapter MyBirdsAdapter;
    private ArrayList<BirdsType> birdList= new ArrayList<BirdsType>();
    String color="",area="";
    boolean colorBlack=false;
    boolean colorBrown=false;
    boolean colorWhite=false;
    boolean colorRed=false;
    boolean colorYellow=false;
    boolean colorGreen=false;
    boolean colorBlue=false;
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    private ActionBarDrawerToggle mDrawerToggle;
    private String mActivityTitle;

    boolean familiesSwitch;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    private ArrayAdapter<String> mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if(savedInstanceState == null || !savedInstanceState.containsKey("birds")) {
            initDataWithFamilies();
            //birdList = new ArrayList<BirdsType>(Birds);
        }
        else {
            birdList = savedInstanceState.getParcelableArrayList("birds");
        }
        //
        addBirdList();
        //
        mDrawerList = (ListView)findViewById(R.id.left_drawer);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();

        addDrawerItems();
        setupDrawer();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
       /* mPlanetTitles = getResources().getStringArray(R.array.planets_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();
        mDrawerList = (ListView)findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mPlanetTitles));
        // Set the list's click listener
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 2) {
                    Intent intent = new Intent(getApplication(), PickerActivity.class);
                    intent.putExtra("Color", color);
                    intent.putExtra("Area", area);
                    startActivityForResult(intent, PICK_COLOR_REQUEST);
                    mDrawerLayout.closeDrawer(mDrawerList);
                }
                else {
                    Toast.makeText(getApplicationContext(),"עדיין לא ממומש",Toast.LENGTH_LONG).show();
                }
            }
        });*/
    }
    private void addBirdList(){
        MyBirdsAdapter = new BirdsAdapter(this, birdList);
        // Get a reference to the ListView, and attach this adapter to it.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(MyBirdsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (familiesSwitch) {
                    BirdsType tempBird = MyBirdsAdapter.getItem(position);
                    Intent intent = new Intent(getApplication(), FamilyActivity.class);
                    intent.putExtra("familyName", tempBird.BirdName);
                    startActivity(intent);
                }
                else{
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
            }
        });
    }
    private void addDrawerItems() {
        mPlanetTitles = getResources().getStringArray(R.array.planets_array);
       // String[] osArray = { "Android", "iOS", "Windows", "OS X", "Linux" };
        mAdapter = new ArrayAdapter<String>(this, R.layout.drawer_list_item, mPlanetTitles);
        mDrawerList.setAdapter(mAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 2) {
                    Intent intent = new Intent(getApplication(), PickerActivity.class);
                    intent.putExtra("ColorBlack", colorBlack);
                    intent.putExtra("ColorBrown", colorBrown);
                    intent.putExtra("ColorWhite", colorWhite);
                    intent.putExtra("ColorRed", colorRed);
                    intent.putExtra("ColorYellow", colorYellow);
                    intent.putExtra("ColorGreen", colorGreen);
                    intent.putExtra("ColorBlue", colorBlue);
                    intent.putExtra("Area", area);
                    startActivityForResult(intent, PICK_COLOR_REQUEST);
                    mDrawerLayout.closeDrawer(mDrawerList);
                }
                else {
                    Toast.makeText(getApplicationContext(),"עדיין לא ממומש",Toast.LENGTH_LONG).show();
                }
               // Toast.makeText(MainActivity.this, "Time for an upgrade!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void setupDrawer() {
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close) {

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle("ציפורים");
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(mActivityTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        // Activate the navigation drawer toggle
        if (mDrawerToggle.onOptionsItemSelected(item)) {
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
            //String myColor = data.getStringExtra("SelectedColor");
            //String myArea = data.getStringExtra("SelectedArea");
            //color=myColor;
            //area=myArea;
            colorBlack=data.getBooleanExtra("ColorBlack",false);
            colorBrown=data.getBooleanExtra("ColorBrown",false);
            colorWhite=data.getBooleanExtra("ColorWhite",false);
            colorRed=data.getBooleanExtra("ColorRed",false);
            colorYellow=data.getBooleanExtra("ColorYellow",false);
            colorGreen=data.getBooleanExtra("ColorGreen",false);
            colorBlue=data.getBooleanExtra("ColorBlue",false);
           // Toast.makeText(this, "color : " + " " + color + "area" + area, Toast.LENGTH_LONG).show();

          /*  initDataWithBirds();
            setDataOnAdapter(color, area);*/

            Intent intent = new Intent(getApplication(), ListActivity.class);
            intent.putExtra("ColorBlack", colorBlack);
            intent.putExtra("ColorBrown", colorBrown);
            intent.putExtra("ColorWhite", colorWhite);
            intent.putExtra("ColorRed", colorRed);
            intent.putExtra("ColorYellow", colorYellow);
            intent.putExtra("ColorGreen", colorGreen);
            intent.putExtra("ColorBlue", colorBlue);
            intent.putExtra("Area", area);
            startActivityForResult(intent, SHOW_BIRDS_LIST);


        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putParcelableArrayList("birds", birdList);
        super.onSaveInstanceState(outState);
    }

    private void setDataOnAdapter(String color,String area){

        if (color.isEmpty() && area.isEmpty())
        {
            MyBirdsAdapter.notifyDataSetChanged();
            return;
        }
        for (Iterator<BirdsType> iterator =birdList.iterator(); iterator.hasNext();) {
            BirdsType bird = iterator.next();
            if (!bird.colors.toString().contains(color) && !color.isEmpty()) {
                // Remove the current element from the iterator and the list.
                iterator.remove();
                continue;
            }
            if (!bird.areas.toString().contains(area) && !area.isEmpty()) {
                // Remove the current element from the iterator and the list.
                iterator.remove();
                continue;
            }
        }

        MyBirdsAdapter.notifyDataSetChanged();
    }
    private void initDataWithFamilies() {
        birdList.clear();
        BirdsFamilies.Families families = new BirdsFamilies.Families();
        families.initFamilies(birdList);
        familiesSwitch=true;
    }
    private void initDataWithBirds() {
        birdList.clear();
        BirdsFamilies.tarnegolaim tarnegolaim = new BirdsFamilies.tarnegolaim();
        tarnegolaim.initFamily(birdList);
        BirdsFamilies.zolelanim zolelanim = new BirdsFamilies.zolelanim();
        zolelanim.initFamily(birdList);
        familiesSwitch=false;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
