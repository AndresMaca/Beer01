package com.example.developer.beer01;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Developer on 20/2/2017.
 */
public class CardFragment extends Fragment {

    private CardView cardView;
    private String setText;

    public static Fragment getInstance(int position) {
        CardFragment f = new CardFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        f.setArguments(args);

        return f;
    }




    @SuppressLint("DefaultLocale")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottle_item, container, false);

        cardView = (CardView) view.findViewById(R.id.cardView);
        cardView.setMaxCardElevation(cardView.getCardElevation() * CardAdapter.MAX_ELEVATION_FACTOR);

        TextView title = (TextView) view.findViewById(R.id.bottleTypeTv);

        //title.setText(String.format("Card %d", getArguments().getInt("position")));
        title.setText(setText);


        return view;
    }

    public CardView getCardView() {
        return cardView;
    }

    public void setSetText(String setText) {
        this.setText = setText;
    }

    public String getSetText() {
        return setText;
    }
}
