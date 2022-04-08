package com.example.bottomsheetfrgjava;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

public class DatePickerFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar c =Calendar.getInstance();

        int year =c.get(Calendar.YEAR);
        int month =c.get(Calendar.MONTH);
        int date=c.get(Calendar.DATE);
        return new DatePickerDialog(getActivity(),(DatePickerDialog.OnDateSetListener)getActivity(),year,month,date);
    }

}
