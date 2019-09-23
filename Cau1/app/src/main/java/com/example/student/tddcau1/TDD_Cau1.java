package com.example.student.tddcau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TDD_Cau1 extends AppCompatActivity {
    ListView lvCau1;
    ArrayList<Cau1>arrayCau1;
    Cau1Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdd__cau1);

        AnhXa();
        adapter=new Cau1Adapter(this,R.layout.activity_cau1,arrayCau1);
        lvCau1.setAdapter(adapter);

    }

    private void AnhXa() {
        lvCau1=findViewById(R.id.listview);
        arrayCau1=new ArrayList<>();

        arrayCau1.add(new Cau1("Wolfverin","American","30000"));
        arrayCau1.add(new Cau1("SwordFish","American","15000"));
        arrayCau1.add(new Cau1("DeadPool","American","29000"));
        arrayCau1.add(new Cau1("Robinhood","American","35000"));
        arrayCau1.add(new Cau1("EndGame","American","100000"));
        arrayCau1.add(new Cau1("IronMan","","70000"));


    }
}
