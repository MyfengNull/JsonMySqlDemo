package com.ysr.jsonmysqldemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ysr.jsonmysqldemo.utils.XcxjResult;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.btnJexi)
    Button btnJexi;
    private TextView tv;
    private Context context;
    private LinearLayout linearLayoutdevices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        tv = (TextView) findViewById(R.id.tvShow);
        linearLayoutdevices = (LinearLayout) findViewById(R.id.lineLayoutdevices);
        context = this;
    }

    @OnClick(R.id.btnJexi)
    public void onClick() {
        /**
         * json方式
         */
        JSONObject obj = JSONObject.parseObject(XcxjResult.result);
        JSONObject obj2 = obj.getJSONObject("body");
        JSONArray obj3 = obj2.getJSONArray("deviceTask");
        for (int i = 0; i < obj3.size(); i++) {
            JSONObject obj4 = obj3.getJSONObject(i);
            String tasknum = obj4.getString("tasknum");
            TextView textView = new TextView(context);
            textView.setText(tasknum);
            linearLayoutdevices.addView(textView);
        }

/**
 * gson方式
 */

//        XjxcBean newsbean = new Gson().fromJson(XcxjResult.result, XjxcBean.class);
//        for (int i = 0; i <newsbean.body.deviceTask.size() ; i++) {
//            String tasknum = newsbean.body.deviceTask.get(i).tasknum;
//            TextView textView = new TextView(context);
//            textView.setText(tasknum);
//            linearLayoutdevices.addView(textView);
//        }
    }
}
