package com.example.transact24;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    protected View userview
    TextView textView1;
    TextView textView2;
    ListView listview1;
    ArrayList<> tasklist1;
    EditText edittext1;
    Button btnadd1;
    DatabaseReference databasetasks;

    ArrayAdapter<String> arrayAdapter1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        textView1 = (TextView) container.findViewById(R.id.TextView1);
        textView2 = (TextView) container.findViewById(R.id.TextView2);
        listview1=(ListView) container.findViewById(R.id.listview1);

        tasklist1=new ArrayList<>();

        DatabaseReference databasetasks = FirebaseDatabase.getInstance().getReference("Tasks").child(dayid);

        userview= inflater.inflate(R.layout.fragment_home,container,false);

    }
}
