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
        animals.add("Monkey");

        animalsList = findViewById(R.id.animal_list);
        listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, animals);
        animalsList.setAdapter(listAdapter);
        animalsList.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if(id == 0 ){
            Intent i = new Intent(this , CatActivity.class);
            startActivity(i);
        }
        else {
            if(id == 1){
                Intent i = new Intent(this , DogActivity.class);
                startActivity(i);
            }
            else {
                if(id == 2){
                    Intent i = new Intent(this , RabbitActivity.class);
                    startActivity(i);
                }
                else
                {
                    if(id == 3){
                        Intent i = new Intent(this , MonkeyActivity.class);
                        startActivity(i);
                    }
                }
            }
        }
    }


}
