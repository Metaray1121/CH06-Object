package tw.tcnr12.m0607;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M0607 extends AppCompatActivity {

    private Intent intent = new Intent();
    private Button b001,b002,b003,b004,b005,b006,b007;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0607);
        setupComponent();
    }

    private void setupComponent() {
        b001 = (Button)findViewById(R.id.m0000_b0500);
        b002 = (Button)findViewById(R.id.m0000_b0501);
        b003 = (Button)findViewById(R.id.m0000_b0502);
        b004 = (Button)findViewById(R.id.m0000_b0503);
        b005 = (Button)findViewById(R.id.m0000_b0504);
        b006 = (Button)findViewById(R.id.m0000_b0604);
        b007 = (Button)findViewById(R.id.m0000_b0606);

        b001.setOnClickListener(b001on);
        b002.setOnClickListener(b001on);
        b003.setOnClickListener(b001on);
        b004.setOnClickListener(b001on);
        b005.setOnClickListener(b001on);
        b006.setOnClickListener(b001on);
        b007.setOnClickListener(b001on);
    }



    private View.OnClickListener b001on = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.m0000_b0500:
                    intent.putExtra("class_title",getString(R.string.m0000_b0500));
                    intent.setClass(M0607.this,M0500.class);
                    break;
                case R.id.m0000_b0501:
                    intent.putExtra("class_title",getString(R.string.m0000_b0501));
                    intent.setClass(M0607.this,M0501.class);
                    break;
                case R.id.m0000_b0502:
                    intent.putExtra("class_title",getString(R.string.m0000_b0502));
                    intent.setClass(M0607.this,M0502.class);
                    break;
                case R.id.m0000_b0503:
                    intent.putExtra("class_title",getString(R.string.m0000_b0504));
                    intent.setClass(M0607.this,M0504.class);
                    break;
                case R.id.m0000_b0504:
                    intent.putExtra("class_title",getString(R.string.m0000_b0505));
                    intent.setClass(M0607.this,M0505.class);
                    break;
                case R.id.m0000_b0604:
                    intent.putExtra("class_title",getString(R.string.m0000_b0604));
                    intent.setClass(M0607.this,M0604.class);
                    break;
                case R.id.m0000_b0606:
                    intent.putExtra("class_title",getString(R.string.m0000_b0606));
                    intent.setClass(M0607.this,M0606.class);
                    break;
            }
            startActivity(intent);
        }

    };
}