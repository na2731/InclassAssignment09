package com.example.android.geoquizcard;

import android.view.View;

/**
 * Created by anning on 2018/3/22.
 */

public class Question {
    public int photoId;
    public String names;
    public String Calories;
    public boolean isVege;



    public void setPhotoId(int photoId){this.photoId=photoId;}

    public int getPhotoId(){return photoId;}

    public void setNames(String names){this.names=names;}

    public String getNames(){return names;}

    public String getCalories(){return Calories;}

    public void setCalories(String calories){this.Calories=Calories;}

    public void setVege(boolean isVege){this.isVege=isVege;}

    public boolean getVege(){return isVege;}

    public Question(int photoId,String names, String Calories, boolean isVege){
        this.names=names;
        this.isVege=isVege;
        this.Calories=Calories;
        this.photoId=photoId;
    }
}
