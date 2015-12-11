package com.example.chenjipayne.thesecendredrockhomeworkforandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Student> studentList = new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStudent(); // 初始化学生数据
        StudentAdapter adapter = new StudentAdapter(MainActivity.this, R.layout.student_item, studentList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
    private void initStudent() {
        Student chenjiping = new Student("陈继平",2015214128);
        studentList.add(chenjiping);
        Student chenlin = new Student("陈林", 2015214146);
        studentList.add(chenlin);
        Student chenyuyu = new Student("陈俞逾", 2015214133);
        studentList.add(chenyuyu);
        Student chenyu = new Student("陈余", 2015214125);
        studentList.add(chenyu);
        Student chenshuting = new Student("陈书婷", 2015214164);
        studentList.add(chenshuting);
        Student wangsen = new Student("王森", 2015214144);
        studentList.add(wangsen);
        Student hexiuyuan = new Student("何修远", 2015214122);
        studentList.add(hexiuyuan);
        Student zhaowen = new Student("赵文", 2015214301);
        studentList.add(zhaowen);
        Student shenji = new Student("沈纪", 2015214148);
        studentList.add(shenji);
        Student lingxiao = new Student("凌霄", 0000000000);
        studentList.add(lingxiao);
    }
}

