package info.androidhive.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Lesson> lessonList = new ArrayList<>();
    private RecyclerView recyclerView;
    private LessonsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new LessonsAdapter(lessonList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Lesson lesson = lessonList.get(position);
                Toast.makeText(getApplicationContext(), lesson.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareLessonData();
    }

    private void prepareLessonData() {
        Lesson lesson = new Lesson("Lesson 1", "2015");
        lessonList.add(lesson);

        lesson = new Lesson("Lesson2", "2015");
        lessonList.add(lesson);

        lesson = new Lesson("Lesson 3", "2015");
        lessonList.add(lesson);

        lesson = new Lesson("Lesson 4", "2015");
        lessonList.add(lesson);

        lesson = new Lesson("Lesson 5", "2015");
        lessonList.add(lesson);

        lesson = new Lesson("Lesson 6", "2015");
        lessonList.add(lesson);

        lesson = new Lesson("Lesson7", "2009");
        lessonList.add(lesson);

        lesson = new Lesson("Lesson 8 ", "2009");
        lessonList.add(lesson);
        lesson = new Lesson("Lesson 8 ", "2009");
        lessonList.add(lesson);
        lesson = new Lesson("Lesson 9 ", "2009");
        lessonList.add(lesson);
        lesson = new Lesson("Lesson 10 ", "2009");
        lessonList.add(lesson);
        lesson = new Lesson("Lesson 11", "2009");
        lessonList.add(lesson);
        lesson = new Lesson("Lesson 12", "2009");
        lessonList.add(lesson);
        lesson = new Lesson("Lesson 13" , "2009");
        lessonList.add(lesson);
        lesson = new Lesson("Lesson 14 ", "2009");
        lessonList.add(lesson);
        lesson = new Lesson("Lesson 15 ", "2009");
        lessonList.add(lesson);
        lesson = new Lesson("Lesson 16 ", "2009");
        lessonList.add(lesson);
        lesson = new Lesson("Lesson 17 ", "2009");
        lessonList.add(lesson);  lesson = new Lesson("Lesson 18 ", "2009");
        lessonList.add(lesson);  lesson = new Lesson("Lesson 19 ", "2009");
        lessonList.add(lesson);  lesson = new Lesson("Lesson 20", "2009");
        lessonList.add(lesson);  lesson = new Lesson("Lesson 21 ", "2009");
        lessonList.add(lesson);


        mAdapter.notifyDataSetChanged();
    }

}
