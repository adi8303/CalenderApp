package com.example.bottomsheetfrgjava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link booking_fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class booking_fragment3 extends Fragment {

    public booking_fragment3() {
        // Required empty public constructor
    }


    public static booking_fragment3 newInstance(String param1, String param2) {
        booking_fragment3 fragment = new booking_fragment3();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_booking_fragment3, container, false);


        List<String> newspapers = new ArrayList<>();
        newspapers.add(0, "Newspaper");
        newspapers.add("Main Prayagraj Edition");
        newspapers.add("Supplement Bhaskar Life");
        newspapers.add("Supplement Children Bhaskar");
        newspapers.add("SUpplement Jaago Bhaskar");

        Spinner spinner = (Spinner) v.findViewById(R.id.news_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, newspapers);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                newspapers.remove(0);
                String newspaper =parent.getItemAtPosition(i).toString();
                Toast.makeText(parent.getContext(), "Selected: " + newspaper,Toast.LENGTH_LONG).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        return v;

    }
}