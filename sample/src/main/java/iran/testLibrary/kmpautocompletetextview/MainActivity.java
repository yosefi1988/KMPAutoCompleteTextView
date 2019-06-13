package iran.testLibrary.kmpautocompletetextview;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ir.sajjadYosefi.objectKmpautotextview.ItemData;
import ir.sajjadYosefi.objectKmpautotextview.ObjectKMPAutoComplTextView;

public class MainActivity extends Activity {


    //val
    private static final String TAG = "sssssssssssssss";
    private int RC_SIGN_IN = 1000;
    String wantPermission = Manifest.permission.READ_PHONE_STATE;
    private static final int PERMISSION_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        activity = this;
        complTextView = (ObjectKMPAutoComplTextView) findViewById(R.id.tvAutoCompl);
        complTextView.setOnPopupItemClickListener(new ObjectKMPAutoComplTextView.OnPopupItemClickListener() {
            @Override
            public void onPopupItemClick(CharSequence charSequence) {
                Toast.makeText(getBaseContext(), charSequence.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        ArrayList<ItemData> list = new ArrayList<>();


        for (int i = 0 ; i < 100 ; i ++ ) {
//            data.add(i + " - " +" سجاد یوسفی " + i+" ");
            ItemData sss = new ItemData(i + " سجاد یوسفی ", i + "image", i + "");
            list.add(sss);
        }

        complTextView.setDatas(list);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent returnIntent = new Intent();
        setResult(Activity.RESULT_CANCELED, returnIntent);
        finish();
    }




    List<String> data = new ArrayList<String>();
    ObjectKMPAutoComplTextView complTextView;

    Activity activity ;
    String LastFileSelected = null;
    //ImageView imageViewAvatar,imageViewMedal;

}
