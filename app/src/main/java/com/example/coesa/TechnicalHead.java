package com.example.coesa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class TechnicalHead extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button button;
    RadioGroup rg;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_head);

        button=(Button)findViewById(R.id.sub1);
        rg=(RadioGroup)findViewById(R.id.group);

        Spinner spinner = findViewById(R.id.spinner22);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Post, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void rbclick(View v)
    {
        int radiobuttonid=rg.getCheckedRadioButtonId();
        rb=(RadioButton)findViewById(radiobuttonid);
        Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_LONG).show();}


}
