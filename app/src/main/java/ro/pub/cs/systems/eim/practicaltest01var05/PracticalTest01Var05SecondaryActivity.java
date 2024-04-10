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

public class PracticalTest01Var05SecondaryActivity extends AppCompatActivity {

    Button cancel, verify;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var05_secondary);

        cancel = findViewById(R.id.buttonCancel);
        verify = findViewById(R.id.buttonVerify);

        textView = findViewById(R.id.text2);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");
        textView.setText(str);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), PracticalTest01Var05MainActivity.class);
                setResult(1, intent1);
                finish();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), PracticalTest01Var05MainActivity.class);
                setResult(2, intent1);
                finish();
            }
        });
    }
}