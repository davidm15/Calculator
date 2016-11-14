package at.fh.swengb.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.util.logging.Logger.global;

public class DisplayBitActivity extends AppCompatActivity {

    private EditText bit;
    private EditText getByte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_bit);

        EditText bit = (EditText) findViewById(R.id.bitMode);
        EditText getByte = (EditText) findViewById(R.id.byteMode);


    }


    //This function only shows results when values in the text field(s) change.
    public void calcUnits(View view) {

        EditText bit = (EditText) findViewById(R.id.bitMode);
        String num1String = bit.getText().toString();


        EditText getByte = (EditText) findViewById(R.id.byteMode);
        String num2String = getByte.getText().toString();

        //These fields only show a result when the "result-field" is empty
        if ((! TextUtils.isEmpty(num1String)) && (TextUtils.isEmpty(num2String))) {
            double num1 = Double.parseDouble(num1String);
            double result = num1/8;
            getByte.setText(String.valueOf(result));

        }

        if ((! TextUtils.isEmpty(num2String)) && (TextUtils.isEmpty(num1String))) {
            double num2 = Double.parseDouble(num2String);
            double result2 = num2*8;
            bit.setText(String.valueOf(result2));
        }

        }


}

