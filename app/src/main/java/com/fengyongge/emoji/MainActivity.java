package com.fengyongge.emoji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.fengyongge.emoji.emoji.EmojiEditText;
import com.fengyongge.emoji.emoji.EmojiTextView;

public class MainActivity extends AppCompatActivity {

    EmojiEditText et;
    EmojiTextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EmojiEditText) findViewById(R.id.et);
        tv = (EmojiTextView) findViewById(R.id.tv);
        et.addTextChangedListener(watcher);
    }


    private TextWatcher watcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // TODO Auto-generated method stub

            tv.setText(et.getText().toString());

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count,
                                      int after) {
            // TODO Auto-generated method stub

        }
    };
}
