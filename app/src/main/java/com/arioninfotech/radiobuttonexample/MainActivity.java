package com.arioninfotech.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton gender;

    TextView txtSelectedGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
        txtSelectedGender=(TextView)findViewById(R.id.txtSelectedGender);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                gender  = radioGroup.findViewById(checkedId);

                txtSelectedGender.setText("Selected Gender :"+gender.getText().toString());

            }
        });
    }
}
