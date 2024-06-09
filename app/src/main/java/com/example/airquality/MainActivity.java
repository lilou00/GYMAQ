package com.example.airquality;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> gymName;
    private List<String> gymLocation;
    private List<Integer> mImageIds;
    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("GYM AQ APP");
        setSupportActionBar(toolbar);

        ListView listView = (ListView) findViewById(R.id.list);

        gymName = Arrays.asList("GYM FACTORY", "REBL SPORTS",
                "WIAAM","PLAY FITNESS", "NABDA", "SPORT PLAZZA", "ENERGY FIT", "LE TEMPLE");
        gymLocation = Arrays.asList("32 Rue Al Oukhouane", "8 rue manaziz Maarif", "HC49+MM3, Bd Lagouira"
                ,"Bd Mohamed Zefzaf","51 Rue Ibn Majjat, Bd Ghandi","Angle Bd Panoramique","Rue El Gara","H9V3+CJ9, Rue Ibn Assanaani");
        gymLocation = Arrays.asList("32 Rue Al Oukhouane", "8 rue manaziz Maarif", "HC49+MM3, Bd Lagouira"
                ,"Bd Mohamed Zefzaf","51 Rue Ibn Majjat, Bd Ghandi","Angle Bd Panoramique","Rue El Gara","H9V3+CJ9, Rue Ibn Assanaani");
        mImageIds = Arrays.asList(R.drawable.factory,R.drawable.sp,R.drawable.uu,R.drawable.oo,R.drawable.play,
                R.drawable.fit,R.drawable.hh,R.drawable.ii);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        CustomListAdapter adapter = new CustomListAdapter(this, gymName, mImageIds,gymLocation);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0 :
                    str = gymName.get(0);
                        intent.putExtra("message_key", str);
                        startActivity(intent);
                        break;
                    case 1 :
                        str = gymName.get(1);
                        intent.putExtra("message_key", str);
                        startActivity(intent);
                        break;
                    case 2 : Intent intent2 = new Intent(MainActivity.this, MainActivity2.class);
                        str = gymName.get(2);
                        intent2.putExtra("message_key", str);
                        startActivity(intent2);
                        break;
                    case 3 : Intent intent3 = new Intent(MainActivity.this, MainActivity2.class);
                        str = gymName.get(3);
                        intent3.putExtra("message_key", str);
                        startActivity(intent3);
                        break;
                    case 4 : Intent intent4 = new Intent(MainActivity.this, MainActivity2.class);
                        str = gymName.get(4);
                        intent4.putExtra("message_key", str);
                        startActivity(intent4);
                        break;
                    case 5 : Intent intent5 = new Intent(MainActivity.this, MainActivity2.class);
                        str = gymName.get(5);
                        intent5.putExtra("message_key", str);
                        startActivity(intent5);
                        break;
                    case 6 : Intent intent6 = new Intent(MainActivity.this, MainActivity2.class);
                        str = gymName.get(6);
                        intent6.putExtra("message_key", str);
                        startActivity(intent6);
                        break;
                    case 7 : Intent intent7 = new Intent(MainActivity.this, MainActivity2.class);
                        str = gymName.get(7);
                        intent7.putExtra("message_key", str);
                        startActivity(intent7);
                        break;
                }
            }
        });
    }
}