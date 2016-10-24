package com.text.textviewwithimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SpannableTextView textView1 = (SpannableTextView) findViewById(R.id.t1);
        Car car = new Car("Renault", "Hatch Back", "25.2 kmpl  Petrol");

        textView1.setText(car.getName() +
                SpannableTextView.addImage(this, R.drawable.vertical_line) +
                car.getType() +
                SpannableTextView.addImage(this, R.drawable.vertical_line) +
                car.getMilage());

    }


}
