package com.example.android.geoquizcard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by anning on 2018/3/22.
 */

public class QuestionsAdapter extends RecyclerView.Adapter <QuestionViewHolder> {
    private List<Question> questions;
    private Context context;


    @Override
    public void onBindViewHolder(QuestionViewHolder holder, int position){
        Question question=questions.get(position);
        holder.Name.setText(question.names);
        holder.Calor.setText(question.Calories);
        holder.ve=question.isVege;
        holder.fe.setImageResource(question.photoId);

    }
    @Override
    public int getItemCount(){return questions.size();}

    public QuestionsAdapter(List<Question>questions, Context context){
        this.questions=questions;
        this.context=context;
    }

    @Override
    public QuestionViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_country,parent,false);
        return new QuestionViewHolder(view, context, questions);
    }
}
