package com.fishbowlinventory.android_interview_exercise

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var items = ArrayList<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(Item(1.99F, "Dog"))
        items.add(Item(4.95F, "Cat"))
        items.add(Item(29.89F, "Snake"))
        items.add(Item(11.90F, "Rabbit"))
        items.add(Item(10.00F, "Bird"))
        items.add(Item(21.99F, "Pig"))

        items = removeLessThan(items, 10.00F)
        // items.removeLessThan(10.00F) // TODO: Bonus (See Bonus.kt)
    }

    // 1. Traverse array (one time) removing all items with price <= x
    private fun removeLessThan(itemList: ArrayList<Item>, price: Float): ArrayList<Item> {
        // TODO: Implement here
        return ArrayList()
    }

    // 2. Generate the sum of item prices
    private fun sumItemPrices(itemList: ArrayList<Item>): Float {
        // TODO: Implement here
        return 0F
    }

    // 3. Display the sum centered vertically and horizontally in the main view
    private fun displaySum(sum: Float) {
        // TODO: Implement here
    }

}