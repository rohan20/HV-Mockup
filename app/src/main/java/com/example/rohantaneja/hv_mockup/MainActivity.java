package com.example.rohantaneja.hv_mockup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.rohantaneja.hv_mockup.adapter.CryptoDetailsAdapter;
import com.example.rohantaneja.hv_mockup.model.CryptoDetails;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        if (getSupportActionBar() != null)
            getSupportActionBar().hide();
        initCryptoDetailsRecyclerView();
    }

    private void initCryptoDetailsRecyclerView() {
        RecyclerView cryptoDetailsRecyclerView = findViewById(R.id.crypto_details_recycler_view);
        CryptoDetailsAdapter adapter = new CryptoDetailsAdapter(this);
        cryptoDetailsRecyclerView.setAdapter(adapter);
        adapter.updateList(getCryptoDetails());
    }

    private List<CryptoDetails> getCryptoDetails() {
        ArrayList<CryptoDetails> list = new ArrayList<>();

        list.add(new CryptoDetails("Market Cap", "44.9B", "Hight 24Hr", " $4,804.33"));
        list.add(new CryptoDetails("24 Hr Volume", "85,033", "Low 24Hr", "$3,671.38"));
        list.add(new CryptoDetails("Mined Coins", "16,484,250", "Open 24Hr", "$3258.56"));

        return list;
    }
}
