package android.project.com.ticktock;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SetActivity extends AppCompatActivity {

    TextView time, date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

//    @Override
//    public void onTimeSet(RadialPickerLayout view, int hourOfDay, int minute) {
//
//        TextView timeTextView = (TextView) findViewById(R.id.time);
//        String time = "You picked the following time: "+hourOfDay+"h"+minute;
//        timeTextView.setText(time);
//    }
//
//    @Override
//    private void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
//        TextView dateTextView = (TextView) findViewById(R.id.date);
//        String date = "You picked the following date: "+dayOfMonth+"/"+(monthOfYear+1)+"/"+year;
//        dateTextView.setText(date);
//    }

}
