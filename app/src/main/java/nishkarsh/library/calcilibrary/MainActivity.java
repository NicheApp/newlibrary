package nishkarsh.library.calcilibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText ed;
Button submit;
TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=findViewById(R.id.ed1);
        submit=findViewById(R.id.submit);
        show =findViewById(R.id.show);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String s= ed.getText().toString();
               Calculator c= new Calculator();
                 int data= c.calculate(s);
               show.setText("Result: "+data);
            }
        });

    }
}