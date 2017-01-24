package biggobutton.chrisli8.washington.edu.biggobutton;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class MainActivity extends Activity {

    private static int COUNTER = 0;
    private Button goButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button goButton = (Button) findViewById(R.id.button_go);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                COUNTER++;
                goButton.setText("You have pushed me " + COUNTER + " times!");
            }
        });

    }
}
