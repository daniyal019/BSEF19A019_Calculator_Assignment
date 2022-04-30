package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     Button btn1,btn17,btn18,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn10,btn11,btn12,btn13,btn14,btn15;
     EditText text;
     Float a,b,result;
     boolean addition,subtraction,multiplication,divison,mod;
     void val1()
     {
         a=Float.parseFloat(text.getText()+"");
     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn10=(Button)findViewById(R.id.btn10);
        btn11=(Button)findViewById(R.id.btn11);
        btn12=(Button)findViewById(R.id.btn12);
        btn13=(Button)findViewById(R.id.btn13);
        btn14=(Button)findViewById(R.id.btn14);
        btn15=(Button)findViewById(R.id.btn15);

        btn17=(Button)findViewById(R.id.btn17);
        btn18=(Button)findViewById(R.id.btn18);
        text=(EditText)findViewById(R.id.txt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"9");
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text==null)
                {
                    text.setText("");
                }
                else
                {
                    val1();
                    multiplication=divison=subtraction=mod=false;
                    addition=true;
                    text.setText(null);
                }

            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+".");
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(text==null)
                {
                    text.setText("");
                }
                else
                {
                    val1();
                    multiplication=divison=subtraction=addition=false;
                    mod=true;
                    text.setText(null);
                }
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text == null) {
                    text.setText("");
                } else {
                    val1();
                    multiplication = divison = addition=mod = false;
                    subtraction = true;
                    text.setText(null);
                }
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text == null) {
                    text.setText("");
                } else {
                    val1();
                    addition = divison = mod=subtraction = false;
                    multiplication = true;
                    text.setText(null);
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(text.getText()+"0");
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text==null)
                {
                    text.setText("");
                }
                else
                {
                    val1();
                    multiplication=  addition=mod=subtraction=false;
                    divison  =true;
                    text.setText(null);
                }
            }
        });




        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=null;
                text.setText(null);
                addition=divison= multiplication=subtraction=mod=false;
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(addition)
               {
                   text.setText(a+ Float.parseFloat(text.getText()+"")+"");
               }
               else if(subtraction)
                {
                    text.setText(a-Float.parseFloat(text.getText()+"")+"");
                }


               else if(multiplication)
               {
                   text.setText(a*Float.parseFloat(text.getText()+"")+"");
               }

               else if(divison)
               {
                   text.setText(a/Float.parseFloat(text.getText()+"")+"");
               }

               else if(mod)
               {
                   text.setText(a%Float.parseFloat(text.getText()+"")+"");
               }
            }
        });




    }
}