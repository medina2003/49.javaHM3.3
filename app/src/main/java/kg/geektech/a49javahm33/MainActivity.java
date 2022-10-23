package kg.geektech.a49javahm33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> mountainsList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mountainsList.add("Макалу");
        mountainsList.add("Чогори");
        mountainsList.add("Эверест");
        mountainsList.add("Нгади-Чули");
        mountainsList.add("Нандадеви");
        mountainsList.add("Чомолонзо");
        mountainsList.add("Кунианг-Киш");
        mountainsList.add("Ракапоши");
        mountainsList.add("Салторо-Кангри");
        mountainsList.add("Жанну");
        mountainsList.add("Моламенкинг");
        mountainsList.add("Гунгашань");
        mountainsList.add("Кула-Кангри");
        mountainsList.add("Чоголиза");
        mountainsList.add("Чангзе");
        mountainsList.add("Ношак");
        mountainsList.add("Конгуртюбе");
        mountainsList.add("Джонгсонг");
        mountainsList.add("Скил-Брум");
        mountainsList.add("Истор-о-Нал");

        recyclerView = findViewById(R.id.recycler_view_mt);
        MountainsAdapter adapter = new MountainsAdapter(mountainsList);
        recyclerView.setAdapter(adapter);
    }
}