package com.example.student.tddcau1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Cau1Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Cau1>cau1List;

    public Cau1Adapter(Context context, int layout, List<Cau1> cau1List) {
        this.context = context;
        this.layout = layout;
        this.cau1List = cau1List;
    }

    @Override
    public int getCount() {
        return cau1List.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(layout,null);

        //anh sa
        TextView txtten=view.findViewById(R.id.list1);
        TextView txtmota=view.findViewById(R.id.list2);
        TextView txttien=view.findViewById(R.id.tien);

        //gan gia tri
        Cau1 cau1= cau1List.get(i);
        txtten.setText(cau1.getTen());
        txtmota.setText(cau1.getMota());
        txttien.setText(cau1.getTien());

        return view;
    }
}
