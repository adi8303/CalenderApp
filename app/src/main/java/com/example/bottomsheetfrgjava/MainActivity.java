package com.example.bottomsheetfrgjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button button;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.nextButton);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              BottomSheetFragment bottomSheetFragment = new BottomSheetFragment();
              bottomSheetFragment.show(getSupportFragmentManager(),bottomSheetFragment.getTag());
          }
      });


    }
}