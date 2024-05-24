package com.example.multifunctioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, ZERO, DOT, PI, EQUAL, ADD, DIV, MUL, MINUS, LOG, AC, C, B1, B2, LN, SIN, COS, TAN, INV, SQRT, SQUARE, FACT;
    TextView SEC, MAIN;
    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ONE = findViewById(R.id.ONE);
        TWO = findViewById(R.id.TWO);
        THREE = findViewById(R.id.THREE);
        FOUR = findViewById(R.id.FOUR);
        FIVE = findViewById(R.id.FIVE);
        SIX = findViewById(R.id.SIX);
        SEVEN = findViewById(R.id.SEVEN);
        EIGHT = findViewById(R.id.EIGHT);
        NINE = findViewById(R.id.NINE);
        ZERO = findViewById(R.id.ZERO);
        AC = findViewById(R.id.AC);
        C = findViewById(R.id.C);
        B1 = findViewById(R.id.B1);
        B2 = findViewById(R.id.B2);
        PI = findViewById(R.id.PI);
        DOT = findViewById(R.id.DOT);
        EQUAL = findViewById(R.id.EQUAL);
        ADD = findViewById(R.id.ADD);
        MINUS = findViewById(R.id.MINUS);
        MUL = findViewById(R.id.MUL);
        DIV = findViewById(R.id.DIV);
        INV = findViewById(R.id.INV);
        SQRT = findViewById(R.id.SQRT);
        SQUARE = findViewById(R.id.SQUARE);
        FACT = findViewById(R.id.FACT);
        LN = findViewById(R.id.LN);
        SIN = findViewById(R.id.SIN);
        COS = findViewById(R.id.COS);
        TAN = findViewById(R.id.TAN);
        LOG = findViewById(R.id.LOG);

        MAIN = findViewById(R.id.MAIN);
        SEC = findViewById(R.id.SEC);

        ONE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "1");
            }
        });

        TWO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "2");
            }
        });

        THREE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "3");
            }
        });

        FOUR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "4");
            }
        });

        FIVE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "5");
            }
        });

        SIX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "6");
            }
        });

        SEVEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "7");
            }
        });

        EIGHT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "8");
            }
        });

        NINE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "9");
            }
        });

        ZERO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "0");
            }
        });

        DOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + ".");
            }
        });

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText("");
                SEC.setText("");
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = MAIN.getText().toString();
                val = val.substring(0, val.length() - 1);
                MAIN.setText(val);
            }
        });

        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "+");
            }
        });

        MINUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "-");
            }
        });

        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "÷");
            }
        });

        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "×");
            }
        });

        SQRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = MAIN.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                MAIN.setText(String.valueOf(r));
            }
        });


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "(");
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + ")");
            }
        });

        PI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SEC.setText(PI.getText());
                MAIN.setText(MAIN.getText() + pi);
            }
        });

        SIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "sin");
            }
        });

        COS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "cos");
            }
        });

        TAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "tan");
            }
        });

        INV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "^" + "(-1)");
            }
        });

        FACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(MAIN.getText().toString());
                int fact = factorial(val);
                MAIN.setText(String.valueOf(fact));
                SEC.setText(val + "!");
            }

        });

        SQUARE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(MAIN.getText().toString());
                double square = d * d;
                MAIN.setText(String.valueOf(square));
                SEC.setText(d + "²");
            }
        });

        LN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "ln");
            }
        });

        LOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MAIN.setText(MAIN.getText() + "log");
            }
        });

        EQUAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = MAIN.getText().toString();
                String replacedstr = val.replace('÷', '/').replace('×', '*');
                double result = eval(replacedstr);
                MAIN.setText((String.valueOf(result)));
                SEC.setText(val);

            }
        });

    }

    int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm () {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseTerm();
                    else if (eat('/')) x /= parseTerm();
                    else return x;
                }
            }

            double parseFactor() {

                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = this.pos;
                if (eat('(')) { // Parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if ((ch >= 'a' && ch <= 'z') || ch == '.') {
                    while ((ch >= 'a' && ch <= 'z') || ch == '.') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);

                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor());
                return x;
            }

        }.parse();

    }
}