package com.blovvme.databinding;

import android.util.Log;
import android.view.View;

import static android.content.ContentValues.TAG;

/**
 * Created by Blovvme on 8/30/17.
 */

public class ViewModel {


    public static final String TAG = "ViewModelTag";

    public void onClick(View view){
        Log.d(TAG, "onClick: pinche Secando");

    }

    public void onClickPojo(View view, Person person){
        Log.d(TAG, "onclickPojo: " + person.getFirstName() + " " +person.getLastName());
    }

    public void onClickObs(View view, Person person){
        Log.d(TAG, "onclickObs: " + person.getFirstNameObs().get() + " " +person.getLastNameObs().get());
    }


}
