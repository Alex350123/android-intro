package mg.x261.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView activityListView;

    private String[] activityNames = {"ActivityCheckbox", "ActivityDatePicker", "ActivityDatePickerDialog",
            "ActivityListView", "ActivityProgressBar", "ActivityRadioButton", "ActivityRating",
            "ActivityRunnableThreadHandler", "ActivityScrollView", "ActivitySpinner", "ActivitySwitch",
            "ActivityTimePicker", "LoadImage", "MainButton", "MainCalendarView", "MainDialog",
            "MainEditText", "MainImageView", "MainLinearLayout", "MainRelativeLayout", "MainSeekBar",
            "MainTable", "MainTextView", "MainToast"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1: Find the activity list view in the layout by id (R.id.activity_list_view).
        ListView myListView = (ListView) findViewById(R.id.activity_list_view);
        // TODO 2: Create an array adapter with the activity names and the layout for the item view.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,activityNames);
        // TODO 3: Set the adapter to the activity list view.
        myListView.setAdapter(adapter);
        // TODO 4:
        //   Set an item click listener for the activity list view.
        //   In the listener, use a switch statement to start the corresponding activity based on the name of the clicked item.
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String result=((TextView)view).getText().toString();
                switch (result){
                    case "ActivityCheckbox":
                        Intent intentCheckbox = new Intent(MainActivity.this,ActivityCheckbox.class);
                        startActivity(intentCheckbox);
                        break;

                    case "ActivityDatePicker":
                        Intent intentDatePicker = new Intent(MainActivity.this,ActivityDatePicker.class);
                        startActivity(intentDatePicker);
                        break;

                    case "ActivityDatePickerDialog":
                        Intent intentDatePickerDialog = new Intent(MainActivity.this,ActivityDatePickerDialog.class);
                        startActivity(intentDatePickerDialog);
                        break;

                    case "ActivityListView":
                        Intent intentListView = new Intent(MainActivity.this,ActivityListView.class);
                        startActivity(intentListView);
                        break;

                    case "ActivityProgressBar":
                        Intent intentProgressBar = new Intent(MainActivity.this,ActivityProgressBar.class);
                        startActivity(intentProgressBar);
                        break;

                    case "ActivityRadioButton":
                        Intent intentRadioButton = new Intent(MainActivity.this, ActivityRadioButton.class);
                        startActivity(intentRadioButton);
                        break;

                    case "ActivityRating":
                        Intent intentRating = new Intent(MainActivity.this, ActivityRating.class);
                        startActivity(intentRating);
                        break;

                    case "ActivityRunnableThreadHandler":
                        Intent intentRTH = new Intent(MainActivity.this, ActivityRunnableThreadHandler.class);
                        startActivity(intentRTH);
                        break;

                    case "ActivityScrollView":
                        Intent intentScollView = new Intent(MainActivity.this, ActivityScrollView.class);
                        startActivity(intentScollView);
                        break;

                    case "ActivitySpinner":
                        Intent intentSpinner = new Intent(MainActivity.this, ActivitySpinner.class);
                        startActivity(intentSpinner);
                        break;

                    case "ActivitySwitch":
                        Intent intentSwitch = new Intent(MainActivity.this, ActivitySwitch.class);
                        startActivity(intentSwitch);
                        break;

                    case "ActivityTimePicker":
                        Intent intentTimePicker = new Intent(MainActivity.this, ActivityTimePicker.class);
                        startActivity(intentTimePicker);
                        break;

                    case "LoadImage":
                        Intent intentLoadImage = new Intent(MainActivity.this, LoadImage.class);
                        startActivity(intentLoadImage);
                        break;

                    case "MainButton":
                        Intent intentMainButton = new Intent(MainActivity.this, MainButton.class);
                        startActivity(intentMainButton);
                        break;

                    case "MainCalendarView":
                        Intent intentCalendar = new Intent(MainActivity.this, MainCalendarView.class);
                        startActivity(intentCalendar);
                        break;

                    case "MainDialog":
                        Intent intentMainDialog = new Intent(MainActivity.this, MainDialog.class);
                        startActivity(intentMainDialog);
                        break;

                    case "MainEditText":
                        Intent intentEditText = new Intent(MainActivity.this, MainEditText.class);
                        startActivity(intentEditText);
                        break;

                    case "MainImageView":
                        Intent intentImageView = new Intent(MainActivity.this, MainImageView.class);
                        startActivity(intentImageView);
                        break;

                    case "MainLinearLayout":
                        Intent intentLinearLayout = new Intent(MainActivity.this, MainLinearLayout.class);
                        startActivity(intentLinearLayout);
                        break;

                    case "MainRelativeLayout":
                        Intent intentRelativeLayout = new Intent(MainActivity.this, MainRelativeLayout.class);
                        startActivity(intentRelativeLayout);
                        break;

                    case "MainSeekBar":
                        Intent intentSeekBar = new Intent(MainActivity.this, MainSeekBar.class);
                        startActivity(intentSeekBar);
                        break;

                    case "MainTable":
                        Intent intentTable = new Intent(MainActivity.this, MainTable.class);
                        startActivity(intentTable);
                        break;

                    case "MainTextView":
                        Intent intentTextView = new Intent(MainActivity.this, MainTextView.class);
                        startActivity(intentTextView);
                        break;

                    case "MainToast":
                        Intent intentToast = new Intent(MainActivity.this, MainToast.class);
                        startActivity(intentToast);
                        break;
                }
            }

    }
}
