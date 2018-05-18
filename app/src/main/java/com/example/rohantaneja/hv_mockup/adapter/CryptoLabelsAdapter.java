package com.example.rohantaneja.hv_mockup.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rohantaneja.hv_mockup.R;
import com.example.rohantaneja.hv_mockup.adapter.viewholder.CryptoLabelsViewHolder;
import com.example.rohantaneja.hv_mockup.model.CryptoLabel;

import java.util.ArrayList;
import java.util.List;

public class CryptoLabelsAdapter extends RecyclerView.Adapter<CryptoLabelsViewHolder> {

    private final Context mContext;
    private List<CryptoLabel> mCryptoNamesList;

    public CryptoLabelsAdapter(Context context) {
        mContext = context;
        mCryptoNamesList = new ArrayList<>();
    }

    public void updateList(List<CryptoLabel> itemsList) {
        mCryptoNamesList = itemsList;
        notifyDataSetChanged();
    }

    @Override
    public CryptoLabelsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_crypto_label, parent, false);
        return new CryptoLabelsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CryptoLabelsViewHolder holder, int position) {
        holder.bindData(mCryptoNamesList.get(position));
    }

    @Override
    public int getItemCount() {
        return mCryptoNamesList == null ? 0 : mCryptoNamesList.size();
    }
}