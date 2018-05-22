package com.example.rohantaneja.hv_mockup.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rohantaneja.hv_mockup.R;
import com.example.rohantaneja.hv_mockup.model.CryptoNews;

public class CryptoNewsViewHolder extends RecyclerView.ViewHolder {

    private Context mContext;
    private TextView mTitleTextView;
    private TextView mSourceTextView;
    private TextView mTimestampTextView;

    public CryptoNewsViewHolder(Context context, View itemView) {
        super(itemView);

        mTitleTextView = itemView.findViewById(R.id.title_text_view);
        mSourceTextView = itemView.findViewById(R.id.source_text_view);
        mTimestampTextView = itemView.findViewById(R.id.timestamp_text_view);
    }

    public void bindData(CryptoNews cryptoNews) {
        mTitleTextView.setText(cryptoNews.getTitle());
        mSourceTextView.setText(cryptoNews.getSource());
        mTimestampTextView.setText(cryptoNews.getTimestamp());
    }
}
