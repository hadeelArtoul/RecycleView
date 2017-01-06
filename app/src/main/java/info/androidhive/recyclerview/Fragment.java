package info.androidhive.recyclerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hadeel on 1/6/2017.
 */

public class Fragment extends android.support.v4.app.Fragment {


        public Fragment() {
            // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View rootView = inflater.inflate(R.layout.fragment, container, false);

            String Lesson = getActivity().getIntent().getExtras().getString("LessonNum");
            String Date = getActivity().getIntent().getExtras().getString("LessonDate");
            int Img = getActivity().getIntent().getExtras().getInt("LessonImg");
            String Dec = getActivity().getIntent().getExtras().getString("LessonDec");

            TextView txtLesson=(TextView)rootView.findViewById(R.id.getLesson);
            txtLesson.setText(Lesson);

            TextView txtDate=(TextView)rootView.findViewById(R.id.GetDate);
            txtDate.setText(Date);

            TextView Title=(TextView)rootView.findViewById(R.id.GetTitle);
            Title.setText(Lesson);

            ImageView LinkImg=(ImageView)rootView.findViewById(R.id.GetImg);
            LinkImg.setImageResource(Img);

            TextView txtDec=(TextView)rootView.findViewById(R.id.Deteals);
            String Detealsnew="";
            for(int i=0;i<10;i++){
                Detealsnew+=" And "+Dec;
            }

            txtDec.setText(Detealsnew);


            return rootView;
        }


}
