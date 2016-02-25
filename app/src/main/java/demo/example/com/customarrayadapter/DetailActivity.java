package demo.example.com.customarrayadapter;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
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

public class DetailActivity extends AppCompatActivity {
    private int[] images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
        Intent intent = this.getIntent();
        if (intent != null && intent.hasExtra("name")) {
            String birdNameStr = intent.getStringExtra("name");
            ((TextView) findViewById(R.id.Bird_name))
                    .setText(birdNameStr);
            String birdfNameStr = intent.getStringExtra("family");
            ((TextView) findViewById(R.id.Bird_fName))
                    .setText(birdfNameStr);
                      /* int birdImage = intent.getIntExtra("image", 0);
                       ((ImageView) rootView.findViewById(R.id.Bird_Image))
                               .setImageResource(birdImage);*/
            String birdDescriptionStr = intent.getStringExtra("Description");
            ((TextView) findViewById(R.id.Bird_Description))
                    .setText(birdDescriptionStr);

            WebView htmlWebView = (WebView) findViewById(R.id.webView);
            WebSettings webSetting = htmlWebView.getSettings();
            String htmlFilename = birdDescriptionStr;
            AssetManager mgr = getAssets();
            int imagesCount = intent.getIntArrayExtra("pics").length;
            images = new int[imagesCount];
            images = intent.getIntArrayExtra("pics");
                       /*images[0]=intent.getIntExtra("pic1", 0);
                       images[1]=intent.getIntExtra("pic2", 0);
                       images[2]=intent.getIntExtra("pic3", 0);*/
            addImagesToThegallery();
            try {
                InputStream in = mgr.open(htmlFilename, AssetManager.ACCESS_BUFFER);
                String htmlContentInStringFormat = StreamToString(in);
                in.close();
                htmlWebView.loadDataWithBaseURL(null, htmlContentInStringFormat, "text/html", "utf-8", null);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void addImagesToThegallery() {
        LinearLayout imageGallery = (LinearLayout) findViewById(R.id.imageGallery);

        for (Integer image : images) {
            imageGallery.addView(getImageView(image));
        }
    }
    private View getImageView(Integer image) {
        ImageView imageView = new ImageView(this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins(5, 10, 5, 10);
        int width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 300, getResources().getDisplayMetrics());
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


