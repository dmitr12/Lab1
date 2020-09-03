package dyrda.fit.bstu.by.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import dyrda.fit.bstu.by.lab1.text.SomeClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int count = 0; count < 10; count++) {
            Log.d("MainActivity","counter="+count);
        }
    }

    private void displayText() {
        SomeClass sc=new SomeClass();
        TextView nt=findViewById(R.id.newtest);
        nt.setText(sc.getValue());
    }
}