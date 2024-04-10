package ro.pub.cs.systems.eim.practicaltest01var05;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PracticalTest01Var05MainActivity extends AppCompatActivity {

    Button tLeft, tRight, bLeft, bRight, center, nextActivity;
    TextView textView;
    int nrClicks = 0;

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

        if(savedInstanceState != null) {
            nrClicks = savedInstanceState.getInt("clicks");
            //Toast.makeText(this, String.valueOf(nrClicks), Toast.LENGTH_SHORT).show();
        } else {
            nrClicks = 0;
        }

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

                nrClicks += 1;
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

                nrClicks += 1;
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

                nrClicks += 1;
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

                nrClicks += 1;
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

                nrClicks += 1;
            }
        });

        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PracticalTest01Var05SecondaryActivity.class);
                intent.putExtra("str", String.valueOf(textView.getText()));
                textView.setText("");
                startActivityForResult(intent, 111);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == 111) {
            if (resultCode == 1) {
                Toast.makeText(this, "Verify", Toast.LENGTH_SHORT).show();
            } else if (resultCode == 2) {
                Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show();
            }
        }
    }

    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("clicks", nrClicks);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        nrClicks = savedInstanceState.getInt("clicks");
        Toast.makeText(this, String.valueOf(nrClicks), Toast.LENGTH_SHORT).show();
    }
}