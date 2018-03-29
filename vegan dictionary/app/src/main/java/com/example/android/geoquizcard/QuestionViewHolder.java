package com.example.android.geoquizcard;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anning on 2018/3/22.
 */

public class QuestionViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView Name;
    public TextView Calor;
    public boolean ve;
    public ImageView fe;

    public QuestionViewHolder(View itemView, final Context context, final List<Question> questions) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        Name = (TextView) itemView.findViewById(R.id.textView1);
        Calor = (TextView) itemView.findViewById(R.id.textView2);
        fe=(ImageView)itemView.findViewById(R.id.ii) ;

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ve){
                    Toast.makeText(context,"Yes, it's vegetarian food",Toast.LENGTH_SHORT).show();
                }
             else {
                    Toast.makeText(context,"No, it's not vegetarian food",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}



