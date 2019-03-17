package com.basil.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "App Created", Toast.LENGTH_SHORT).show();

        final ArrayList<DataItems> data = new ArrayList<>();
        data.add(new DataItems("Osama", android.R.drawable.alert_dark_frame));
        data.add(new DataItems("Basil", android.R.drawable.alert_light_frame));
        data.add(new DataItems("Ahmed", android.R.drawable.arrow_down_float));
        data.add(new DataItems("Mohamed", android.R.drawable.bottom_bar));
        data.add(new DataItems("Eslam", android.R.drawable.arrow_up_float));


        ListView listView = findViewById(R.id.list_view);
        final MyAdapter adapter = new MyAdapter(this, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                data.add(data.get(position));
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "App Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "App Resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "App Paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "App Stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "App Destroyed", Toast.LENGTH_SHORT).show();
    }
}
