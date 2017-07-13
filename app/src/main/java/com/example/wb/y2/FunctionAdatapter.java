package com.example.wb.y2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2017/7/12.
 */

public class FunctionAdatapter extends RecyclerView.Adapter {

    private Context context;
    private List<FunctionBean> s;

    private IItemOnClickListener mOnItemClickLitener;

    public void setOnItemClickLitener(IItemOnClickListener mOnItemClickLitener) {
        this.mOnItemClickLitener = mOnItemClickLitener;
    }

    public FunctionAdatapter(Context c,List<FunctionBean> list) {
        this.context = c;
        this.s = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_home, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // 绑定数据
        final MyViewHolder myViewHolder = (MyViewHolder) holder;
        FunctionBean function = s.get(position);
        myViewHolder.tv.setText(function.str);
        myViewHolder.des.setText(function.id+"");
        // 如果设置了回调，则设置点击事件
        if (mOnItemClickLitener != null) {
            // 点击回调
            myViewHolder.itemView.setOnClickListener(new View.OnClickListener
                    () {
                @Override
                public void onClick(View v) {
                    int pos = myViewHolder.getLayoutPosition();
                    mOnItemClickLitener.itemOnClick(myViewHolder.itemView, pos);
                }
            });

            // 长按回调
            myViewHolder.itemView.setOnLongClickListener(new View
                    .OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    int pos = myViewHolder.getLayoutPosition();
                    mOnItemClickLitener.itemLongOnClick(myViewHolder
                            .itemView, pos);
                    return false;
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return s.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv;
        TextView des;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.item_home_tv_title);
            des = (TextView) itemView.findViewById(R.id.item_home_tv_des);
        }
    }
}
