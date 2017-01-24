package solutions.hedron.simple_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultView;

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
    }
}
