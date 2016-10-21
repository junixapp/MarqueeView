package com.lxj.marqueeviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lxj.marqueeview.MarqueeView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MarqueeView marqueeView1 = (MarqueeView) findViewById(R.id.marqueeView1);
        final MarqueeView marqueeView2 = (MarqueeView) findViewById(R.id.marqueeView2);

        ArrayList<String> data = new ArrayList<>();
        data.add("窗前明月光！");
        data.add("疑是地上霜！");
        data.add("举头望明月！");
        data.add("低头思故乡！");
        marqueeView1.setMarqueeData(data);


        ArrayList<String> data2 = new ArrayList<>();
        data2.add("两个黄鹂鸣垂柳，");
        data2.add("一行白鹭上青天。");
        data2.add("窗含西岭千秋雪，");
        data2.add("门泊东吴万里船。");
        marqueeView2.setMarqueeData(data2);


        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marqueeView2.toggleMarquee();
            }
        });
    }
}
