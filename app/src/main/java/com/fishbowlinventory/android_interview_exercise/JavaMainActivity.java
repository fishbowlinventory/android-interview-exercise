package com.fishbowlinventory.android_interview_exercise;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class JavaMainActivity extends AppCompatActivity {

    private ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items.add(new Item(1.99F, "Dog"));
        items.add(new Item(4.95F, "Cat"));
        items.add(new Item(29.89F, "Snake"));
        items.add(new Item(11.90F, "Rabbit"));
        items.add(new Item(10.00F, "Bird"));
        items.add(new Item(21.99F, "Pig"));

        items = removeLessThan(items, 10F);
        // BonusKt.removeLessThan(items, Float.valueOf(10)); // TODO: Bonus (See Bonus.kt)
    }

    // 1. Traverse array (one time) removing all items with price <= x
    private ArrayList<Item> removeLessThan(ArrayList<Item> itemList, Float price) {
        // TODO: Implement here
        return new ArrayList<>();
    }

    // 2. Generate the sum of item prices
    private Float sumItemPrices(ArrayList<Item> itemList) {
        // TODO: Implement here
        return 0F;
    }

    // 3. Display the sum centered vertically and horizontally in the main view
    private void displaySum(Float sum) {
        // TODO: Implement here
    }

}
