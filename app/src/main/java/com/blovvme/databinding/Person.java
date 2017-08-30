package com.blovvme.databinding;

import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;

import java.util.Observable;

/**
 * Created by Blovvme on 8/30/17.
 */

public class Person {

    private ObservableField<String> firstNameObs = new ObservableField<>();
    private ObservableField<String> lastNameObs = new ObservableField<>();

    public ObservableField<String> getFirstNameObs() {
        return firstNameObs;
    }

    public void setFirstNameObs(ObservableField<String> firstNameObs) {
        this.firstNameObs = firstNameObs;
    }

    public ObservableField<String> getLastNameObs() {
        return lastNameObs;
    }

    public void setLastNameObs(ObservableField<String> lastNameObs) {
        this.lastNameObs = lastNameObs;
    }

    public TextWatcher getWatcherFirstName() {
        return watcherFirstName;
    }

    public void setWatcherFirstName(TextWatcher watcherFirstName) {
        this.watcherFirstName = watcherFirstName;
    }

    public TextWatcher getWatcherLastName() {
        return watcherLastName;
    }

    public void setWatcherLastName(TextWatcher watcherLastName) {
        this.watcherLastName = watcherLastName;
    }



    public TextWatcher watcherFirstName = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            firstNameObs.set(editable.toString());
        }
    };

    public TextWatcher watcherLastName = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            lastNameObs.set(editable.toString());
        }
    };

    String firstName,lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
