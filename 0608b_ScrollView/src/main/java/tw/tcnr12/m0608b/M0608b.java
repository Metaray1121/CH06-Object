package tw.tcnr12.m0608b;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0608b extends AppCompatActivity {
    private Button btn01;
    private TextView txt01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0608b);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        btn01 = (Button) findViewById(R.id.m0608b_btn01);
        txt01 = (TextView) findViewById(R.id.m0608b_txt001);
        // 設定 button 按鍵的事件
        btn01.setOnClickListener(btn01OnClick);


    }
    private Button.OnClickListener btn01OnClick = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
//            String ans01 = getString(R.string.m0503_txt01);
            String ans01 = getString(R.string.m0608b_txt01);
            for (int i = 1; i < 21; i++) {
                String idName = "m0608b_chb" + String.format("%02d", i);
                int resID = getResources().getIdentifier(idName, "id", getPackageName());
                CheckBox btn = ((CheckBox) findViewById(resID));
                if (btn.isChecked()) ans01 += btn.getText().toString();
            }
            txt01.setText(ans01);
        }
    };
}