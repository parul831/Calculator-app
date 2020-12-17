package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double n1,n2;
    TextView num_palate;
    Button num_1,num_2,num_3,num_4,num_5,num_6,num_7,num_8,num_9,num_0,btn_add,btn_sub,btn_mul,btn_div,btn_decimal, btn_percentage, btn_clear, btn_equals;
    boolean add, sub, mul, div, per, decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_0=(Button)findViewById(R.id.num0);
        num_1=(Button)findViewById(R.id.num1);
        num_2=(Button)findViewById(R.id.num2);
        num_3=(Button)findViewById(R.id.num3);
        num_4=(Button)findViewById(R.id.num4);
        num_5=(Button)findViewById(R.id.num5);
        num_6=(Button)findViewById(R.id.num6);
        num_7=(Button)findViewById(R.id.num7);
        num_8=(Button)findViewById(R.id.num8);
        num_9=(Button)findViewById(R.id.num9);
        btn_add=(Button)findViewById(R.id.add);
        btn_sub=(Button)findViewById(R.id.sub);
        btn_mul=(Button)findViewById(R.id.multiply);
        btn_div=(Button)findViewById(R.id.div);
        btn_percentage=(Button)findViewById(R.id.percent);
        btn_decimal=(Button)findViewById(R.id.dec);
        btn_clear=(Button)findViewById(R.id.clear);
        btn_equals=(Button)findViewById(R.id.equals);
        num_palate= (TextView) findViewById(R.id.numPalate);

        num_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_palate.setText(num_palate.getText()+"0");
            }
        });

        num_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_palate.setText(num_palate.getText()+"1");
            }
        });

        num_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_palate.setText(num_palate.getText()+"2");
            }
        });

        num_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_palate.setText(num_palate.getText()+"3");
            }
        });

        num_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_palate.setText(num_palate.getText()+"4");
            }
        });

        num_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_palate.setText(num_palate.getText()+"5");
            }
        });

        num_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_palate.setText(num_palate.getText()+"6");
            }
        });

        num_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_palate.setText(num_palate.getText()+"7");
            }
        });

        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_palate.setText(num_palate.getText()+"8");
            }
        });

        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_palate.setText(num_palate.getText()+"9");
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_palate.setText("");
                n1=0.0;
                n2=0.0;
            }
        });

        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(decimal)
                {
                }
                else{
                    num_palate.setText(num_palate.getText() + ".");
                    decimal=true;
                }
            }
        });

        btn_percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num_palate.getText().length() != 0) {
                    n1 = Float.parseFloat(num_palate.getText() + "");
                    per = true;
                    decimal = false;
                    num_palate.setText(null);
                }
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (num_palate.getText().length() != 0) {
                        n1 = Float.parseFloat(num_palate.getText() + "");
                        div = true;
                        decimal = false;
                        num_palate.setText(null);
                    }

            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num_palate.getText().length() != 0) {
                    n1 = Float.parseFloat(num_palate.getText() + "");
                    mul = true;
                    decimal = false;
                    num_palate.setText(null);
                }
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num_palate.getText().length() != 0) {
                    n1 = Float.parseFloat(num_palate.getText() + "");
                    sub = true;
                    decimal = false;
                    num_palate.setText(null);
                }
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num_palate.getText().length() != 0) {
                    n1 = Float.parseFloat(num_palate.getText() + "");
                    add = true;
                    decimal = false;
                    num_palate.setText(null);
                }
            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (add || sub || mul || div || per) {
                    n2 = Float.parseFloat(num_palate.getText() + "");
                }

                if (add) {

                    num_palate.setText(n1 + n2 + "");
                    add = false;
                }

                if (sub) {

                    num_palate.setText(n1 - n2 + "");
                    sub = false;
                }

                if (mul) {
                    num_palate.setText(n1 * n2 + "");
                    mul = false;
                }

                if (div) {
                    num_palate.setText(n1 / n2 + "");
                    div = false;
                }
                if (per) {
                    num_palate.setText(n1 % n2 + "");
                    per = false;
                }

            }
        });
    }
}