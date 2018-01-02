package lxg.cn.delegateadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import lxg.cn.delegateadapter.bean.Animal;
import lxg.cn.delegateadapter.bean.Cat;
import lxg.cn.delegateadapter.bean.Dog;
import lxg.cn.delegateadapter.delegate.AnimalAdapter;
import lxg.cn.delegateadapter.itemviewtype.MainAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.rv_animals);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Tom"));
        animals.add(new Cat("Kit"));
        animals.add(new Dog("mendou"));
        animals.add(new Dog("taidi"));
        animals.add(new Cat("no"));
        mRecyclerView.setAdapter(new AnimalAdapter(animals));
    }
}
