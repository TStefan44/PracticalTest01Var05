package ro.pub.cs.systems.eim.practicaltest01var05;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PracticalTest01Var05MainActivity extends AppCompatActivity {

    Button tLeft, tRight, bLeft, bRight, center, nextActivity;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var05_main);

        tLeft = findViewById(R.id.buttonTopLeft);
        tRight = findViewById(R.id.buttonTopRight);
        bLeft = findViewById(R.id.buttonBottomLeft);
        bRight = findViewById(R.id.buttonBottomRight);
        center = findViewById(R.id.buttonCenter);
        nextActivity = findViewById(R.id.buttonSecondaryActivity);

        textView = findViewById(R.id.text);

        tLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(textView.getText()).equals("")) {
                    textView.setText("Top Left");
                } else {
                    String str = String.valueOf(textView.getText());
                    str += ", Top Left";
                    textView.setText(str);
                }
            }
        });

        tRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(textView.getText()).equals("")) {
                    textView.setText("Top Right");
                } else {
                    String str = String.valueOf(textView.getText());
                    str += ", Top Right";
                    textView.setText(str);
                }
            }
        });

        center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(textView.getText()).equals("")) {
                    textView.setText("Center");
                } else {
                    String str = String.valueOf(textView.getText());
                    str += ", Center";
                    textView.setText(str);
                }
            }
        });

        bLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(textView.getText()).equals("")) {
                    textView.setText("Bottom Left");
                } else {
                    String str = String.valueOf(textView.getText());
                    str += ", Bottom Left";
                    textView.setText(str);
                }
            }
        });

        bRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (String.valueOf(textView.getText()).equals("")) {
                    textView.setText("Bottom Right");
                } else {
                    String str = String.valueOf(textView.getText());
                    str += ", Bottom Right";
                    textView.setText(str);
                }
            }
        });
    }
}