package com.example.a13pager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

//ver 01 simple, static
//ver 02 multiple layout xmls
//ver 03 simple layout, callback

//ver 11 combine with ver05 indicator + Weather swipe

public class MainActivity extends AppCompatActivity {
    // https://www.journaldev.com/26148/android-viewpager2
    private MyModel[] cv_pages = {
            new MyModel("Miso Soup", R.drawable.mchi, R.color.light_blue,
                    "In a medium saucepan over medium-high heat, combine dashi granules and water; bring to a boil. Reduce heat to medium, and whisk in the miso paste. Stir in tofu. " +
                            "Separate the layers of the green onions, and add them to the soup. Simmer gently for 2 to 3 minutes before serving."),
            new MyModel("Mochi", R.drawable.misosoup,R.color.light_green,"Wrap red bean paste in aluminum foil and place in the freezer for at least 3 hours. " +
                    "Mix sweet rice flour and green tea powder thoroughly in a microwave-safe glass or ceramic bowl. Stir in water, then sugar. Mix until smooth. Cover bowl with plastic wrap.\n\n" +
                    "Cook the rice flour mixture in the microwave for 3 minutes and 30 seconds. Meanwhile, remove red bean paste from the freezer and divide paste into 8 equal balls. Set aside. " +
                    "Stir rice flour mixture and heat for another 15 to 30 seconds." ),
            new MyModel("Samon Teriyaki", R.drawable.salmonteriyaki,R.color.light_yellow,"Mix sesame oil, lemon juice, soy sauce, brown sugar, sesame seeds, ground mustard, ginger, " +
                    "and garlic powder in a small saucepan over low heat. Bring to a simmer, stirring until sugar has dissolved. Set aside 1/2 cup of marinade for basting.\n\n"+"Pour remaining marinade into " +
                    "a resealable plastic bag and place salmon into the marinade. Squeeze air out of the bag, seal, and marinate the salmon steaks for at least 1 hour (2 hours for better flavor). Drain and discard used marinade.")
    };
    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewpager);
        viewPager2.setAdapter(new MyViewPager2Adapter(cv_pages));
    }
}