package com.example.wb.y2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private FunctionAdatapter mFunctionAdatapter;
    private RecyclerView mRecyclerView;
    private List<FunctionBean> s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
        initEvent();
        showListView();
    }

    private void initData() {
        s = new ArrayList<>();
        s.add(new FunctionBean("选择需要升级的固件",0));
        s.add(new FunctionBean("已选择固件点击升级",27));
        s.add(new FunctionBean("升级固件本地固件1",1));
        s.add(new FunctionBean("升级固件本地固件2",2));
        s.add(new FunctionBean("绑定设备",3));
        s.add(new FunctionBean("解除绑定",4));
        s.add(new FunctionBean("登入设备",5));
        s.add(new FunctionBean("设置时间",6));
        s.add(new FunctionBean("获取电量",7));
        s.add(new FunctionBean("设置语言",8));
        s.add(new FunctionBean("设置用户",9));
        s.add(new FunctionBean("获取心率",10));
        s.add(new FunctionBean("获取睡眠",11));
        s.add(new FunctionBean("获取运动",12));
        s.add(new FunctionBean("马达测试",13));
        s.add(new FunctionBean("计步测试",14));
        s.add(new FunctionBean("心率测试",15));
        s.add(new FunctionBean("心率测试-自动",16));
        s.add(new FunctionBean("关机测试",17));
        s.add(new FunctionBean("重启测试",18));
        s.add(new FunctionBean("强制解除",19));
        s.add(new FunctionBean("开启屏幕测试",20));
        s.add(new FunctionBean("关闭屏幕测试",21));
        s.add(new FunctionBean("开启同步-运动",22));
        s.add(new FunctionBean("开启同步-心率",23));
        s.add(new FunctionBean("开启同步-睡眠",24));
        s.add(new FunctionBean("断开连接设备",25));
        s.add(new FunctionBean("运动数据同步设置",26));
//		s.add(new Function("获取固件版本信息",28));
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyc_content);
    }

    private void initEvent() {

    }

    private void showListView() {
        if (null == mFunctionAdatapter) {
            mFunctionAdatapter = new FunctionAdatapter(this,s);
            //右边列表视图展示
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
            mRecyclerView.addItemDecoration(new DividerItemDecoration
                    (this,
                            DividerItemDecoration.VERTICAL_LIST));
            mRecyclerView.setAdapter(mFunctionAdatapter);
            mFunctionAdatapter.setOnItemClickLitener(new IItemOnClickListener() {
                @Override
                public void itemOnClick(View view, int position) {
                    FunctionBean functionBean = s.get(position);
                    String cmd ="";
                    switch (functionBean.id) {
                        case 12:
                            cmd = BraceletInstructions.getMotionInstructions();

                            break;
                        case 10:
                            cmd = BraceletInstructions.getHeartRateInstructions();

                            break;
                        case 15:
                            cmd = BraceletInstructions.getHeartRateTestInstructions(true);
                            break;
                        case 14:
                            cmd = BraceletInstructions.getPedometerTestInstructions(true);
                            break;
                        default:
                            break;
                    }
                    Logs.e(TAG, "发送的指令是:"+cmd);
                }

                @Override
                public void itemLongOnClick(View view, int position) {

                }
            });
        } else {
            // 刷新
        }
    }
}
