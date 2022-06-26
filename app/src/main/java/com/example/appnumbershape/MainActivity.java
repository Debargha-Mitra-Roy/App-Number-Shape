package com.example.appnumbershape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {

        int number;

        public boolean isTriangular() {

            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < number) {

                x++;

                triangularNumber = triangularNumber + x;
            }

            if (triangularNumber == number) {

                return true;
            } else {

                return false;
            }

        }

        public boolean isSquare() {

            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {

                return true;
            } else {

                return false;
            }
        }
    }

    public void testNumber(View view) {

        Log.i("Info", "Button Pressed!");

        EditText editText = (EditText) findViewById(R.id.editText);

        String message;

        if (editText.getText().toString().isEmpty()) {

            message = "Please enter a Number";
        } else {

            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(editText.getText().toString());

            message = editText.getText().toString();

            if (myNumber.isSquare() && myNumber.isTriangular()) {

                message += " is Square and Triangular Number";
            } else if (myNumber.isTriangular()) {

                message += " is Triangular but not Square";
            } else if (myNumber.isSquare()) {

                message += " is Square but not Triangular";
            } else {

                message += " is neither Triangular nor Square";
            }
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}