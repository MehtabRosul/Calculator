package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.myapplication.databinding.ActivityMainBinding;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsubstract,btnmultiply,btndivide,btndot,btnAC,btnbackspace,btnequal;
    TextView ed1;
    float Res1,Res2;
    boolean add,substract,multiply,divide;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private int editText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsubstract = (Button) findViewById(R.id.btnsubstract);
        btnmultiply = (Button) findViewById(R.id.btnmultiply);
        btndivide = (Button) findViewById(R.id.btndivide);
        btndot = (Button) findViewById(R.id.btndot);
        btnAC = (Button) findViewById(R.id.btnAC);
        btnbackspace = (Button) findViewById(R.id.btnbackspace);
        btnequal = (Button) findViewById(R.id.btnequal);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ed1.setText(ed1.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText(ed1.getText() + "0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + ".");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");

                } else {
                    Res1 = Float.parseFloat(ed1.getText() + "");
                    add = true;
                    ed1.setText(null);
                }
            }
        });
        btnsubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");

                } else {
                    Res1 = Float.parseFloat(ed1.getText() + "");
                    substract = true;
                    ed1.setText(null);
                }
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");

                } else {
                    Res1 = Float.parseFloat(ed1.getText() + "");
                    multiply = true;
                    ed1.setText(null);
                }

            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");

                } else {
                    Res1 = Float.parseFloat(ed1.getText() + "");
                    divide = true;
                    ed1.setText(null);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res2 = Float.parseFloat(ed1.getText() + "");
                if (add == true) {
                    ed1.setText(Res1 + Res2 + "");
                    add = false;
                }
                if (substract == true) {
                    ed1.setText(Res1 - Res2 + "");
                    add = false;
                }
                if (multiply == true) {
                    ed1.setText(Res1 * Res2 + "");
                    add = false;
                }
                if (divide == true) {
                    ed1.setText(Res1 / Res2 + "");
                    add = false;
                    Context rhino = Context.enter();
                    rhino.setOptimizationLevel(-1);

                    Scriptable scriptable=rhino.initStandardObjects();
                    Res2 = Float.parseFloat(ed1.getText() + "");


                }
            }


        });
                btnbackspace.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String val=ed1.getText().toString();
                        int input=val.length();
                        if (val.length()>0)
                        {
                            ed1.setText(val.substring(0,input-1));
                        }
                   }
                });

    }    }


        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


