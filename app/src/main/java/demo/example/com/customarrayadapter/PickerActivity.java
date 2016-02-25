package demo.example.com.customarrayadapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PickerActivity extends AppCompatActivity {
    Spinner spinnerArea;
    Spinner spinnerColor;
    String area="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_picker);
        /*
        spinnerArea = (Spinner) findViewById(R.id.spinnerAreas);
        spinnerColor = (Spinner) findViewById(R.id.spinnerColor);
        addSpinnerColors();
        addSpinnerAreas();*/
        Intent intent = getIntent();
/*
        String color = intent.getStringExtra("Color");
        String area = intent.getStringExtra("Area");
        spinnerColor.setSelection(((ArrayAdapter)spinnerColor.getAdapter()).getPosition(color));
        spinnerArea.setSelection(((ArrayAdapter)spinnerArea.getAdapter()).getPosition(area));
        /*SharedPreferences mPrefs = getSharedPreferences("color",0);
        color = mPrefs.getString("color", "");*/



    }
    private void addSpinnerColors(){
       // Spinner spinner = (Spinner) findViewById(R.id.spinnerColor);

        // Spinner click listener
       // spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("");
        categories.add("שחור");
        categories.add("לבן");
        categories.add("אדום");
        categories.add("צהוב");
        categories.add("ירוק");
        categories.add("כחול");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerColor.setAdapter(dataAdapter);

    }
    private void addSpinnerAreas(){
        //Spinner spinner = (Spinner) findViewById(R.id.spinnerAreas);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.areas, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinnerArea.setAdapter(adapter);
    }
    /*@Override
    public void onPause() {
        super.onPause();
       *//* SharedPreferences mPrefs = getSharedPreferences("color",0);
        SharedPreferences.Editor ed = mPrefs.edit();
        ed.putString("color", "yellow");
        ed.commit();*//*
        String color = spinnerColor.getSelectedItem().toString();
        String area = spinnerArea.getSelectedItem().toString();
        Intent returnIntent = new Intent();
        returnIntent.putExtra("SelectedColor", color);
        returnIntent.putExtra("SelectedArea", area);
        setResult(this.RESULT_OK, returnIntent);
    }*/
    @Override
    public void finish() {
        // Prepare data intent
        /*String color = spinnerColor.getSelectedItem().toString();
        String area = spinnerArea.getSelectedItem().toString();*/
        Intent returnIntent = new Intent();
        returnIntent.putExtra("ColorBlack", ((CheckBox)findViewById(R.id.checkBoxBlack)).isChecked());
        returnIntent.putExtra("ColorBrown", ((CheckBox)findViewById(R.id.checkBoxBrown)).isChecked());
        returnIntent.putExtra("ColorWhite", ((CheckBox)findViewById(R.id.checkBoxWhite)).isChecked());
        returnIntent.putExtra("ColorRed", ((CheckBox)findViewById(R.id.checkBoxRed)).isChecked());
        returnIntent.putExtra("ColorYellow", ((CheckBox)findViewById(R.id.checkBoxYellow)).isChecked());
        returnIntent.putExtra("ColorGreen", ((CheckBox)findViewById(R.id.checkBoxGreen)).isChecked());
        returnIntent.putExtra("ColorBlue", ((CheckBox)findViewById(R.id.checkBoxBlue)).isChecked());

        //returnIntent.putExtra("SelectedColor", color);
        returnIntent.putExtra("SelectedArea", area);
        setResult(RESULT_OK, returnIntent);
        super.finish();
    }


}
