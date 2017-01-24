package solutions.hedron.simple_calculator;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultView;
    String currentNumber = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons
        Button oneBtn = (Button)findViewById(R.id.oneButton);
        Button twoBtn = (Button)findViewById(R.id.twoButton);
        Button threeBtn = (Button)findViewById(R.id.threeButton);
        Button fourBtn = (Button)findViewById(R.id.fourButton);
        Button fiveBtn = (Button)findViewById(R.id.fiveButton);
        Button sixBtn = (Button)findViewById(R.id.sixButton);
        Button sevenBtn = (Button)findViewById(R.id.sevenButton);
        Button eightBtn = (Button)findViewById(R.id.eightButton);
        Button nineBtn = (Button)findViewById(R.id.nineButton);
        Button zeroBtn = (Button)findViewById(R.id.zeroButton);

        // Image Buttons
        ImageButton addBtn = (ImageButton)findViewById(R.id.addButton);
        ImageButton subtractBtn = (ImageButton)findViewById(R.id.subtractButton);
        ImageButton multiplyBtn = (ImageButton)findViewById(R.id.multiplyButton);
        ImageButton divideBtn = (ImageButton)findViewById(R.id.divideButton);
        ImageButton equalBtn = (ImageButton)findViewById(R.id.equalButton);

        // Result TextView
        resultView = (TextView)findViewById(R.id.resultText);
        resultView.setText("");

        // Clear Button
        Button clearBtn = (Button)findViewById(R.id.clearButton);

        // Bind Number Events
        oneBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(1);
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(2);
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(3);
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(4);
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(5);
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(6);
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(7);
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(8);
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(9);
            }
        });
        zeroBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(0);
            }
        });
    }

    void numberPressed(int number){
        currentNumber += String.valueOf(number);
        resultView.setText(currentNumber);
    }
}
