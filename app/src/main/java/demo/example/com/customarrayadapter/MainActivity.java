package demo.example.com.customarrayadapter;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

public class MainActivity extends ActionBarActivity {
    static final int PICK_COLOR_REQUEST = 1;  // The request code
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(), "Settings menu item pressed", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id==R.id.help)
        {
            //Toast.makeText(getApplicationContext(), "Help menu item pressed", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, PickerActivity.class);
            *//*intent.putExtra("name", tempBird.BirdName);
            intent.putExtra("family",tempBird.BirdFamily);
            intent.putExtra("image", tempBird.image);
            intent.putExtra("Description",tempBird.Description);
            intent.putExtra("pics",tempBird.pics);*//**//*
                *//**//*intent.putExtra("pic1",tempBird.pic1);
                intent.putExtra("pic2",tempBird.pic2);
                intent.putExtra("pic3",tempBird.pic3);*//*
            startActivityForResult(intent, PICK_COLOR_REQUEST);
            //startActivity(intent);
            return true;
        }
       *//* if (id==R.id.help)
        {
            Intent pickContactIntent = new Intent(Intent.ACTION_PICK, Uri.parse("content://contacts"));
            pickContactIntent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE); // Show user only contacts w/ phone numbers
            startActivityForResult(pickContactIntent, PICK_CONTACT_REQUEST);
        }*//*


        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == PICK_COLOR_REQUEST) {
            // Make sure the request was successful
                // The user chose colors and area.
                String color = data.getStringExtra("SelectedColor");
                String area = data.getStringExtra("SelectedArea");
                Toast.makeText(this, "color : " + " " + color + "area" + area, Toast.LENGTH_LONG).show();
        }
    }*/
}
