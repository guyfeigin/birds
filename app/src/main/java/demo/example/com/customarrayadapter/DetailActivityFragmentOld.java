package demo.example.com.customarrayadapter;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragmentOld extends Fragment {

    private int[] images; // = new Integer[3]; // = {R.drawable.baz, R.drawable.spectacled_bulbul, R.drawable.orvani};

    public DetailActivityFragmentOld() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detailold, container, false);
        // The detail Activity called via intent.  Inspect the intent for forecast data.
                   Intent intent = getActivity().getIntent();
                   if (intent != null && intent.hasExtra("name")) {
                            String birdNameStr = intent.getStringExtra("name");
                            ((TextView) rootView.findViewById(R.id.Bird_name))
                                           .setText(birdNameStr);
                       String birdfNameStr = intent.getStringExtra("family");
                       ((TextView) rootView.findViewById(R.id.Bird_fName))
                               .setText(birdfNameStr);
                      /* int birdImage = intent.getIntExtra("image", 0);
                       ((ImageView) rootView.findViewById(R.id.Bird_Image))
                               .setImageResource(birdImage);*/
                       String birdDescriptionStr = intent.getStringExtra("Description");
                       ((TextView) rootView.findViewById(R.id.Bird_Description))
                               .setText(birdDescriptionStr);

                       WebView htmlWebView = (WebView)rootView.findViewById(R.id.webView);
                       WebSettings webSetting = htmlWebView.getSettings();
                       String htmlFilename = birdDescriptionStr;
                       AssetManager mgr = getActivity().getAssets();
                       int imagesCount = intent.getIntArrayExtra("pics").length;
                       images = new int[imagesCount];
                       images =  intent.getIntArrayExtra("pics");
                       /*images[0]=intent.getIntExtra("pic1", 0);
                       images[1]=intent.getIntExtra("pic2", 0);
                       images[2]=intent.getIntExtra("pic3", 0);*/
                       addImagesToThegallery(rootView);
                       try {
                           InputStream in = mgr.open(htmlFilename, AssetManager.ACCESS_BUFFER);
                           String htmlContentInStringFormat = StreamToString(in);
                           in.close();
                           htmlWebView.loadDataWithBaseURL(null, htmlContentInStringFormat, "text/html", "utf-8", null);

                       } catch (IOException e) {
                           e.printStackTrace();
                       }
                        }

        return rootView;
    }
    private void addImagesToThegallery(View rootView) {
        LinearLayout imageGallery = (LinearLayout) rootView.findViewById(R.id.imageGallery);

        for (Integer image : images) {
            imageGallery.addView(getImageView(image));
        }
    }
    private View getImageView(Integer image) {
        ImageView imageView = new ImageView(getActivity());
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins(5, 10, 5, 10);
        int width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 300, getResources().getDisplayMetrics());
        imageView.setLayoutParams(lp);
        imageView.setImageResource(image);
        imageView.getLayoutParams().width = width;
        imageView.getLayoutParams().height = width;
        return imageView;
    }
    public static String StreamToString(InputStream in) throws IOException {
        if(in == null) {
            return "";
        }
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        } finally {
        }
        return writer.toString();
    }
}
