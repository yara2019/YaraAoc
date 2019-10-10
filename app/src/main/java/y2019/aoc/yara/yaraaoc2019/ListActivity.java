package y2019.aoc.yara.yaraaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView animalsList;
    ArrayList<String> animals = new ArrayList<>();
    ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rabbit");
        animals.add("Fish");
        animals.add("Hamster");
        animals.add("Turtle");
        animals.add("Snake");
        animals.add("Chicken");

        animalsList = findViewById(R.id.animal_list);
        listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, animals);
        animalsList.setAdapter(listAdapter);
        animalsList.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                Intent i = new Intent(this , CatActivity.class);
                startActivity(i);
                break;
            case 1:
                Intent i1 = new Intent(this, DogActivity.class);
                startActivity(i1);
                break;
            case 2:
                Intent i2 = new Intent (this, RabbitActivity.class);
                startActivity(i2);
                break;
            case 3:
                Intent i3 = new Intent(this, FishActivity.class);
                startActivity(i3);
                break;
            case 4:
                Intent i4 = new Intent(this, HamsterActivity.class);
                startActivity(i4);
                break;
            case 5:
                Intent i5 = new Intent(this, TurtleActivity.class);
                startActivity(i5);
                break;
            case 6:
                Intent i6 = new Intent(this, SnakeActivity.class);
                startActivity(i6);
                break;
            case 7:
                Intent i7 = new Intent(this, ChickenActivity.class);
                startActivity(i7);
                break;



        }




                }



}
