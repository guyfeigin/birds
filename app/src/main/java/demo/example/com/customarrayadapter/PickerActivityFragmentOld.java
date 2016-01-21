package demo.example.com.customarrayadapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.larswerkman.lobsterpicker.LobsterPicker;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class PickerActivityFragmentOld extends Fragment implements AdapterView.OnItemSelectedListener {

    LobsterPicker lobsterPicker;
    boolean userSelect = false;
    boolean loaded = false;
    View rootView;
    //private SharedPreferences mPrefs;

    public PickerActivityFragmentOld() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_picker, container, false);
// Spinner element
        addSpinnerColors();
        addSpinnerAreas();
        if(savedInstanceState == null || !savedInstanceState.containsKey("spinnerColor")) {

        }
        else {
            //Spinner spinner = (Spinner) rootView.findViewById(R.id.spinnerColor);
            //spinner.setSelection(3);
        }
        Spinner spinner =(Spinner) rootView.findViewById(R.id.spinnerColor);;
        spinner.setSelection(3);
        return rootView;
    }
    private void addSpinnerColors(){
        Spinner spinner = (Spinner) rootView.findViewById(R.id.spinnerColor);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("הכל");
        categories.add("שחור");
        categories.add("לבן");
        categories.add("אדום");
        categories.add("צהוב");
        categories.add("ירוק");
        categories.add("כחול");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

    }
    private void addSpinnerAreas(){
        Spinner spinner = (Spinner) rootView.findViewById(R.id.spinnerAreas);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.areas, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        if (loaded) {
            String item = parent.getItemAtPosition(position).toString();

            // Showing selected spinner item
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

            Intent returnIntent = new Intent();
            returnIntent.putExtra("SelectedColor", item);
            getActivity().setResult(getActivity().RESULT_OK, returnIntent);
           // getActivity().finish();


        }
        loaded=true;
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
    public void testAddtoGit(){
        int i = i++;
    }
}
