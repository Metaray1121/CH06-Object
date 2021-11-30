package tw.tcnr12.m0602;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0602 extends AppCompatActivity {


    private ImageView txtComPlay;
    private TextView txtSelect;
    private TextView txtResult;
    private ImageButton btnScissors;
    private ImageButton btnStone;
    private ImageButton btnNet;
    private String user_select, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0602);
        setupViewComponent();
    }

    private void setupViewComponent() {

        txtComPlay = (ImageView) findViewById(R.id.m0602_c001); // 電腦選擇
        txtSelect = (TextView) findViewById(R.id.m0602_s001); // 選擇結果
        txtResult = (TextView) findViewById(R.id.m0602_f000); // 輸贏判斷

        btnScissors = (ImageButton) findViewById(R.id.m0602_b001); // 剪刀
        btnStone = (ImageButton) findViewById(R.id.m0602_b002); // 石頭
        btnNet = (ImageButton) findViewById(R.id.m0602_b003); // 布

        // ---啟動監聽事件----
        btnScissors.setOnClickListener(b001on);
        btnStone.setOnClickListener(b001on);
        btnNet.setOnClickListener(b001on);

    }


    private View.OnClickListener b001on = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int iComPlay = (int) (Math.random() * 3 + 1);
            //----------------------這段到58行是電腦出拳 先打完玩家選擇的再打電腦選擇的,再把電腦選擇的複製到玩家選擇的,
//            switch (iComPlay){
//                case 1:txtComPlay.setText(R.string.m0602_b001); //電腦出剪刀
//
//                    break;
//                case 2:txtComPlay.setText(R.string.m0602_b002);//電腦出石頭
//
//                    break;
//                case 3:txtComPlay.setText(R.string.m0602_b003);//電腦出布
//
//                    break;
//            }
            // 1 - scissors, 2 - stone, 3 - net.
//------------------------玩家選擇的
            switch (v.getId()) {
                case R.id.m0602_b001: //玩家選擇剪刀
                    user_select = getString(R.string.m0602_s001) + " " + getString(R.string.m0602_b001);
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors); //電腦出剪刀,case 1是 int iComPlay = (int)(Math.random() * 3 + 1);的第一種
                            answer = getString(R.string.m0602_f000) + " " + getString(R.string.m0602_f003); //判斷結果
                            txtResult.setTextColor(Color.YELLOW); //更改字體顏色
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);//電腦出石頭
                            answer = getString(R.string.m0602_f000) + " " + getString(R.string.m0602_f002);//判斷結果
                            txtResult.setTextColor(Color.RED);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);//電腦出布
                            answer = getString(R.string.m0602_f000) + " " + getString(R.string.m0602_f001);//判斷結果
                            txtResult.setTextColor(Color.GREEN);
                            break;
                    }
                    break;
                case R.id.m0602_b002: //玩家選擇石頭
                    user_select = getString(R.string.m0602_s001) + " " + getString(R.string.m0602_b002);
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);  //電腦出剪刀
                            answer = getString(R.string.m0602_f000) + " " + getString(R.string.m0602_f001);//判斷結果
                            txtResult.setTextColor(Color.GREEN);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);//電腦出石頭
                            answer = getString(R.string.m0602_f000) + " " + getString(R.string.m0602_f003);//判斷結果
                            txtResult.setTextColor(Color.YELLOW);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);//電腦出布
                            answer = getString(R.string.m0602_f000) + " " + getString(R.string.m0602_f002);//判斷結果
                            txtResult.setTextColor(Color.RED);
                            break;
                    }
                    break;
                case R.id.m0602_b003: //玩家選擇布
                    user_select = getString(R.string.m0602_s001) + " " + getString(R.string.m0602_b003);
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);  //電腦出剪刀
                            answer = getString(R.string.m0602_f000) + " " + getString(R.string.m0602_f002);//判斷結果
                            txtResult.setTextColor(Color.RED);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);//電腦出石頭
                            answer = getString(R.string.m0602_f000) + " " + getString(R.string.m0602_f001);//判斷結果
                            txtResult.setTextColor(Color.GREEN);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);//電腦出布
                            answer = getString(R.string.m0602_f000) + " " + getString(R.string.m0602_f003);//判斷結果
                            txtResult.setTextColor(Color.YELLOW);
                            break;
                    }
                    break;
            }
            //-----------------------------結果---------------
            txtSelect.setText(user_select);   //你選擇的+輸出
            txtResult.setText(answer);  //判斷輸贏+結果
        }
    };
}
