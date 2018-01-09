package fauzi.hilmy.quizprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etName, etNis, etMajor;
    Button btnSubmit;
    TextView lblUsername, lblName, lblNIS, lblMajor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblUsername = (TextView) findViewById(R.id.lblUsername);
        lblName = (TextView) findViewById(R.id.lblName);
        lblNIS = (TextView) findViewById(R.id.lblNIS);
        lblMajor = (TextView) findViewById(R.id.lblMajor);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etName = (EditText) findViewById(R.id.etName);
        etNis = (EditText) findViewById(R.id.etNis);
        etMajor = (EditText) findViewById(R.id.etMajor);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nUserNama = etUsername.getText().toString();
                String nNama = etName.getText().toString();
                String nNis = etNis.getText().toString();
                String nMajor = etMajor.getText().toString();

                lblUsername.setText("Your Username Is: " + nUserNama);
                lblName.setText("Your Name Is : " + nNama);
                lblNIS.setText("Your Nis Is : " + nNis);
                lblMajor.setText("Your Major Is: " + nMajor);
                
            }
        });
    }
}
