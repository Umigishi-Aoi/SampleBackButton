package com.zerokaraapp.samplebackbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //レイアウトからボタンを取得
        Button button = findViewById(R.id.button);
        //ボタンリスナをセット (引数の中でリスナオブジェクトを取得)
        button.setOnClickListener(new ButtonClickListener());
    }

   //ボタンリスナクラス
    private class ButtonClickListener implements View

            .OnClickListener{
       //クリックしたときの動作を提示
        @Override
        public void onClick(View view){
            //MainActivityからMainActivity2への移動用インテントを用意
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            //MainActivityからMainActivity2への移動を開始
            startActivity(intent);
        }
    }
}