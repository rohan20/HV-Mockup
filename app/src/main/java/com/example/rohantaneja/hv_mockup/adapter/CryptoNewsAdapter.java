package com.example.rohantaneja.hv_mockup.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rohantaneja.hv_mockup.R;
import com.example.rohantaneja.hv_mockup.adapter.viewholder.CryptoDetailsViewHolder;
import com.example.rohantaneja.hv_mockup.model.CryptoDetails;

import java.util.ArrayList;
import java.util.List;

public class CryptoDetailsAdapter extends RecyclerView.Adapter<CryptoDetailsViewHolder> {

    private final Context mContext;
    private List<CryptoDetails> mCryptoDetailsList;

    public CryptoDetailsAdapter(Context context) {
        mContext = context;
        mCryptoDetailsList = new ArrayList<>();
    }

    public void updateList(List<CryptoDetails> itemsList) {
        mCryptoDetailsList = itemsList;
        notifyDataSetChanged();
    }

    @Override
    public CryptoDetailsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_crypto_details, parent, false);
        return new CryptoDetailsViewHolder(mContext, v);
    }

    @Override
    public void onBindViewHolder(CryptoDetailsViewHolder holder, int position) {
        CryptoDetails item = mCryptoDetailsList.get(position);
        holder.bindData(item);
    }

    @Override
    public int getItemCount() {
        return mCryptoDetailsList == null ? 0 : mCryptoDetailsList.size();
    }
}