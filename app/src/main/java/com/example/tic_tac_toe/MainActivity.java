package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,restart;
    TextView result;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }
    //before we used to have different functionality for different buttons but now we have similar function
//    to all buttons so we are using On click method instead of on click listner
    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        result = findViewById(R.id.txtresult);


    }
    int count = 0;
    public void check(View v){

        Button btnCurrent = (Button) v;
        count ++;
        if(btnCurrent.getText().toString() == "") {
        if(i == 1){
            btnCurrent.setText("O");
            i=0;
        }else {
            btnCurrent.setText("X");
            i = 1;
          }
        }


        if(count> 4){
            b1 = btn1.getText().toString();
            b2 = btn2.getText().toString();
            b3 = btn3.getText().toString();
            b4 = btn4.getText().toString();
            b5 = btn5.getText().toString();
            b6 = btn6.getText().toString();
            b7 = btn7.getText().toString();
            b8 = btn8.getText().toString();
            b9 = btn9.getText().toString();

                    if (b1.equals(b2) && b2.equals(b3) && !b3.equals("")) {
                        result.setText("Player with sign " + b1 + " has won the game  🫡 ");
                        onRestart();
                    } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                        result.setText("Player with sign " + b4 + " has won the game  🫡 ");
                    } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                        result.setText("Player with sign " + b7 + " has won the game  🫡 ");

                    } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                        result.setText("Player with sign " + b1 + " has won the game  🫡 ");

                    } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                        result.setText("Player with sign " + b2 + " has won the game  🫡 ");

                    } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                        result.setText("Player with sign " + b3 + " has won the game  🫡 ");

                    } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                        result.setText("Player with sign " + b1 + " has won the game  🫡 ");

                    } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                        result.setText("Player with sign " + b3 + " has won the game  🫡 ");
                    }else if(count == 9){
                        result.setText("ohh ! , Its a tie between both of you  😶 ");
            }
                }



            restart = findViewById(R.id.restart);
            restart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    restart();
                }
            });



        }
    public void restart(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        result.setText("");
    }


    }
