package com.text.textviewwithimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextViewWithImages textView1 = (TextViewWithImages) findViewById(R.id.t1);
        Car car = new Car("Renault", "Hatch Back", "25.2 kmpl  Petrol");

        textView1.setText(car.getName() +
                TextViewWithImages.addImage(this, R.drawable.vertical_line) +
                car.getType() +
                TextViewWithImages.addImage(this, R.drawable.vertical_line) +
                car.getMilage());

    }


}
