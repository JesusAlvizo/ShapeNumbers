package com.jesusalvizo.numbers4;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valIn;
    private Button btnAns;
    private TextView ansTgr;
    private TextView ansSqr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "BebasNeue.ttf");
        TextView myTextview = (TextView)findViewById(R.id.textView);
        myTextview.setTypeface(myTypeface);
    }

    public void checkVariable(View view) {
        EditText valInput = (EditText) findViewById(R.id.valueInput);
        TextView sqrMessage = (TextView) findViewById(R.id.ansSqr);
        TextView tgrMessage = (TextView) findViewById(R.id.ansTgr);

        String sNumber = valInput.getText().toString().trim();
        Integer number = Integer.parseInt(sNumber);

        String message;
        String message1;

        if (esCuadrado(number)) {
            message1 = sNumber + " is a square number";
        } else {

                message1 = sNumber + " is not a square number";

        }

        if (esTriangular(number)) {
            message = sNumber + " is a triangular number";
        } else {

                message = sNumber + " is not a triangular number";

            }

        tgrMessage.setText(message);
        sqrMessage.setText(message1);
    }


    public boolean esTriangular(int n){
        int x = 1;
        int tgrValue = 1;

        while (tgrValue < n) {
            x++;
            tgrValue += x;
        }

        if (tgrValue == n) {
            return true;
        } else {
            return false;
        }

    }


    public boolean esCuadrado(int n) {
        double squareRoot = Math.sqrt(n);

        if (squareRoot == Math.floor(squareRoot)) {
            return true;
        } else {
            return false;
        }
    }

}
