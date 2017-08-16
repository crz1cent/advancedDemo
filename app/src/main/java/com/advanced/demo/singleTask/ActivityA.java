package com.advanced.demo.singleTask;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.advanced.baselib.base.BaseActivity;
import com.advanced.demo.R;

/**
 * @author by sangw on 2017/8/15.
 */

public class ActivityA extends BaseActivity {
    private TextView mStartNextActivity;

    @Override
    protected void initView() {
        super.initView();
        mStartNextActivity = (TextView) findViewById(R.id.btn_start_next);
        mStartNextActivity.setText("Start Page B");
        ((TextView) findViewById(R.id.page_name)).setText("Page A");
    }

    @Override
    protected void initListener() {
        super.initListener();
        mStartNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, ActivityB.class));
            }
        });
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_single_task;
    }

    @Override
    public void finish() {
        super.finish();
        Log.i("SingleTask", "ActivityA finish");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SingleTask", "ActivityA Destroy");
    }
}