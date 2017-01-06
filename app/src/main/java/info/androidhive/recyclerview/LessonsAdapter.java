package info.androidhive.recyclerview;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.MyViewHolder> {

    private List<Lesson> lessonsList;

    public LessonsAdapter(Lesson[] lessonsList, MainActivity2 mainActivity) {

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            year = (TextView) view.findViewById(R.id.year);
        }
    }


    public LessonsAdapter(List<Lesson> lessonsList) {
        this.lessonsList = lessonsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lesson_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Lesson lesson = lessonsList.get(position);
        holder.title.setText(lesson.getTitle());
        holder.year.setText(lesson.getYear());
        final View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent().setClass(v.getContext(), MainActivity.class);

                intent.putExtra("LessonNum", lessonsList.get(position).getTitle());
                intent.putExtra("LessonDate", lessonsList.get(position).getYear());

                v.getContext().startActivity(intent);

            }
        };
    }

    @Override
    public int getItemCount() {
        return lessonsList.size();
    }
}
