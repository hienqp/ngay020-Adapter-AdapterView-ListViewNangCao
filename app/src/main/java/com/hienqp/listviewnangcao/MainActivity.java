package com.hienqp.listviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewFruit;
    ArrayList<Fruit> fruitArrayList;
    FruitAdapter fruitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        // Adapter
        fruitAdapter = new FruitAdapter(MainActivity.this, R.layout.item_fruit_listview, fruitArrayList);
        // gắn Adapter lên AdapterView
        listViewFruit.setAdapter(fruitAdapter);
    }

    private void AnhXa() {
        // AdapterView
        listViewFruit = (ListView) findViewById(R.id.listview_fruit);

        // DataSource
        fruitArrayList = new ArrayList<>();
        fruitArrayList.add(new Fruit(R.drawable.dautay,"Dâu Tây", "Dâu Tây Đà Lạt"));
        fruitArrayList.add(new Fruit(R.drawable.cam,"Cam Sành", "Cam Sành Vĩnh Long"));
        fruitArrayList.add(new Fruit(R.drawable.chuoi,"Chuối", "Chuối Long An"));
        fruitArrayList.add(new Fruit(R.drawable.luu,"Lựu", "Lựu Hưng Yên"));
        fruitArrayList.add(new Fruit(R.drawable.nho,"Nho", "Nho Bình Thuận"));
        fruitArrayList.add(new Fruit(R.drawable.tao,"Táo", "Táo Lạng Sơn"));
    }
}