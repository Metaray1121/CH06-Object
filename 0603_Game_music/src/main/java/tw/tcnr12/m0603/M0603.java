package tw.tcnr12.m0603;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0603 extends AppCompatActivity {


    private ImageView txtComPlay;
    private TextView txtSelect;
    private TextView txtResult;
    private ImageButton btnScissors;
    private ImageButton btnStone;
    private ImageButton btnNet;
    private String user_select, answer;
    private MediaPlayer startmusic,mediaWin,mediaLose,mediaDraw,Endmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0603);
        setupViewComponent();
    }

    private void setupViewComponent() {

//        // --開啟片頭音樂-----
//        startmusic = MediaPlayer.create(getApplication(), R.raw.guess);
//        startmusic.start();
        startmusic = MediaPlayer.create(getApplication(),R.raw.guess);
        startmusic.start();

        mediaWin = MediaPlayer.create(getApplication(),R.raw.vctory);
        mediaLose = MediaPlayer.create(getApplication(),R.raw.lose);
        mediaDraw = MediaPlayer.create(getApplication(),R.raw.haha);
        Endmusic = MediaPlayer.create(getApplication(),R.raw.yt1s);

        txtComPlay = (ImageView) findViewById(R.id.m0603_c001); // 電腦選擇
        txtSelect = (TextView) findViewById(R.id.m0603_s001); // 選擇結果
        txtResult = (TextView) findViewById(R.id.m0603_f000); // 輸贏判斷

        btnScissors = (ImageButton) findViewById(R.id.m0603_b001); // 剪刀
        btnStone = (ImageButton) findViewById(R.id.m0603_b002); // 石頭
        btnNet = (ImageButton) findViewById(R.id.m0603_b003); // 布

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
//                case 1:txtComPlay.setText(R.string.m0603_b001); //電腦出剪刀
//
//                    break;
//                case 2:txtComPlay.setText(R.string.m0603_b002);//電腦出石頭
//
//                    break;
//                case 3:txtComPlay.setText(R.string.m0603_b003);//電腦出布
//
//                    break;
//            }
            // 1 - scissors, 2 - stone, 3 - net.
//------------------------玩家選擇的
            switch (v.getId()) {
                case R.id.m0603_b001: //玩家選擇剪刀
                    user_select = getString(R.string.m0603_s001) + " " + getString(R.string.m0603_b001);
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors); //電腦出剪刀,case 1是 int iComPlay = (int)(Math.random() * 3 + 1);的第一種
//                            answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f003); //判斷結果
//                            txtResult.setTextColor(Color.YELLOW); //更改字體顏色
                            music ( 2 );
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);//電腦出石頭
//                            answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f002);//判斷結果
//                            txtResult.setTextColor(Color.RED);
                            music ( 3 );
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);//電腦出布
//                            answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f001);//判斷結果
//                            txtResult.setTextColor(Color.GREEN);
                            music ( 1 );
                            break;
                    }
                    break;
                case R.id.m0603_b002: //玩家選擇石頭
                    user_select = getString(R.string.m0603_s001) + " " + getString(R.string.m0603_b002);
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);  //電腦出剪刀
//                            answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f001);//判斷結果
//                            txtResult.setTextColor(Color.GREEN);
                            music ( 1 );
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);//電腦出石頭
//                            answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f003);//判斷結果
//                            txtResult.setTextColor(Color.YELLOW);
                            music ( 2 );
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);//電腦出布
//                            answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f002);//判斷結果
//                            txtResult.setTextColor(Color.RED);
                            music ( 3 );
                            break;
                    }
                    break;
                case R.id.m0603_b003: //玩家選擇布
                    user_select = getString(R.string.m0603_s001) + " " + getString(R.string.m0603_b003);
                    switch (iComPlay) {
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);  //電腦出剪刀
//                            answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f002);//判斷結果
//                            txtResult.setTextColor(Color.RED);
                            music ( 3 );
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);//電腦出石頭
//                            answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f001);//判斷結果
//                            txtResult.setTextColor(Color.GREEN);
                            music ( 1 );
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);//電腦出布
//                            answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f003);//判斷結果
//                            txtResult.setTextColor(Color.YELLOW);
                            music ( 2 );
                            break;
                    }
                    break;
            }
            //-----------------------------結果---------------
            txtSelect.setText(user_select);   //你選擇的+輸出
            txtResult.setText(answer);  //判斷輸贏+結果
        }
    };

    private void music(int i) {
        if(startmusic.isPlaying()) startmusic.stop();
        if(mediaWin.isPlaying()) mediaWin.pause();
        if(mediaDraw.isPlaying()) mediaDraw.pause();
        if(mediaLose.isPlaying()) mediaLose.pause();

        switch (i){
            case 1: //贏
                answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f001);//判斷結果
                txtResult.setTextColor(Color.GREEN);
                mediaWin.start();
                break;
            case 2: //平手
                answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f003); //判斷結果
                txtResult.setTextColor(Color.YELLOW); //更改字體顏色
                mediaDraw.start();
                break;
            case 3: //輸
                answer = getString(R.string.m0603_f000) + " " + getString(R.string.m0603_f002);//判斷結果
                txtResult.setTextColor(Color.RED);
                mediaLose.start();
                break;
            case 4:
                Endmusic.start();
                break;
        }
    }
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        music(4);
        this.finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        music(4);
    }
}
