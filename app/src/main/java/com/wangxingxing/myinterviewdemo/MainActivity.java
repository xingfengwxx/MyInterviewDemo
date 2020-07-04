package com.wangxingxing.myinterviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        Button btnStartIntentService = findViewById(R.id.btn_start_intent_service);
        btnStartIntentService.setOnClickListener(this);

        Button btnScrollViewWithListView = findViewById(R.id.btn_scrollview_with_listview);
        btnScrollViewWithListView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start_intent_service:
                // IntentService
                Intent intent = new Intent(this, MyIntentService.class);
                intent.putExtra("start", "MyIntentService");
                startService(intent);
                break;

            case R.id.btn_scrollview_with_listview:
                // ScrollView嵌套ListView,解决滑动冲突问题
                Intent intent1 = new Intent(this, ScrollViewNestListViewActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
