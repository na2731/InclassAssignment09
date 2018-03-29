package com.example.android.geoquizcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public List<Question>videos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Clicking the foodcards to know if it is vegetarian food",Toast.LENGTH_LONG).show();

        initialData();

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionsAdapter(videos,this));
    }


    public void initialData(){
        videos=new ArrayList<>();
        videos.add(new Question(R.drawable.chicken,"Chicken","320 Cal",false));
        videos.add(new Question(R.drawable.cola,"Cola","182 Cal",true));
        videos.add(new Question(R.drawable.cookie,"Cookies","132 Cal",true));
        videos.add(new Question(R.drawable.fires,"Fries","365 Cal",true));
        videos.add(new Question(R.drawable.ham,"Hamburgers","354 Cal",false));
    }
}
