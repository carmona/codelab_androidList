package com.example.samsung.demolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Samsung on 14/09/2015.
 */
public class OceanAdapter extends ArrayAdapter<OceanStudent>{
    LayoutInflater inflater;

    public OceanAdapter(Context context, List<OceanStudent> objects) {
        super(context, 0, objects);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(
                    R.layout.list_item_student,
                    parent,
                    false);
        }
        ImageView genderImage = (ImageView) convertView.findViewById(R.id.img_gender);
        TextView nameLabel = (TextView) convertView.findViewById(R.id.txt_name);
        TextView ageLabel = (TextView) convertView.findViewById(R.id.txt_age);
        OceanStudent student = getItem(position);

        nameLabel.setText(student.getName());
        ageLabel.setText(student.getAge()+" anos");
        switch (student.getGender()){
            case MALE:
                genderImage.setImageResource(R.mipmap.ic_male);
                break;
            case FEMALE:
                genderImage.setImageResource(R.mipmap.ic_female);
                break;
        }
        return convertView;
    }
}