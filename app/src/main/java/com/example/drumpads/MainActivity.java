package com.example.drumpads;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;

//import android.media.AudioManager;
import android.media.SoundPool;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    View p1, p2, p3, p4, p5, p6, p7, p8, p9;
    private MediaPlayer mp1,mp2, mp3, mp4, mp5, mp6, mp7, mp8, mp9;

    private SoundPool sp;
    private MediaPlayer mp;
//    private int sound1;
//    private int sound2;
//    private int sound3;
//    private int sound4;
//
//    private int sound6;
//    private int sound7;
//    private int sound8;
//    private int sound9;
//    private int sound00;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);
        p5 = findViewById(R.id.p5);
        p6 = findViewById(R.id.p6);
        p7 = findViewById(R.id.p7);
        p8 = findViewById(R.id.p8);
        p9 = findViewById(R.id.p9);

        mp1 = MediaPlayer.create(this, R.raw.loop1);
        mp2 = MediaPlayer.create(this, R.raw.loop2);
        mp3 = MediaPlayer.create(this, R.raw.w10);
        mp4 = MediaPlayer.create(this, R.raw.hhc);
        mp5 = MediaPlayer.create(this, R.raw.kk);
        mp6 = MediaPlayer.create(this, R.raw.rb);
        mp7 = MediaPlayer.create(this, R.raw.sn);
        mp8 = MediaPlayer.create(this, R.raw.w8);
        mp9 = MediaPlayer.create(this, R.raw.w9);

        p1.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp1.start();
                p1.setBackgroundColor(getColor(R.color.blueendcolor));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        p1.setBackgroundColor(getColor(R.color.bluestartcolor));
                    }
                }.start();
                return false;
            }
        });
        p2.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp2.start();
                p2.setBackgroundColor(getColor(R.color.blueendcolor));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        p1.setBackgroundColor(getColor(R.color.bluestartcolor));
                    }
                }.start();
                return false;
            }
        });
        p3.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp3.start();
                p3.setBackgroundColor(getColor(R.color.blueendcolor));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        p1.setBackgroundColor(getColor(R.color.bluestartcolor));
                    }
                }.start();
                return false;
            }
        });
        p4.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp4.start();
                p4.setBackgroundColor(getColor(R.color.purpleendcolor));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        p1.setBackgroundColor(getColor(R.color.purpleestartcolor));
                    }
                }.start();
                return false;
            }
        });
        p5.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp5.start();
                p5.setBackgroundColor(getColor(R.color.orangeendcolor));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        p1.setBackgroundColor(getColor(R.color.orangestartcolor));
                    }
                }.start();
                return false;
            }
        });
        p6.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp6.start();
                p6.setBackgroundColor(getColor(R.color.pinkendcolor));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        p1.setBackgroundColor(getColor(R.color.pinkestartcolor));
                    }
                }.start();
                return false;
            }
        });
        p7.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp7.start();
                p7.setBackgroundColor(getColor(R.color.pinkendcolor));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        p1.setBackgroundColor(getColor(R.color.pinkestartcolor));
                    }
                }.start();
                return false;
            }
        });
        p8.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp8.start();
                p8.setBackgroundColor(getColor(R.color.greenndcolor));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        p1.setBackgroundColor(getColor(R.color.greenstartcolor));
                    }
                }.start();
                return false;
            }
        });
        p9.setOnTouchListener(new View.OnTouchListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mp9.start();
                p9.setBackgroundColor(getColor(R.color.pinkendcolor));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }

                    @SuppressLint("NewApi")
                    @Override
                    public void onFinish() {
                        p1.setBackgroundColor(getColor(R.color.pinkestartcolor));
                    }
                }.start();
                return false;
            }
        });


    }

}


//    public void playsound1 (View v) {
//        sp.play(sound1,1.0f,1.0f,0,0,100f);
//    }
//    public void playsound2 (View v) {
//        sp.play(sound2,1.0f,1.0f,0,0,100f);
//
//    }
//    public void playsound3 (View v) {
//        sp.play(sound3,1.0f,1.0f,0,0,10f);
//
//    }
//    public void playsound4 (View v) {
//        sp.play(sound4,1.0f,1.0f,0,0,10f);
//
//    }
//    public void playsound5 (View v) {
//        sp.play(sound5,1.0f,1.0f,0,0,10f);
//
//    }
//    public void playsound6 (View v) {
//        sp.play(sound6,1.0f,1.0f,0,0,10f);
//
//    }
//    public void playsound7 (View v) {
//        sp.play(sound7,1.0f,1.0f,0,0,10f);
//
//    }
//    public void playsound8 (View v) {
//        sp.play(sound8,1.0f,1.0f,0,0,10f);
//
//    }
//    public void playsound9 (View v) {
//        sp.play(sound9,1.0f,1.0f,0,0,10f);
//
//    }
//}


//w7.setOnClickListener(new View.OnClickListener(){
//@Override
//public void onClick(View view){
//        mp = MediaPlayer.create(MainActivity.this, R.raw.w7);
//        MyMedia();
//        }
//        });
//
//        }
//
//private void MyMedia(){
//        mp.start();
//
//        }