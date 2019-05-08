package com.example.tatastrive.checkboxbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 CheckBox Ac,jc,pc,pyc,uc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ac=findViewById(R.id.androidcheckBox);
       Ac.setOnClickListener(this);

        jc=findViewById(R.id.javacheckBox);
        jc.setOnClickListener(this);

        pc=findViewById(R.id.PhpcheckBox);
        pc.setOnClickListener(this);

        pyc=findViewById(R.id.PythonCheckBox);
        pyc.setOnClickListener(this);

        uc=findViewById(R.id.UnityCheckBox);
        uc.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.androidcheckBox:
                if(Ac.isChecked())
                    Toast.makeText(getApplicationContext(),"Android",Toast.LENGTH_SHORT).show();
                break;
            case R.id.javacheckBox:
                if(jc.isChecked())
                    Toast.makeText(getApplicationContext(),"Java",Toast.LENGTH_SHORT).show();
                break;
            case R.id.PhpcheckBox:
                if(pc.isChecked())
                    Toast.makeText(getApplicationContext(),"PHP",Toast.LENGTH_SHORT).show();
                break;
            case R.id.PythonCheckBox:
                if(pyc.isChecked())
                    Toast.makeText(getApplicationContext(),"Python",Toast.LENGTH_SHORT).show();
                break;
            case R.id.UnityCheckBox:
                if(uc.isChecked())
                    Toast.makeText(getApplicationContext(),"Unity 3D",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
