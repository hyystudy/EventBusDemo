package com.abclauncher.eventbusdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by sks on 2017/4/6.
 */

public class SecondActivity extends AppCompatActivity {

    @OnClick(R.id.finish_activity)
    public void onFinishBtnClicked(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                EventBus.getDefault().post(new MsgEvent(5, 6));
            }
        }).start();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.inject(this);
    }
}
