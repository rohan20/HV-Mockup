package com.example.rohantaneja.hv_mockup.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rohantaneja.hv_mockup.R;
import com.example.rohantaneja.hv_mockup.adapter.viewholder.CryptoNewsViewHolder;
import com.example.rohantaneja.hv_mockup.model.CryptoDetails;
import com.example.rohantaneja.hv_mockup.model.CryptoNews;

import java.util.ArrayList;
import java.util.List;

public class CryptoNewsAdapter extends RecyclerView.Adapter<CryptoNewsViewHolder> {

    private final Context mContext;
    private List<CryptoNews> mCryptoNewsList;

    public CryptoNewsAdapter(Context context) {
        mContext = context;
        mCryptoNewsList = new ArrayList<>();
    }

    public void updateList(List<CryptoNews> itemsList) {
        mCryptoNewsList = itemsList;
        notifyDataSetChanged();
    }

    @Override
    public CryptoNewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_crypto_news, parent, false);
        return new CryptoNewsViewHolder(mContext, v);
    }

    @Override
    public void onBindViewHolder(CryptoNewsViewHolder holder, int position) {
        CryptoNews item = mCryptoNewsList.get(position);
        holder.bindData(item);
    }

    @Override
    public int getItemCount() {
        return mCryptoNewsList == null ? 0 : mCryptoNewsList.size();
    }
}