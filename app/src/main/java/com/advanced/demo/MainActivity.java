package com.advanced.demo;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.advanced.baselib.base.BaseActivity;
import com.advanced.demo.emoji.EmojiActivity;
import com.advanced.demo.mainPage.MainAdapter;
import com.advanced.demo.propertyAnimator.PropertyAnimatorActivity;
import com.advanced.demo.singleTask.ActivityD;

public class MainActivity extends BaseActivity {

    private MainAdapter mAdapter;


    @Override
    protected void initPages() {
        super.initPages();
        mAdapter.addData(EmojiActivity.class, "Emoji");
        mAdapter.addData(ActivityD.class, "Start Page D");
        mAdapter.addData(PropertyAnimatorActivity.class, "PropertyValueAnimator");
    }

    @Override
    protected void initView() {
        super.initView();
        RecyclerView mainRecyclerView = (RecyclerView) findViewById(R.id.main_recycler_view);

        mAdapter = new MainAdapter(mContext);
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false);
        mainRecyclerView.setAdapter(mAdapter);
        mainRecyclerView.setLayoutManager(layoutManager);
        mainRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }
}