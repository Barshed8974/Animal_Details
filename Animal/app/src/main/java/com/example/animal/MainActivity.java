package com.example.animal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListner {
    private RecyclerView recyclerView;
    private ArrayList<Animal> modellist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        buildStudentList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        {
            Adapter adapter=new Adapter(modellist,this);
            StaggeredGridLayoutManager gridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.setAdapter(adapter);
        }
    }

    private void buildStudentList() {
        for(int i=1;i<10;i++)
        {
            int x=i%3;
            if (x==0)
            {
                Animal model = new Animal(R.drawable.dog,"Dog","Bark","Domestic");
                modellist.add(model);
            }
            else if(x==1)
            {
                Animal model = new Animal(R.drawable.cat,"Cat","Mew","Domestic");
                modellist.add(model);
            }
            else if(x==2)
            {
                Animal model = new Animal(R.drawable.cow,"Cow","Mows","Domestic");
                modellist.add(model);
            }
            else if(x==3)
            {
                Animal model = new Animal(R.drawable.tiger,"Tiger","Roar","Wild");
                modellist.add(model);
            }
        }
    }

    private void initviews()
    {
        recyclerView=findViewById(R.id.recycler1);
    }

    @Override
    public void onItemClick(Animal model) {
        {
            Toast.makeText(this,model.getmName()+"\n"+model.getmType()+"\n"+model.getmSound(),Toast.LENGTH_SHORT).show();
        }
    }
}