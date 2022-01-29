package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        //User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        // User can tap the button to change the color of the background
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // #fff2cc - turquoise
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.turquoise));
            }
        });

        // User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        // User can tap on the background view to reset all views to defult settings

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1. Reset the text to "Hello from Toni" id - @id/text
                textView.setText("Hello from Toni");
                // 2. Reset the color of the text to original color - black, text - @id/text
                textView.setTextColor(getResources().getColor(R.color.black));
                // 3. reset the background color - R.color.light_blue
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_blue));
            }
        });

        // User can tap the "Change text string" button to update the label with the text from the text field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text view to what`s in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                // If the text field is empty, uodate label with default text string.
                if(userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text!");
                }
                else {
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}