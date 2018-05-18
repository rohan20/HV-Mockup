package com.example.rohantaneja.hv_mockup.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rohantaneja.hv_mockup.R;
import com.example.rohantaneja.hv_mockup.model.CryptoLabel;

public class CryptoLabelsViewHolder extends RecyclerView.ViewHolder {

    private TextView mNameTextView;

    public CryptoLabelsViewHolder(View itemView) {
        super(itemView);

        mNameTextView = itemView.findViewById(R.id.name_text_view);
    }

    public void bindData(CryptoLabel crypto) {
        mNameTextView.setText(crypto.getName());
        if (crypto.isSelected()) {
            mNameTextView.setBackgroundResource(R.drawable.selected_item_background);
        } else {
            mNameTextView.setBackgroundDrawable(null);
        }
    }
}
