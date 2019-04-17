package com.example.shehroz.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnAdd,btnSub,btnMul,btnDiv,btnEql,btnClr,button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9;
    EditText editText1;
    public int num1 ,num2;
    boolean add,mul,div,sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=(EditText)findViewById(R.id.editText1);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnEql=(Button)findViewById(R.id.equal);
        btnClr=(Button)findViewById(R.id.C);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnClr.setOnClickListener(this);
        btnEql.setOnClickListener(this);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String number = editText1.getText().toString();
        switch (view.getId()){
            case R.id.button0:
                editText1.setText(number+"0");

                break;
            case R.id.button1:
                editText1.setText(number+"1");

                break;
            case R.id.button2:
                editText1.setText(number+"2");

                break;
            case R.id.button3:
                editText1.setText(number+"3");

                break;
            case R.id.button4:
                editText1.setText(number+"4");

                break;
            case R.id.button5:
                editText1.setText(number+"5");

                break;
            case R.id.button6:
                editText1.setText(number+"6");

                break;
            case R.id.button7:
                editText1.setText(number+"7");

                break;
            case R.id.button8:
                editText1.setText(number+"8");

                break;
            case R.id.button9:
                editText1.setText(number+"9");

                break;
            case R.id.btnAdd:
                num1=Integer.parseInt(number.isEmpty()?"0":number);
                add=true;
                editText1.setText("");
                break;
            case R.id.btnSub:
                num1=Integer.parseInt(number.isEmpty()?"0":number);

                sub=true;

                editText1.setText("");

                break;
            case R.id.btnMul:
                num1=Integer.parseInt(number.isEmpty()?"1":number);
                mul=true;
                editText1.setText("");

                break;
            case R.id.btnDiv:
                num1=Integer.parseInt(number.isEmpty()?"1":number);
                div=true;
                editText1.setText("");
                break;
            case R.id.C:
                editText1.setText("");
                break;
            case R.id.equal:
                if(add){
                    num2=Integer.parseInt(number.isEmpty()?"0":number);
                    editText1.setText("");
//                    num2=Integer.parseInt(number+"");
                    int num3;
                    num3=num1+num2;
                    editText1.setText(String.valueOf(num3));
                    add=false;
                }
                else if(sub){
                    num2=Integer.parseInt(number.isEmpty()?"0":number);
                    // num2=Integer.parseInt(number+"");
                    editText1.setText(String.valueOf(num1-num2));
                    sub=false;
                }
                else if(mul){
                    num2=Integer.parseInt(number.isEmpty()?"1":number);
                    // num2=Integer.parseInt(number+"");
                    editText1.setText(String.valueOf(num1*num2));
                    mul=false;
                }

                else if(div){
                    num2=Integer.parseInt(number.isEmpty()||number.equals("0")?"1":number);

                    // num2=Integer.parseInt(number+"");
                    editText1.setText(String.valueOf(num1/num2));
                    div=false;
                }

                break;
            default:break;
        }
    }
}
