package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView pl1;
private TextView pl2;
private TextView Result;
private Button B1;
private Button B2;
private Button B3;
private Button B4;
private Button B5;
private Button B6;
private Button B7;
private Button B8;
private Button B9;
private Button Restart;
private int k = 1;
private int f = 3;
private int B[] = new int [9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = findViewById(R.id.B1);
        B2 = findViewById(R.id.B2);
        B3 = findViewById(R.id.B3);
        B4 = findViewById(R.id.B4);
        B5 = findViewById(R.id.B5);
        B6 = findViewById(R.id.B6);
        B7 = findViewById(R.id.B7);
        B8 = findViewById(R.id.B8);
        B9 = findViewById(R.id.B9);
        pl1 = findViewById(R.id.P1);
        pl2 = findViewById(R.id.P2);
        Result = findViewById(R.id.Result);
        Restart = findViewById(R.id.Restart);
        Restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1.setClickable(true);
                B1.setText("");
                B2.setClickable(true);
                B2.setText("");
                B3.setClickable(true);
                B3.setText("");
                B4.setClickable(true);
                B4.setText("");
                B5.setClickable(true);
                B5.setText("");
                B6.setClickable(true);
                B6.setText("");
                B7.setClickable(true);
                B7.setText("");
                B8.setClickable(true);
                B8.setText("");
                B9.setClickable(true);
                B9.setText("");
                Result.setText("Player 2 starts");
                f=3;
                k=1;
                B[0] = 0;
                B[1] = 0;
                B[2] = 0;
                B[3] = 0;
                B[4] = 0;
                B[5] = 0;
                B[6] = 0;
                B[7] = 0;
                B[8] = 0;
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1 = pl1.getText().toString();
                String p2 = pl2.getText().toString();
                if(k%2==0) {
                    B1.setText("X");
                    B[0] = 1;
                }
                else {
                    B1.setText("O");
                    B[0] = 2;
                }
                if((B[0]==1&&B[1]==1&&B[2]==1)||(B[3]==1&&B[4]==1&&B[5]==1)||(B[6]==1&&B[7]==1&&B[8]==1)||(B[0]==1&&B[3]==1&&B[6]==1)||(B[1]==1&&B[4]==1&&B[7]==1)||(B[2]==1&&B[5]==1&&B[8]==1)||(B[0]==1&&B[4]==1&&B[8]==1)||(B[2]==1&&B[4]==1&&B[6]==1))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 1;
                }
                if((B[0]==2&&B[1]==2&&B[2]==2)||(B[3]==2&&B[4]==2&&B[5]==2)||(B[6]==2&&B[7]==2&&B[8]==2)||(B[0]==2&&B[3]==2&&B[6]==2)||(B[1]==2&&B[4]==2&&B[7]==2)||(B[2]==2&&B[5]==2&&B[8]==2)||(B[0]==2&&B[4]==2&&B[8]==2)||(B[2]==2&&B[4]==2&&B[6]==2))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 0;
                }
                k++;
                B1.setClickable(false);

                if(f==1)
                    Result.setText(p1 + " is Winner");
                if(f==2)
                    Result.setText(p2 + " is Winner");
                if(k==10&&f!=0&&f!=1)
                    Result.setText("Draw No winner");
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1 = pl1.getText().toString();
                String p2 = pl2.getText().toString();
                if(k%2==0) {
                    B2.setText("X");
                    B[1] = 1;
                }
                else {
                    B2.setText("O");
                    B[1] = 2;
                }
                if((B[0]==1&&B[1]==1&&B[2]==1)||(B[3]==1&&B[4]==1&&B[5]==1)||(B[6]==1&&B[7]==1&&B[8]==1)||(B[0]==1&&B[3]==1&&B[6]==1)||(B[1]==1&&B[4]==1&&B[7]==1)||(B[2]==1&&B[5]==1&&B[8]==1)||(B[0]==1&&B[4]==1&&B[8]==1)||(B[2]==1&&B[4]==1&&B[6]==1))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 1;
                }
                if((B[0]==2&&B[1]==2&&B[2]==2)||(B[3]==2&&B[4]==2&&B[5]==2)||(B[6]==2&&B[7]==2&&B[8]==2)||(B[0]==2&&B[3]==2&&B[6]==2)||(B[1]==2&&B[4]==2&&B[7]==2)||(B[2]==2&&B[5]==2&&B[8]==2)||(B[0]==2&&B[4]==2&&B[8]==2)||(B[2]==2&&B[4]==2&&B[6]==2))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 0;
                }
                k++;
                B2.setClickable(false);

                if(f==1)
                    Result.setText(p1 + " is Winner");
                if(f==0)
                    Result.setText(p2 + " is Winner");
                if(k==10&&f!=0&&f!=1)
                    Result.setText("Draw No winner");
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1 = pl1.getText().toString();
                String p2 = pl2.getText().toString();
                if(k%2==0) {
                    B3.setText("X");
                    B[2] = 1;
                }
                else {
                    B3.setText("O");
                    B[2] = 2;
                }
                if((B[0]==1&&B[1]==1&&B[2]==1)||(B[3]==1&&B[4]==1&&B[5]==1)||(B[6]==1&&B[7]==1&&B[8]==1)||(B[0]==1&&B[3]==1&&B[6]==1)||(B[1]==1&&B[4]==1&&B[7]==1)||(B[2]==1&&B[5]==1&&B[8]==1)||(B[0]==1&&B[4]==1&&B[8]==1)||(B[2]==1&&B[4]==1&&B[6]==1))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 1;
                }
                if((B[0]==2&&B[1]==2&&B[2]==2)||(B[3]==2&&B[4]==2&&B[5]==2)||(B[6]==2&&B[7]==2&&B[8]==2)||(B[0]==2&&B[3]==2&&B[6]==2)||(B[1]==2&&B[4]==2&&B[7]==2)||(B[2]==2&&B[5]==2&&B[8]==2)||(B[0]==2&&B[4]==2&&B[8]==2)||(B[2]==2&&B[4]==2&&B[6]==2))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 0;
                }
                k++;
                B3.setClickable(false);

                if(f==1)
                    Result.setText(p1 + " is Winner");
                if(f==0)
                    Result.setText(p2 + " is Winner");
                if(k==10&&f!=0&&f!=1)
                    Result.setText("Draw No winner");
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1 = pl1.getText().toString();
                String p2 = pl2.getText().toString();
                if(k%2==0) {
                    B4.setText("X");
                    B[3] = 1;
                }
                else {
                    B4.setText("O");
                    B[3] = 2;
                }
                if((B[0]==1&&B[1]==1&&B[2]==1)||(B[3]==1&&B[4]==1&&B[5]==1)||(B[6]==1&&B[7]==1&&B[8]==1)||(B[0]==1&&B[3]==1&&B[6]==1)||(B[1]==1&&B[4]==1&&B[7]==1)||(B[2]==1&&B[5]==1&&B[8]==1)||(B[0]==1&&B[4]==1&&B[8]==1)||(B[2]==1&&B[4]==1&&B[6]==1))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 1;
                }
                if((B[0]==2&&B[1]==2&&B[2]==2)||(B[3]==2&&B[4]==2&&B[5]==2)||(B[6]==2&&B[7]==2&&B[8]==2)||(B[0]==2&&B[3]==2&&B[6]==2)||(B[1]==2&&B[4]==2&&B[7]==2)||(B[2]==2&&B[5]==2&&B[8]==2)||(B[0]==2&&B[4]==2&&B[8]==2)||(B[2]==2&&B[4]==2&&B[6]==2))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 0;
                }
                k++;
                B4.setClickable(false);

                if(f==1)
                    Result.setText(p1 + " is Winner");
                if(f==0)
                    Result.setText(p2 + " is Winner");
                if(k==10&&f!=0&&f!=1)
                    Result.setText("Draw No winner");
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1 = pl1.getText().toString();
                String p2 = pl2.getText().toString();
                if(k%2==0) {
                    B5.setText("X");
                    B[4] = 1;
                }
                else {
                    B5.setText("O");
                    B[4] = 2;
                }
                if((B[0]==1&&B[1]==1&&B[2]==1)||(B[3]==1&&B[4]==1&&B[5]==1)||(B[6]==1&&B[7]==1&&B[8]==1)||(B[0]==1&&B[3]==1&&B[6]==1)||(B[1]==1&&B[4]==1&&B[7]==1)||(B[2]==1&&B[5]==1&&B[8]==1)||(B[0]==1&&B[4]==1&&B[8]==1)||(B[2]==1&&B[4]==1&&B[6]==1))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 1;
                }
                if((B[0]==2&&B[1]==2&&B[2]==2)||(B[3]==2&&B[4]==2&&B[5]==2)||(B[6]==2&&B[7]==2&&B[8]==2)||(B[0]==2&&B[3]==2&&B[6]==2)||(B[1]==2&&B[4]==2&&B[7]==2)||(B[2]==2&&B[5]==2&&B[8]==2)||(B[0]==2&&B[4]==2&&B[8]==2)||(B[2]==2&&B[4]==2&&B[6]==2))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 0;
                }
                k++;
                B5.setClickable(false);

                if(f==1)
                    Result.setText(p1 + " is Winner");
                if(f==0)
                    Result.setText(p2 + " is Winner");
                if(k==10&&f!=0&&f!=1)
                    Result.setText("Draw No winner");
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1 = pl1.getText().toString();
                String p2 = pl2.getText().toString();
                if(k%2==0) {
                    B6.setText("X");
                    B[5] = 1;
                }
                else {
                    B6.setText("O");
                    B[5] = 2;
                }
                if((B[0]==1&&B[1]==1&&B[2]==1)||(B[3]==1&&B[4]==1&&B[5]==1)||(B[6]==1&&B[7]==1&&B[8]==1)||(B[0]==1&&B[3]==1&&B[6]==1)||(B[1]==1&&B[4]==1&&B[7]==1)||(B[2]==1&&B[5]==1&&B[8]==1)||(B[0]==1&&B[4]==1&&B[8]==1)||(B[2]==1&&B[4]==1&&B[6]==1))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 1;
                }
                if((B[0]==2&&B[1]==2&&B[2]==2)||(B[3]==2&&B[4]==2&&B[5]==2)||(B[6]==2&&B[7]==2&&B[8]==2)||(B[0]==2&&B[3]==2&&B[6]==2)||(B[1]==2&&B[4]==2&&B[7]==2)||(B[2]==2&&B[5]==2&&B[8]==2)||(B[0]==2&&B[4]==2&&B[8]==2)||(B[2]==2&&B[4]==2&&B[6]==2))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 0;
                }
                k++;
                B6.setClickable(false);

                if(f==1)
                    Result.setText(p1 + " is Winner");
                if(f==0)
                    Result.setText(p2 + " is Winner");
                if(k==10&&f!=0&&f!=1)
                    Result.setText("Draw No winner");
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1 = pl1.getText().toString();
                String p2 = pl2.getText().toString();
                if(k%2==0) {
                    B7.setText("X");
                    B[6] = 1;
                }
                else {
                    B7.setText("O");
                    B[6] = 2;
                }
                if((B[0]==1&&B[1]==1&&B[2]==1)||(B[3]==1&&B[4]==1&&B[5]==1)||(B[6]==1&&B[7]==1&&B[8]==1)||(B[0]==1&&B[3]==1&&B[6]==1)||(B[1]==1&&B[4]==1&&B[7]==1)||(B[2]==1&&B[5]==1&&B[8]==1)||(B[0]==1&&B[4]==1&&B[8]==1)||(B[2]==1&&B[4]==1&&B[6]==1))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 1;
                }
                if((B[0]==2&&B[1]==2&&B[2]==2)||(B[3]==2&&B[4]==2&&B[5]==2)||(B[6]==2&&B[7]==2&&B[8]==2)||(B[0]==2&&B[3]==2&&B[6]==2)||(B[1]==2&&B[4]==2&&B[7]==2)||(B[2]==2&&B[5]==2&&B[8]==2)||(B[0]==2&&B[4]==2&&B[8]==2)||(B[2]==2&&B[4]==2&&B[6]==2))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 0;
                }
                k++;
                B7.setClickable(false);

                if(f==1)
                    Result.setText(p1 + " is Winner");
                if(f==0)
                    Result.setText(p2 + " is Winner");
                if(k==10&&f!=0&&f!=1)
                    Result.setText("Draw No winner");
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1 = pl1.getText().toString();
                String p2 = pl2.getText().toString();
                if(k%2==0) {
                    B8.setText("X");
                    B[7] = 1;
                }
                else {
                    B8.setText("O");
                    B[7] = 2;
                }
                if((B[0]==1&&B[1]==1&&B[2]==1)||(B[3]==1&&B[4]==1&&B[5]==1)||(B[6]==1&&B[7]==1&&B[8]==1)||(B[0]==1&&B[3]==1&&B[6]==1)||(B[1]==1&&B[4]==1&&B[7]==1)||(B[2]==1&&B[5]==1&&B[8]==1)||(B[0]==1&&B[4]==1&&B[8]==1)||(B[2]==1&&B[4]==1&&B[6]==1))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 1;
                }
                if((B[0]==2&&B[1]==2&&B[2]==2)||(B[3]==2&&B[4]==2&&B[5]==2)||(B[6]==2&&B[7]==2&&B[8]==2)||(B[0]==2&&B[3]==2&&B[6]==2)||(B[1]==2&&B[4]==2&&B[7]==2)||(B[2]==2&&B[5]==2&&B[8]==2)||(B[0]==2&&B[4]==2&&B[8]==2)||(B[2]==2&&B[4]==2&&B[6]==2))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 0;
                }
                k++;
                B8.setClickable(false);

                if(f==1)
                    Result.setText(p1 + " is Winner");
                if(f==0)
                    Result.setText(p2 + " is Winner");
                if(k==10&&f!=0&&f!=1)
                    Result.setText("Draw No winner");
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1 = pl1.getText().toString();
                String p2 = pl2.getText().toString();
                if(k%2==0) {
                    B9.setText("X");
                    B[8] = 1;
                }
                else {
                    B9.setText("O");
                    B[8] = 2;
                }
                if((B[0]==1&&B[1]==1&&B[2]==1)||(B[3]==1&&B[4]==1&&B[5]==1)||(B[6]==1&&B[7]==1&&B[8]==1)||(B[0]==1&&B[3]==1&&B[6]==1)||(B[1]==1&&B[4]==1&&B[7]==1)||(B[2]==1&&B[5]==1&&B[8]==1)||(B[0]==1&&B[4]==1&&B[8]==1)||(B[2]==1&&B[4]==1&&B[6]==1))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 1;
                }
                if((B[0]==2&&B[1]==2&&B[2]==2)||(B[3]==2&&B[4]==2&&B[5]==2)||(B[6]==2&&B[7]==2&&B[8]==2)||(B[0]==2&&B[3]==2&&B[6]==2)||(B[1]==2&&B[4]==2&&B[7]==2)||(B[2]==2&&B[5]==2&&B[8]==2)||(B[0]==2&&B[4]==2&&B[8]==2)||(B[2]==2&&B[4]==2&&B[6]==2))
                {
                    B1.setClickable(false);
                    B2.setClickable(false);
                    B3.setClickable(false);
                    B4.setClickable(false);
                    B5.setClickable(false);
                    B6.setClickable(false);
                    B7.setClickable(false);
                    B8.setClickable(false);
                    B9.setClickable(false);
                    f = 0;
                }
                k++;
                B9.setClickable(false);

                if(f==1)
                    Result.setText(p1 + " is Winner");;
                if(f==0)
                    Result.setText(p2 + " is Winner");

                if(k==10&&f!=0&&f!=1)
                    Result.setText("Draw No winner");
            }
        });
    }
}
