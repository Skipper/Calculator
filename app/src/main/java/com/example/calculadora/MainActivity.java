package com.example.calculadora;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView tvNumbers,
            tvNumberResult;

    private Button btnPoint,
            btnNumberZero,
            btnNumberOne,
            btnNumberTwo,
            btnNumberThree,
            btnNumberFour,
            btnNumberFive,
            btnNumberSix,
            btnNumberSeven,
            btnNumberEith,
            btnNumberNine;

    private Button btnMore,
            btnLess,
            btnMultiply,
            btnDivide,
            btnEqual;

    private Button btnMod,
            btnC,
            btnCE;

    float numberOne = -1.0f,
            numberTwo = 0.0f, resultado = 0.0f;

    float numberOneGlobal = 0.0f;

    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the reference to the views
        instantiation();

        if (savedInstanceState != null){
            tvNumbers       = findViewById(R.id.tv_main_numbers);
            //tvNumberResult       = findViewById(R.id.tv_main_number_result);
            tvNumbers.setText(savedInstanceState.getString("clave"));
            //tvNumberResult.setText(savedInstanceState.getString("clave"));
        } // Minuto 11.13

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        tvNumbers       = findViewById(R.id.tv_main_numbers);
        //tvNumberResult       = findViewById(R.id.tv_main_number_result);
        outState.putString("clave", tvNumbers.getText().toString());
        //outState.putString("clave", tvNumberResult.getText().toString());

        super.onSaveInstanceState(outState);
    }

    private void instantiation() {

        // Display
        tvNumbers       = findViewById(R.id.tv_main_numbers);
        tvNumberResult  = findViewById(R.id.tv_main_number_result);

        // Numbers
/*        btnPoint        = findViewById(R.id.btn_main_number_point);
        btnNumberZero   = findViewById(R.id.btn_main_number_zero);
        btnNumberOne    = findViewById(R.id.btn_main_number_one);
        btnNumberTwo    = findViewById(R.id.btn_main_number_two);
        btnNumberThree  = findViewById(R.id.btn_main_number_three);
        btnNumberFour   = findViewById(R.id.btn_main_number_four);
        btnNumberFive   = findViewById(R.id.btn_main_number_five);
        btnNumberSix    = findViewById(R.id.btn_main_number_six);
        btnNumberSeven  = findViewById(R.id.btn_main_number_seven);
        btnNumberEith   = findViewById(R.id.btn_main_number_eight);
        btnNumberNine   = findViewById(R.id.btn_main_number_nine);

        // mathematical operations
        btnMore         = findViewById(R.id.btn_main_number_more);
        btnLess         = findViewById(R.id.btn_main_number_less);
        btnMultiply     = findViewById(R.id.btn_main_number_multiply);
        btnDivide       = findViewById(R.id.btn_main_number_divide);
        btnEqual        = findViewById(R.id.btn_main_number_equal);

        // scientific operations
        btnMod          = findViewById(R.id.btn_main_number_mod);
        btnC            = findViewById(R.id.btn_main_number_ce);
        btnCE           = findViewById(R.id.btn_main_number_c);
*/
    }


    public void OperationCE(View view) {
        tvNumberResult.setText("");
        tvNumbers.setText("");

        numberOne = 0.0f;
        numberTwo = 0.0f;
        resultado = 0.0f;

        operacion = "";
    }

    public void OperationC(View view) {
        String quitarUltimoCaracter = tvNumbers.getText().toString();
        quitarUltimoCaracter = quitarUltimoCaracter.replaceFirst(".$","");
        tvNumbers.setText(quitarUltimoCaracter);
        // https://www.delftstack.com/es/howto/java/how-to-remove-last-character-from-the-string-in-java/
    }

    // Numbers
    public void NumberPoint(View view) {
        tvNumberResult.setText("");
        if((tvNumbers.getText().toString() == "")
                || (tvNumbers.getText() == "+")
                || (tvNumbers.getText() == "-")
                || (tvNumbers.getText() == "*")
                || (tvNumbers.getText() == "/")
                || (tvNumbers.getText() == "%")
                || (tvNumbers.getText() == "Xy")){
            tvNumbers.setText("0.");
        }else{
            tvNumbers.setText(tvNumbers.getText().toString() + ".");
        }

        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        Log.d("Valores", "----- NUMBER POINT -----");
        Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");
    }
    public void NumberZero(View view) {
        tvNumberResult.setText("");
        if((tvNumbers.getText().toString() == "")
                || (tvNumbers.getText() == "+")
                || (tvNumbers.getText() == "-")
                || (tvNumbers.getText() == "*")
                || (tvNumbers.getText() == "/")
                || (tvNumbers.getText() == "%")
                || (tvNumbers.getText() == "Xy")){
            tvNumbers.setText("0");
        }else{
            tvNumbers.setText(tvNumbers.getText().toString() + "0");
        }

        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        Log.d("Valores", "----- NUMBER ZERO -----");
        Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");
   }

    public void NumbersOne(View view) {
        tvNumberResult.setText("");
        if((tvNumbers.getText().toString() == "")
                || (tvNumbers.getText() == "+")
                || (tvNumbers.getText() == "-")
                || (tvNumbers.getText() == "*")
                || (tvNumbers.getText() == "/")
                || (tvNumbers.getText() == "%")
                || (tvNumbers.getText() == "Xy")){
            tvNumbers.setText("1");
        }else{
            tvNumbers.setText(tvNumbers.getText().toString() + "1");
        }

        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        Log.d("Valores", "----- NUMBER ONE -----");
        Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");
    }
    public void NumberTwo(View view) {
        tvNumberResult.setText("");
        if((tvNumbers.getText().toString() == "")
                || (tvNumbers.getText() == "+")
                || (tvNumbers.getText() == "-")
                || (tvNumbers.getText() == "*")
                || (tvNumbers.getText() == "/")
                || (tvNumbers.getText() == "%")
                || (tvNumbers.getText() == "Xy")){
            tvNumbers.setText("2");
        }else{
            tvNumbers.setText(tvNumbers.getText().toString() + "2");
        }

        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        Log.d("Valores", "----- NUMBER TWO -----");
        Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");
    }
    public void NumberThree(View view) {
        tvNumberResult.setText("");
        if((tvNumbers.getText().toString() == "")
                   || (tvNumbers.getText() == "+")
                   || (tvNumbers.getText() == "-")
                   || (tvNumbers.getText() == "*")
                   || (tvNumbers.getText() == "/")
                   || (tvNumbers.getText() == "%")
                   || (tvNumbers.getText() == "Xy")){
            tvNumbers.setText("3");
        }else{
            tvNumbers.setText(tvNumbers.getText().toString() + "3");
        }

        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        Log.d("Valores", "----- NUMBER THREE -----");
        Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");
    }

    public void NumberFour(View view) {
        tvNumberResult.setText("");
        if((tvNumbers.getText().toString() == "")
                || (tvNumbers.getText() == "+")
                || (tvNumbers.getText() == "-")
                || (tvNumbers.getText() == "*")
                || (tvNumbers.getText() == "/")
                || (tvNumbers.getText() == "%")
                || (tvNumbers.getText() == "Xy")){
            tvNumbers.setText("4");
        }else{
            tvNumbers.setText(tvNumbers.getText().toString() + "4");
        }

        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        Log.d("Valores", "----- NUMBER FOUR -----");
        Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");
    }
    public void NumberFive(View view) {
        tvNumberResult.setText("");
        if((tvNumbers.getText().toString() == "")
                || (tvNumbers.getText() == "+")
                || (tvNumbers.getText() == "-")
                || (tvNumbers.getText() == "*")
                || (tvNumbers.getText() == "/")
                || (tvNumbers.getText() == "%")
                || (tvNumbers.getText() == "Xy")){
            tvNumbers.setText("5");
            numberOne = Float.parseFloat(tvNumbers.getText().toString());
            Log.d("Valores", "----- NUMBER FIVE -----");
            Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");
        }/*else if (tvNumbers.getText().toString() == "Sin("){
            tvNumbers.setText(tvNumbers.getText().toString() + "5)");
            numberOne = (float)Math.sin(Math.toRadians(5.0f));

            DecimalFormat formato = new DecimalFormat();
            formato.setMaximumFractionDigits(3); //Numero maximo de decimales a mostrar
            tvNumberResult.setText(""+formato.format(numberOne));

        }*/else{
            tvNumbers.setText(tvNumbers.getText().toString() + "5");
            numberOne = Float.parseFloat(tvNumbers.getText().toString());
            Log.d("Valores", "----- NUMBER FIVE -----");
            Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");
        }



    }
    public void NumberSix(View view) {
        tvNumberResult.setText("");
        if((tvNumbers.getText().toString() == "")
                || (tvNumbers.getText() == "+")
                || (tvNumbers.getText() == "-")
                || (tvNumbers.getText() == "*")
                || (tvNumbers.getText() == "/")
                || (tvNumbers.getText() == "%")
                || (tvNumbers.getText() == "Xy")){
            tvNumbers.setText("6");
            numberOne = Float.parseFloat(tvNumbers.getText().toString());
            Log.d("Valores", "----- NUMBER SIX -----");
            Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");
        }/*else if (tvNumbers.getText().toString() == "Sin("){
            tvNumbers.setText(tvNumbers.getText().toString() + "6)");
            numberOne = (float)Math.sin(Math.toRadians(6.0f));

            DecimalFormat formato = new DecimalFormat();
            formato.setMaximumFractionDigits(3); //Numero maximo de decimales a mostrar
            tvNumberResult.setText(""+formato.format(numberOne));

        }*/else{
            tvNumbers.setText(tvNumbers.getText().toString() + "6");
            numberOne = Float.parseFloat(tvNumbers.getText().toString());
            Log.d("Valores", "----- NUMBER SIX -----");
            Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");
        }



    }

    public void NumberSeven(View view) {
        tvNumberResult.setText("");
        if((tvNumbers.getText().toString() == "")
                || (tvNumbers.getText() == "+")
                || (tvNumbers.getText() == "-")
                || (tvNumbers.getText() == "*")
                || (tvNumbers.getText() == "/")
                || (tvNumbers.getText() == "%")
                || (tvNumbers.getText() == "Xy")){
            tvNumbers.setText("7");
        }else{
            tvNumbers.setText(tvNumbers.getText().toString() + "7");
        }

        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        Log.d("Valores", "----- NUMBER SEVEN -----");
        Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");

    }
    public void NumberEight(View view) {
        tvNumberResult.setText("");
        if((tvNumbers.getText().toString() == "")
                || (tvNumbers.getText() == "+")
                || (tvNumbers.getText() == "-")
                || (tvNumbers.getText() == "*")
                || (tvNumbers.getText() == "/")
                || (tvNumbers.getText() == "%")
                || (tvNumbers.getText() == "Xy")){
            tvNumbers.setText("8");
        }else{
            tvNumbers.setText(tvNumbers.getText().toString() + "8");
        }

        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        Log.d("Valores", "----- NUMBER EIGHT -----");
        Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");

    }
    public void NumberNine(View view) {
        tvNumberResult.setText("");
        if((tvNumbers.getText().toString() == "")
                || (tvNumbers.getText() == "+")
                || (tvNumbers.getText() == "-")
                || (tvNumbers.getText() == "*")
                || (tvNumbers.getText() == "/")
                || (tvNumbers.getText() == "%")
                || (tvNumbers.getText() == "Xy")){
            tvNumbers.setText("9");
        }else{
            tvNumbers.setText(tvNumbers.getText().toString() + "9");
        }

        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        Log.d("Valores", "----- NUMBER NINE -----");
        Log.d("Valores", "numberOne: "+numberOne +" tvNumbers:"+tvNumbers.getText().toString()+".");
    }


    // Mathematical Operations
    public void OperationMore(View view) {
        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        operacion = "+";
        tvNumbers.setText("+");

        Log.d("Valores", "numberOne: "+numberOne);
        Log.d("Valores", "numberTwo: "+numberTwo);
        Log.d("Valores", "numberResult: "+resultado);
        numberOneGlobal = numberOne;
        Log.d("Valores", "numberOneGlobal: "+numberOneGlobal);
    }

    public void OperationLess(View view) {
        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        operacion = "-";
        tvNumbers.setText("-");

        numberOneGlobal = numberOne;
    }

    public void OperationMultiply(View view) {
        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        operacion = "*";
        tvNumbers.setText("*");

        numberOneGlobal = numberOne;
    }

    public void OperationDivide(View view) {
        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        operacion = "/";
        tvNumbers.setText("/");

        numberOneGlobal = numberOne;
    }

    public void OperationMOD(View view) {

        numberOne = Float.parseFloat(tvNumbers.getText().toString());
        operacion = "%";
        tvNumbers.setText("%");

        numberOneGlobal = numberOne;
    }


    // Operations
    public void OperationEqual(View view) {


        if (operacion.equals("/")){
            numberTwo = Float.parseFloat(tvNumbers.getText().toString());
            if (numberTwo == 0.0f){
                tvNumberResult.setText("0");

                Toast.makeText(MainActivity.this, "Operación no valida", Toast.LENGTH_SHORT).show();
            }else{
                resultado = numberOneGlobal / numberTwo;
                tvNumberResult.setText(resultado + "");
            }
        }else if (operacion.equals("*")){
            numberTwo = Float.parseFloat(tvNumbers.getText().toString());
            resultado = numberOneGlobal * numberTwo;
            tvNumberResult.setText(resultado + "");
        }else if (operacion.equals("-")){
            numberTwo = Float.parseFloat(tvNumbers.getText().toString());
            resultado = numberOneGlobal - numberTwo;
            tvNumberResult.setText(resultado + "");
        }else if (operacion.equals("+")){
            numberTwo = Float.parseFloat(tvNumbers.getText().toString());
            resultado = numberOneGlobal + numberTwo;
            tvNumberResult.setText(resultado + "");
        }else if (operacion.equals("%")){
            numberTwo = Float.parseFloat(tvNumbers.getText().toString());
            resultado = numberOneGlobal % numberTwo;
            tvNumberResult.setText(resultado + "");
        }else if (operacion.equals("sin")){
            /*if(numberOne == 0){
                // Codigo

            }else{
                Toast.makeText(MainActivity.this, "Debe digitar un valor", Toast.LENGTH_SHORT).show();
            }*/

            tvNumberResult.setText(resultado + "");

            numberOneGlobal = (float)Math.sin(Math.toRadians(numberOne));

            DecimalFormat formato = new DecimalFormat();
            formato.setMaximumFractionDigits(3); //Numero maximo de decimales a mostrar
            tvNumberResult.setText(""+formato.format(numberOneGlobal));
        }else if (operacion.equals("cos")){
            /*if(numberOne == 0){
                // Codigo

            }else{
                Toast.makeText(MainActivity.this, "Debe digitar un valor", Toast.LENGTH_SHORT).show();
            }*/

            tvNumberResult.setText(resultado + "");

            numberOneGlobal = (float)Math.cos(Math.toRadians(numberOne));

            DecimalFormat formato = new DecimalFormat();
            formato.setMaximumFractionDigits(3); //Numero maximo de decimales a mostrar
            tvNumberResult.setText(""+formato.format(numberOneGlobal));
        }else if (operacion.equals("tan")) {
            /*if(numberOne == 0){
                // Codigo

            }else{
                Toast.makeText(MainActivity.this, "Debe digitar un valor", Toast.LENGTH_SHORT).show();
            }*/

            tvNumberResult.setText(resultado + "");

            numberOneGlobal = (float) Math.tan(Math.toRadians(numberOne));

            DecimalFormat formato = new DecimalFormat();
            formato.setMaximumFractionDigits(3); //Numero maximo de decimales a mostrar
            tvNumberResult.setText("" + formato.format(numberOneGlobal));
        }else if (operacion.equals("x2")) {
            tvNumberResult.setText(resultado + "");

            numberOneGlobal = numberOneGlobal * numberOneGlobal;

            tvNumberResult.setText("" +numberOneGlobal);
        }else if (operacion.equals("squareRoot")) {
            tvNumberResult.setText(resultado + "");

            numberOneGlobal = (float) Math.sqrt(numberOne);

            DecimalFormat formato = new DecimalFormat();
            formato.setMaximumFractionDigits(3); //Numero maximo de decimales a mostrar
            tvNumberResult.setText("" + formato.format(numberOneGlobal));
        }else if (operacion.equals("Log")) {
            tvNumberResult.setText(resultado + "");

            numberOneGlobal = (float) Math.log(numberOne);

            DecimalFormat formato = new DecimalFormat();
            formato.setMaximumFractionDigits(3); //Numero maximo de decimales a mostrar
            tvNumberResult.setText("" + formato.format(numberOneGlobal));
        }else if (operacion.equals("Exp")) {
            tvNumberResult.setText(resultado + "");

            numberOneGlobal = (float) Math.exp(numberOne);

            DecimalFormat formato = new DecimalFormat();
            formato.setMaximumFractionDigits(3); //Numero maximo de decimales a mostrar
            tvNumberResult.setText("" + formato.format(numberOneGlobal));
        }else if (operacion.equals("Xy")) {
            /*numberTwo = Float.parseFloat(tvNumbers.getText().toString());
            resultado = numberOneGlobal * numberTwo;
            tvNumberResult.setText(resultado + "");*/
            tvNumberResult.setText(resultado + "");

            int potencia = 1;
            Log.d("Potencia", "ONE: "+numberOne+" GLOBAL: "+numberOneGlobal);
            Log.d("Potencia", "Inicial: "+potencia);
            for (int i = 0; i<numberOne; i++){
                Log.d("Potencia", "FOR: "+potencia+" * "+numberOneGlobal+ " Cantidad de veces: "+i+" = "+potencia);
                potencia = (int) (potencia * numberOneGlobal);
            }
            Log.d("Potencia", "FINAL: "+potencia);
            numberOneGlobal = potencia;
            tvNumberResult.setText("" +numberOneGlobal);

        }else if (operacion.equals("10x")) {
            tvNumberResult.setText(resultado + "");

            int potencia = 1;
            Log.d("Potencia", "Inicial: "+potencia);
            for (int i = 0; i<numberOne; i++){
                potencia = potencia * 10 ;
                Log.d("Potencia", "FOR: "+potencia);
            }
            Log.d("Potencia", "FINAL: "+potencia);
            numberOneGlobal = potencia;
            tvNumberResult.setText("" +numberOneGlobal);
        }else if (operacion.equals("1x")) {
            tvNumberResult.setText(resultado + "");

            float potencia = 1;
            Log.d("1x", "Inicial: "+potencia);

            potencia = (float) 1 / numberOneGlobal ;

            Log.d("1x", "FINAL: "+potencia);
            numberOneGlobal = potencia;
            tvNumberResult.setText("" +numberOneGlobal);

        }else if (operacion.equals("Pi")) {
            tvNumberResult.setText(resultado + "");

            numberOneGlobal = (float) Math.PI*numberOneGlobal;
            Log.d("PI", "PI: "+numberOneGlobal);

            DecimalFormat formato = new DecimalFormat();
            formato.setMaximumFractionDigits(3); //Numero maximo de decimales a mostrar
            tvNumberResult.setText("" + formato.format(numberOneGlobal));
        }

        Log.d("Valores", "-----GET-----");
        Log.d("Valores", "ONE: "+numberOne);
        Log.d("Valores", "ONEGlobal: "+numberOneGlobal);
        Log.d("Valores", "TWO: "+numberTwo);
        Log.d("Valores", "OPERATION: "+operacion);
        Log.d("Valores", "RESULT: "+resultado);
        Log.d("Valores", "-------------");

        numberOne = 0.0f;
        numberOneGlobal = 0.0f;
        numberTwo = 0.0f;
        resultado = 0.0f;
        operacion = "";

        tvNumbers.setText("");
        tvNumbers.setHint("0");
    }


    public void OperationSin(View view) {
        operacion = "sin";
        tvNumbers.setText("Sin("+tvNumbers.getText().toString());
        numberOneGlobal = numberOne;

    }

    public void OperationCos(View view) {
        operacion = "cos";
        tvNumbers.setText("Cos("+tvNumbers.getText().toString());
        numberOneGlobal = numberOne;

    }

    public void OperationTan(View view) {
        operacion = "tan";
        tvNumbers.setText("Tan("+tvNumbers.getText().toString());
        numberOneGlobal = numberOne;
    }

    public void OperationXSquared(View view) {
        operacion = "x2";
        tvNumbers.setText(tvNumbers.getText().toString()+" ^ 2");
        numberOneGlobal = numberOne;
    }

    public void OperationSquareRoot(View view) {
        operacion = "squareRoot";
        tvNumbers.setText("\u221a"+tvNumbers.getText().toString());
        numberOneGlobal = numberOne;
    }



    public void OperationLog(View view) {
        operacion = "Log";
        tvNumbers.setText("Log("+tvNumbers.getText().toString()+")");
        numberOneGlobal = numberOne;
    }
    public void OperationExp(View view) {
        operacion = "Exp";
        tvNumbers.setText("Exp("+tvNumbers.getText().toString()+")");
        numberOneGlobal = numberOne;
    }
    public void OperationXy(View view) {
        numberOne = Float.parseFloat(tvNumbers.getText().toString());

        operacion = "Xy";
        tvNumbers.setText("Xy");

        numberOneGlobal = numberOne;
    }
    public void Operation10x(View view) {
        numberOne = Float.parseFloat(tvNumbers.getText().toString());

        operacion = "10x";
        tvNumbers.setText("10("+tvNumbers.getText().toString()+")");
        numberOneGlobal = numberOne;
    }

    public void Operation1x(View view) {
        numberOne = Float.parseFloat(tvNumbers.getText().toString());

        operacion = "1x";
        tvNumbers.setText("1/("+tvNumbers.getText().toString()+")");
        numberOneGlobal = numberOne;
    }

    public void OperationPi(View view) {
        numberOne = Float.parseFloat(tvNumbers.getText().toString());

        operacion = "Pi";
        tvNumbers.setText("Pi("+tvNumbers.getText().toString()+")");

        numberOneGlobal = numberOne;

    }

}