
package y2019.aoc.yara.yaraaoc2019;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int CAMERA_REQUEST = 0;
    private static final int SELECT_IMAGE = 1;
    ImageView imageView;
    Button buttonCamera , buttonGallery , buttonDone ;
    Bitmap bitmap ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        buttonCamera = findViewById(R.id.buttonCamera);
        buttonCamera.setOnClickListener(this);
        buttonGallery = findViewById(R.id.buttonGallery);
        buttonGallery.setOnClickListener(this);
        imageView = findViewById(R.id.imageView);
        buttonDone = findViewById(R.id.buttonDone);
        buttonDone.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        if(view == buttonCamera ){

            Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i , CAMERA_REQUEST);
        }
        if(view == buttonGallery){
            Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(i, SELECT_IMAGE);
        }
        if(view == buttonDone){
            Intent i = new Intent(this , WelcomeActivity.class);
            startActivity(i);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if ((requestCode == CAMERA_REQUEST) && (resultCode == Activity.RESULT_OK)) {
            bitmap = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }
        else {
            Toast.makeText(this,"Capturing a photo has faild" , Toast.LENGTH_LONG);
        }
        if ((requestCode == SELECT_IMAGE) && (resultCode == SettingsActivity.RESULT_OK)) {

            Uri targetUri = data.getData();
            try{
                bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(targetUri));
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }
        else {
            Toast.makeText(this, "Capturing a photo has faild" , Toast.LENGTH_LONG);
        }
    }
}
