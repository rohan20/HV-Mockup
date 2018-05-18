package com.example.rohantaneja.hv_mockup.adapter.viewholder;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rohantaneja.hv_mockup.R;
import com.example.rohantaneja.hv_mockup.model.CryptoDetails;

public class CryptoDetailsViewHolder extends RecyclerView.ViewHolder {

    private Context mContext;

    private TextView mNameTextView;
    private TextView mUnitsTextView;
    private TextView mStateTextView;
    private TextView mPriceTextView;

    public CryptoDetailsViewHolder(Context context, View itemView) {
        super(itemView);

        mContext = context;

        mNameTextView = itemView.findViewById(R.id.name_text_view);
        mUnitsTextView = itemView.findViewById(R.id.units_text_view);
        mStateTextView = itemView.findViewById(R.id.state_text_view);
        mPriceTextView = itemView.findViewById(R.id.price_text_view);
    }

    public void bindData(CryptoDetails item) {
        mNameTextView.setText(item.getName());
        mUnitsTextView.setText(item.getNumUnits());
        mStateTextView.setText(item.getState());
        mPriceTextView.setText(item.getPrice());
        if(item.getState().equals("Low 24Hr"))
            mPriceTextView.setTextColor(ContextCompat.getColor(mContext, android.R.color.holo_red_dark));
    }
}
