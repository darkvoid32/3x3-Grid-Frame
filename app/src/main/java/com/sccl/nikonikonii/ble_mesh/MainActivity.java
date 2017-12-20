package com.sccl.nikonikonii.ble_mesh;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7, mButton8, mButton9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar mActionBar = getSupportActionBar();
        mActionBar.hide();

        setUpXMLVariables();
    }

    private void setUpXMLVariables() {
        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
        mButton4 = findViewById(R.id.button4);
        mButton5 = findViewById(R.id.button5);
        mButton6 = findViewById(R.id.button6);
        mButton7 = findViewById(R.id.button7);
        mButton8 = findViewById(R.id.button8);
        mButton9 = findViewById(R.id.button9);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
        mButton7.setOnClickListener(this);
        mButton8.setOnClickListener(this);
        mButton9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                break;
            case R.id.button2:
                break;
            case R.id.button3:
                break;
            case R.id.button4:
                break;
            case R.id.button5:
                break;
            case R.id.button6:
                break;
            case R.id.button7:
                break;
            case R.id.button8:
                break;
            case R.id.button9:
                break;
            default:
                break;
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        LinearLayout.LayoutParams buttonLp = new LinearLayout.LayoutParams(mButton1.getMeasuredWidth(), mButton1.getMeasuredWidth());
        buttonLp.setMargins(15, 15, 15, 15);
        mButton1.setLayoutParams(buttonLp);
        mButton1.requestLayout();
        mButton2.setLayoutParams(buttonLp);
        mButton2.requestLayout();
        mButton3.setLayoutParams(buttonLp);
        mButton3.requestLayout();
        mButton4.setLayoutParams(buttonLp);
        mButton4.requestLayout();
        mButton5.setLayoutParams(buttonLp);
        mButton5.requestLayout();
        mButton6.setLayoutParams(buttonLp);
        mButton6.requestLayout();
        mButton7.setLayoutParams(buttonLp);
        mButton7.requestLayout();
        mButton8.setLayoutParams(buttonLp);
        mButton8.requestLayout();
        mButton9.setLayoutParams(buttonLp);
        mButton9.requestLayout();

        LinearLayout mButtonLinearLayout = findViewById(R.id.buttonGridLL);
        RelativeLayout.LayoutParams llLp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        llLp.addRule(RelativeLayout.CENTER_IN_PARENT);
        mButtonLinearLayout.setLayoutParams(llLp);
        mButtonLinearLayout.requestLayout();
    }
}
