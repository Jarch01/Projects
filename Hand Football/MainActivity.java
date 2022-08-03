package com.example.handfootball;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView playername;
    private Button start;
    private Button odd;
    private Button even;
    private TextView Tossnote;
    private TextView result;
    private TextView player;
    private TextView CPU;
    private TextView Pass;
    private TextView Ps;
    private TextView Cs;
    private Button B1;
    private Button B2;
    private Button B3;
    private Button B4;
    private Button B5;
    private Button B6;
    private int n=0;
    private int k=0;
    private int flag = 2;
    private int pass = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.Start);
        even = findViewById(R.id.Even);
        odd = findViewById(R.id.Odd);
        B1 = findViewById(R.id.B1);
        B2 = findViewById(R.id.B2);
        B3 = findViewById(R.id.B3);
        B4 = findViewById(R.id.B4);
        B5 = findViewById(R.id.B5);
        B6 = findViewById(R.id.B6);
        player = findViewById(R.id.Player);
        playername = findViewById(R.id.Playername);
        Tossnote = findViewById(R.id.Tossnote);
        CPU = findViewById(R.id.CPU);
        result = findViewById(R.id.Result);
        Ps = findViewById(R.id.PS);
        Cs = findViewById(R.id.CS);
        Pass = findViewById(R.id.Pass);
        even.setVisibility(View.GONE);
        even.setClickable(false);
        odd.setVisibility(View.GONE);
        odd.setClickable(false);
        B1.setVisibility(View.GONE);
        B1.setClickable(false);
        B2.setVisibility(View.GONE);
        B2.setClickable(false);
        B3.setVisibility(View.GONE);
        B3.setClickable(false);
        B4.setVisibility(View.GONE);
        B4.setClickable(false);
        B5.setVisibility(View.GONE);
        B5.setClickable(false);
        B6.setVisibility(View.GONE);
        B6.setClickable(false);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                even.setVisibility(View.VISIBLE);
                even.setClickable(true);
                odd.setVisibility(View.VISIBLE);
                odd.setClickable(true);
                Tossnote.setText("Lets Toss");
                start.setClickable(false);
            }
        });
        odd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1.setVisibility(View.VISIBLE);
                B1.setClickable(true);
                B2.setVisibility(View.VISIBLE);
                B2.setClickable(true);
                B3.setVisibility(View.VISIBLE);
                B3.setClickable(true);
                B4.setVisibility(View.VISIBLE);
                B4.setClickable(true);
                B5.setVisibility(View.VISIBLE);
                B5.setClickable(true);
                B6.setVisibility(View.VISIBLE);
                B6.setClickable(true);
                odd.setClickable(false);
                even.setVisibility(View.GONE);
                even.setClickable(false);
                n=1;
            }
        });
        even.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1.setVisibility(View.VISIBLE);
                B1.setClickable(true);
                B2.setVisibility(View.VISIBLE);
                B2.setClickable(true);
                B3.setVisibility(View.VISIBLE);
                B3.setClickable(true);
                B4.setVisibility(View.VISIBLE);
                B4.setClickable(true);
                B5.setVisibility(View.VISIBLE);
                B5.setClickable(true);
                B6.setVisibility(View.VISIBLE);
                B6.setClickable(true);
                odd.setVisibility(View.GONE);
                odd.setClickable(false);
                even.setClickable(false);
                n=0;
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ps.setText("1");
                if(k!=0)
                {
                    even.setVisibility(View.GONE);
                    odd.setVisibility(View.GONE);
                    Tossnote.setText("");
                    result.setText("");
                    int cpu = (int)((Math.random()*3)+1);
                    Cs.setText(""+cpu);
                    if(cpu==1)
                    {
                        pass = 0;
                        Pass.setText("Ball Taken");
                        flag=flag*-1;
                    }
                    else
                        pass++;
                    if(pass!=0)
                        Pass.setText(pass+" pass");
                    if(flag==1) {
                        CPU.setTextColor(Color.parseColor("#000000"));
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    if(flag==-1) {
                        player.setTextColor(Color.parseColor("#000000"));
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    if(pass==4)
                    {
                        Pass.setText("Penalty Kick");
                        B1.setVisibility(View.GONE);
                        B2.setVisibility(View.GONE);
                        B3.setVisibility(View.GONE);
                        B4.setVisibility(View.GONE);
                        B5.setVisibility(View.VISIBLE);
                        B6.setVisibility(View.VISIBLE);
                    }
                }
                if(k==0)
                {
                    int cpu = (int)((Math.random()*5)+1);
                    int total = cpu + 1;
                    String name = playername.getText().toString();
                    String c = ""+cpu;
                    Cs.setText(c);
                    player.setText(name);
                    CPU.setText("CPU");
                    if(total%2==n) {
                        result.setText(name + " won the toss");
                        flag = 1;
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    else {
                        result.setText("CPU won the toss");
                        flag = -1;
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    B5.setVisibility(View.GONE);
                    B6.setVisibility(View.GONE);
                    k++;
                }
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ps.setText("2");
                if(k!=0)
                {
                    even.setVisibility(View.GONE);
                    odd.setVisibility(View.GONE);
                    Tossnote.setText("");
                    result.setText("");
                    int cpu = (int)((Math.random()*3)+1);
                    Cs.setText(""+cpu);
                    if(cpu==2)
                    {
                        pass = 0;
                        Pass.setText("Ball Taken");
                        flag=flag*-1;
                    }
                    else
                        pass++;
                    if(pass!=0)
                        Pass.setText(pass+" pass");
                    if(flag==1) {
                        CPU.setTextColor(Color.parseColor("#000000"));
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    if(flag==-1) {
                        player.setTextColor(Color.parseColor("#000000"));
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    if(pass==4)
                    {
                        Pass.setText("Penalty Kick");
                        B1.setVisibility(View.GONE);
                        B2.setVisibility(View.GONE);
                        B3.setVisibility(View.GONE);
                        B4.setVisibility(View.GONE);
                        B5.setVisibility(View.VISIBLE);
                        B6.setVisibility(View.VISIBLE);
                    }
                }
                if(k==0)
                {
                    int cpu = (int)((Math.random()*5)+1);
                    int total = cpu + 2;
                    String name = playername.getText().toString();
                    String c = ""+cpu;
                    Cs.setText(c);
                    player.setText(name);
                    CPU.setText("CPU");
                    if(total%2==n) {
                        result.setText(name + " won the toss");
                        flag = 1;
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    else {
                        result.setText("CPU won the toss");
                        flag = -1;
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    B5.setVisibility(View.GONE);
                    B6.setVisibility(View.GONE);
                    k++;
                }
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ps.setText("3");
                if(k!=0)
                {
                    even.setVisibility(View.GONE);
                    odd.setVisibility(View.GONE);
                    Tossnote.setText("");
                    result.setText("");
                    int cpu = (int)((Math.random()*3)+1);
                    Cs.setText(""+cpu);
                    if(cpu==3)
                    {
                        pass = 0;
                        Pass.setText("Ball Taken");
                        flag=flag*-1;
                    }
                    else
                        pass++;
                    if(pass!=0)
                        Pass.setText(pass+" pass");
                    if(flag==1) {
                        CPU.setTextColor(Color.parseColor("#000000"));
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    if(flag==-1) {
                        player.setTextColor(Color.parseColor("#000000"));
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    if(pass==4)
                    {
                        Pass.setText("Penalty Kick");
                        B1.setVisibility(View.GONE);
                        B2.setVisibility(View.GONE);
                        B3.setVisibility(View.GONE);
                        B4.setVisibility(View.GONE);
                        B5.setVisibility(View.VISIBLE);
                        B6.setVisibility(View.VISIBLE);
                    }
                }
                if(k==0)
                {
                    int cpu = (int)((Math.random()*5)+1);
                    int total = cpu + 3;
                    String name = playername.getText().toString();
                    String c = ""+cpu;
                    Cs.setText(c);
                    player.setText(name);
                    CPU.setText("CPU");
                    if(total%2==n) {
                        result.setText(name + " won the toss");
                        flag = 1;
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    else {
                        result.setText("CPU won the toss");
                        flag = -1;
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    B5.setVisibility(View.GONE);
                    B6.setVisibility(View.GONE);
                    k++;
                }
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ps.setText("4");
                if(k!=0)
                {
                    even.setVisibility(View.GONE);
                    odd.setVisibility(View.GONE);
                    Tossnote.setText("");
                    result.setText("");
                    int cpu = (int)((Math.random()*3)+1);
                    Cs.setText(""+cpu);
                    if(cpu==4)
                    {
                        pass = 0;
                        Pass.setText("Ball Taken");
                        flag=flag*-1;
                    }
                    else
                        pass++;
                    if(pass!=0)
                        Pass.setText(pass+" pass");
                    if(flag==1) {
                        CPU.setTextColor(Color.parseColor("#000000"));
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    if(flag==-1) {
                        player.setTextColor(Color.parseColor("#000000"));
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    if(pass==4)
                    {
                        Pass.setText("Penalty Kick");
                        B1.setVisibility(View.GONE);
                        B2.setVisibility(View.GONE);
                        B3.setVisibility(View.GONE);
                        B4.setVisibility(View.GONE);
                        B5.setVisibility(View.VISIBLE);
                        B6.setVisibility(View.VISIBLE);
                    }
                }
                if(k==0)
                {
                    int cpu = (int)((Math.random()*5)+1);
                    int total = cpu + 4;
                    String name = playername.getText().toString();
                    String c = ""+cpu;
                    Cs.setText(c);
                    player.setText(name);
                    CPU.setText("CPU");
                    if(total%2==n) {
                        result.setText(name + " won the toss");
                        flag = 1;
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    else {
                        result.setText("CPU won the toss");
                        flag = -1;
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    B5.setVisibility(View.GONE);
                    B6.setVisibility(View.GONE);
                    k++;
                }
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ps.setText("5");
                pass=0;
                int no=2;
                if(k!=0)
                {
                    int cpu = (int)((Math.random()*1)+5);
                    Cs.setText(""+cpu);
                    if(cpu==5&&flag==-1)
                    {
                        Pass.setText("You Saved");
                        no=1;
                    }
                    if(cpu==6&&flag==-1)
                    {
                        Pass.setText("CPU Goal");
                    }
                    if(cpu==5&&flag==1)
                    {
                        Pass.setText("CPU Saved");
                        no=1;
                    }
                    if(cpu==6&&flag==1)
                    {
                        Pass.setText("You Goal");
                    }
                    if(no==1)
                    {
                        B1.setVisibility(View.VISIBLE);
                        B2.setVisibility(View.VISIBLE);
                        B3.setVisibility(View.VISIBLE);
                        B4.setVisibility(View.VISIBLE);
                        B5.setVisibility(View.GONE);
                        B6.setVisibility(View.GONE);
                    }
                    flag=flag*-1;
                    if(flag==1) {
                        CPU.setTextColor(Color.parseColor("#000000"));
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    if(flag==-1) {
                        player.setTextColor(Color.parseColor("#000000"));
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    B5.setVisibility(View.GONE);
                    B6.setVisibility(View.GONE);
                }
                if(k==0)
                {
                    int cpu = (int)((Math.random()*5)+1);
                    int total = cpu + 5;
                    String name = playername.getText().toString();
                    String c = ""+cpu;
                    Cs.setText(c);
                    player.setText(name);
                    CPU.setText("CPU");
                    if(total%2==n) {
                        result.setText(name + " won the toss");
                        flag = 1;
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    else {
                        result.setText("CPU won the toss");
                        flag = -1;
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    B5.setVisibility(View.GONE);
                    B6.setVisibility(View.GONE);
                    k++;
                }
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ps.setText("6");
                pass=0;
                int no=2;
                if(k!=0)
                {
                    int cpu = (int)((Math.random()*1)+5);
                    Cs.setText(""+cpu);
                    if(cpu==6&&flag==-1)
                    {
                        Pass.setText("You Saved");
                        no=1;
                    }
                    if(cpu==5&&flag==-1)
                    {
                        Pass.setText("CPU Goal");
                    }
                    if(cpu==6&&flag==1)
                    {
                        Pass.setText("CPU Saved");
                        no=1;
                    }
                    if(cpu==5&&flag==1)
                    {
                        Pass.setText("You Goal");
                    }
                    if(no==1)
                    {
                        B1.setVisibility(View.VISIBLE);
                        B2.setVisibility(View.VISIBLE);
                        B3.setVisibility(View.VISIBLE);
                        B4.setVisibility(View.VISIBLE);
                        B5.setVisibility(View.GONE);
                        B6.setVisibility(View.GONE);
                    }
                    flag=flag*-1;
                    if(flag==1) {
                        CPU.setTextColor(Color.parseColor("#000000"));
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    if(flag==-1) {
                        player.setTextColor(Color.parseColor("#000000"));
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    B5.setVisibility(View.GONE);
                    B6.setVisibility(View.GONE);
                }
                if(k==0)
                {
                    int cpu = (int)((Math.random()*5)+1);
                    int total = cpu + 6;
                    String name = playername.getText().toString();
                    String c = ""+cpu;
                    Cs.setText(c);
                    player.setText(name);
                    CPU.setText("CPU");
                    if(total%2==n) {
                        result.setText(name + " won the toss");
                        flag = 1;
                        player.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    else {
                        result.setText("CPU won the toss");
                        flag = -1;
                        CPU.setTextColor(Color.parseColor("#C600FF00"));
                    }
                    B5.setVisibility(View.GONE);
                    B6.setVisibility(View.GONE);
                    k++;
                }
            }
        });
    }
}
