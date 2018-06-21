package com.example.user.restaurant_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Caculater extends AppCompatActivity {
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btB,btC,btAdd,btSub,btMul,btDiv,btEqu;
    TextView textShow,textAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculater);
        bt0=(Button)findViewById(R.id.button0);
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt4=(Button)findViewById(R.id.button4);
        bt5=(Button)findViewById(R.id.button5);
        bt6=(Button)findViewById(R.id.button6);
        bt7=(Button)findViewById(R.id.button7);
        bt8=(Button)findViewById(R.id.button8);
        bt9=(Button)findViewById(R.id.button9);

        btEqu=(Button)findViewById(R.id.buttonEqu);
        btAdd=(Button)findViewById(R.id.buttonAdd);
        btSub=(Button)findViewById(R.id.buttonSub);
        btMul=(Button)findViewById(R.id.buttonMul);
        btDiv=(Button)findViewById(R.id.buttonDiv);
        btB=(Button)findViewById(R.id.buttonB);
        btC=(Button)findViewById(R.id.buttonC);

        textShow=(TextView) findViewById(R.id.textView2);
        textAns=(TextView) findViewById(R.id.textView4);

        bt0.setOnClickListener(myListener);
        bt1.setOnClickListener(myListener);
        bt2.setOnClickListener(myListener);
        bt3.setOnClickListener(myListener);
        bt4.setOnClickListener(myListener);
        bt5.setOnClickListener(myListener);
        bt6.setOnClickListener(myListener);
        bt7.setOnClickListener(myListener);
        bt8.setOnClickListener(myListener);
        bt9.setOnClickListener(myListener);
        btAdd.setOnClickListener(myListener);
        btSub.setOnClickListener(myListener);
        btMul.setOnClickListener(myListener);
        btDiv.setOnClickListener(myListener);
        btB.setOnClickListener(myListener);
        btC.setOnClickListener(myListener);
        btEqu.setOnClickListener(myListener);
    }
    private String st;
    private Button.OnClickListener myListener=new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            Button btnTemp=(Button)findViewById(v.getId());
            if(btnTemp.getText().toString().equals("B")){
                st=st.substring(0,st.length()-1);
            }else if(btnTemp.getText().toString().equals("C")){
                st="";
            }else if(btnTemp.getText().toString().equals("=")){
                try {
                    for (int i = 0; i < st.length(); i++) {
                        if (st.charAt(i) == '*' || st.charAt(i) == '/') {
                            String f = "", b = "";
                            int j;
                            for (j = i - 1; j >= 0; j--) {
                                if (st.charAt(j) == '*' || st.charAt(j) == '/' || st.charAt(j) == '-' || st.charAt(j) == '+') break;
                                else f = st.charAt(j) + f;
                            }
                            int k;
                            for (k = i + 1; k < st.length(); k++) {
                                if (st.charAt(k) == '*' || st.charAt(k) == '/' || st.charAt(k) == '-' || st.charAt(k) == '+') break;
                                else b = b + st.charAt(k);
                            }
                            int temp = 0;
                            if (st.charAt(i) == '*') temp = Integer.parseInt(f) * Integer.parseInt(b);
                            else temp = Integer.parseInt(f) / Integer.parseInt(b);
                            st = st.substring(0, j + 1) + temp + st.substring(k, st.length());
                            i=j;
                        }
                    }
                    if (st.charAt(0) != '-') st = "+" + st;
                    int ans = 0;
                    for (int i = 0; i < st.length(); ) {
                        if (st.charAt(i) == '+' || st.charAt(i) == '-') {
                            String temp = "";
                            int j;
                            for (j = i + 1; j < st.length(); j++) {
                                if (st.charAt(j) == '-' || st.charAt(j) == '+') break;
                                else temp = temp + st.charAt(j);
                            }
                            if (st.charAt(i) == '+') ans = ans + Integer.parseInt(temp);
                            else ans = ans - Integer.parseInt(temp);
                            i=j;
                        }
                    }
                    st="";
                    textShow.setText(st);
                    textAns.setText(Integer.toString(ans));
                }catch(Exception ex){
                    textShow.setText(ex.toString());
                }

            }else{
                st=textShow.getText().toString()+btnTemp.getText().toString();
            }
            textShow.setText(st);
        }
    };
}
