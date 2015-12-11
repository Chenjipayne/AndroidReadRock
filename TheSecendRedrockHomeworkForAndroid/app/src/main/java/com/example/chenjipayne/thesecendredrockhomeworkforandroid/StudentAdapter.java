package com.example.chenjipayne.thesecendredrockhomeworkforandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chenji payne on 2015/12/11.
 */
public class StudentAdapter extends ArrayAdapter<Student> {
    private int resourceId;
    public StudentAdapter(Context context, int textViewResourceId,
                          List<Student> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }
    @Override  public View getView(int position, View convertView, ViewGroup parent) {
        Student student = getItem(position); // 获取当前项的Student实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView studentImage = (ImageView) view.findViewById(R.id.student_image);
        TextView studentName = (TextView) view.findViewById(R.id.student_name);
        studentImage.setImageResource(student.getImageId());
        studentName.setText(student.getName());
        return view;
    }
}
