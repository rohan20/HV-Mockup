package com.example.rohantaneja.hv_mockup.ui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.rohantaneja.hv_mockup.R;
import com.example.rohantaneja.hv_mockup.adapter.CryptoDetailsAdapter;
import com.example.rohantaneja.hv_mockup.adapter.CryptoLabelsAdapter;
import com.example.rohantaneja.hv_mockup.adapter.CryptoNewsAdapter;
import com.example.rohantaneja.hv_mockup.model.CryptoDetails;
import com.example.rohantaneja.hv_mockup.model.CryptoLabel;
import com.example.rohantaneja.hv_mockup.model.CryptoNews;

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
        initCryptoNamesRecyclerView();
        initCryptoNewsRecyclerView();
        initCryptoLastTradeText();
    }

    private void initCryptoNamesRecyclerView() {
        RecyclerView cryptoNamesRecyclerView = findViewById(R.id.crypto_labels_recycler_view);
        CryptoLabelsAdapter adapter = new CryptoLabelsAdapter(this);
        cryptoNamesRecyclerView.setAdapter(adapter);
        adapter.updateList(getCryptoNames());
    }

    private void initCryptoDetailsRecyclerView() {
        RecyclerView cryptoDetailsRecyclerView = findViewById(R.id.crypto_details_recycler_view);
        CryptoDetailsAdapter adapter = new CryptoDetailsAdapter(this);
        cryptoDetailsRecyclerView.setAdapter(adapter);
        adapter.updateList(getCryptoDetails());
    }

    private void initCryptoNewsRecyclerView() {
        RecyclerView cryptoNewsRecyclerView = findViewById(R.id.crypto_news_recycler_view);
        CryptoNewsAdapter adapter = new CryptoNewsAdapter(this);
        cryptoNewsRecyclerView.setAdapter(adapter);
        adapter.updateList(getCryptoNews());
    }

    private void initCryptoLastTradeText() {
        TextView lastTradeTextView = findViewById(R.id.crypto_last_trade_text_view);
        SpannableString allText = new SpannableString(getString(R.string.last_trade_data));
        String blueString = "Last Trade:";

        allText.setSpan(new ForegroundColorSpan(Color.WHITE), blueString.length(), allText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        lastTradeTextView.setText(allText);
    }

    private List<CryptoDetails> getCryptoDetails() {
        ArrayList<CryptoDetails> list = new ArrayList<>();

        list.add(new CryptoDetails("Market Cap", "44.9B", "Hight 24Hr", " $4,804.33"));
        list.add(new CryptoDetails("24 Hr Volume", "85,033", "Low 24Hr", "$3,671.38"));
        list.add(new CryptoDetails("Mined Coins", "16,484,250", "Open 24Hr", "$3258.56"));

        return list;
    }

    private List<CryptoLabel> getCryptoNames() {
        ArrayList<CryptoLabel> list = new ArrayList<>();

        list.add(new CryptoLabel("ETH", true));
        list.add(new CryptoLabel("BTC", false));
        list.add(new CryptoLabel("LTC", false));
        list.add(new CryptoLabel("BCH", false));

        return list;
    }

    private List<CryptoNews> getCryptoNews() {
        ArrayList<CryptoNews> list = new ArrayList<>();

        list.add(new CryptoNews("Can Bitcoin Be Traded Like Gold?", "cointelegraph.com", "22 minutes ago"));
        list.add(new CryptoNews("Bitcoin may just be a 'dangerous pricing game' says NYU's valuation expert", "www.cnbc.com", "54 minutes ago"));
        list.add(new CryptoNews("Can Bitcoin Be Traded Like Gold?", "cointelegraph.com", "1 hour 2 minutes ago"));
        list.add(new CryptoNews("Bitcoin may just be a 'dangerous pricing game' says NYU's valuation expert", "www.cnbc.com", "1 hour 34 minutes ago"));

        return list;
    }
}
