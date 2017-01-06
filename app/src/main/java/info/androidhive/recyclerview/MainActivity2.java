package info.androidhive.recyclerview;



/**
 * Created by hadeel on 1/6/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycleView=(RecyclerView)findViewById(R.id.recycler_view);

        Lesson lessonsList[]={new Lesson("Lesson 1","2016")
                ,new Lesson("Lesson 2","2011")
                ,new Lesson("Lesson 3","2016")
                ,new Lesson("Lesson 4","2015")
                ,new Lesson("Lesson 5","2011")
                ,new Lesson("Lesson 6","2015")
        };

        recycleView.setLayoutManager(new LinearLayoutManager(this));
        LessonsAdapter myAdapter = new LessonsAdapter(lessonsList,this);
        recycleView.setAdapter(myAdapter);
        recycleView.setItemAnimator(new DefaultItemAnimator());

    }
}
