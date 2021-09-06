package com.hienqp.listviewnangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends BaseAdapter {
    // Context, là Activity chỉ định sẽ hiển thị
    private Context context;
    // UI XML của từng item hiển thị trên ListView mà ta đã xây dựng sẵn, tương tự như android.R.layout.simple_layout_item_1 của hệ thống
    private int layoutItem;
    // List danh sách chứa các đối tượng Fruit
    private List<Fruit> fruitList;

    public FruitAdapter(Context context, int layoutItem, List<Fruit> fruitList) {
        this.context = context;
        this.layoutItem = layoutItem;
        this.fruitList = fruitList;
    }

    // trả về số dòng cho ListView
    // lấy số lượng phần tử trong fruitList trả về số dòng cho ListView
    @Override
    public int getCount() {
        return fruitList.size();
    }

    // trả về đối tượng item trong ListView
    // phương thức này chưa cần sử dụng, để mặc định
    @Override
    public Object getItem(int position) {
        return null;
    }

    // trả về ID của đối tượng item trong ListView
    // phương thức này chưa cần sử dụng, để mặc định
    @Override
    public long getItemId(int position) {
        return 0;
    }

    // phương thức trả về 1 View (item) trên ListView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layoutItem, null);

        // ánh xạ
        ImageView fruitPhoto = (ImageView) convertView.findViewById(R.id.imageview_fruit_photo);
        TextView fruitName = (TextView) convertView.findViewById(R.id.textview_fruit_name);
        TextView fruitDescription = (TextView) convertView.findViewById(R.id.textview_fruit_description);

        // gán giá trị
        Fruit fruit = fruitList.get(position);

        fruitPhoto.setImageResource(fruit.getFruitPhoto());
        fruitName.setText(fruit.getFruitName());
        fruitDescription.setText(fruit.getFruitDescription());

        return convertView;
    }
}
