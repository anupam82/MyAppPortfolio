package in.galaxy_soft.anupam.myappportfolio.app;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        CharSequence msg = getString(R.string.bclick_toast1);
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, msg, duration).show();
                    }
                }
        );

        final Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        CharSequence msg = getString(R.string.bclick_toast2);
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, msg, duration).show();
                    }
                }
        );

        final Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        CharSequence msg = getString(R.string.bclick_toast3);
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, msg, duration).show();
                    }
                }
        );

        final Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        CharSequence msg = getString(R.string.bclick_toast4);
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, msg, duration).show();
                    }
                }
        );

        final Button b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        CharSequence msg = getString(R.string.bclick_toast5);
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, msg, duration).show();
                    }
                }
        );

        final Button b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Context context = getApplicationContext();
                        CharSequence msg = getString(R.string.bclick_toast6);
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(context, msg, duration).show();
                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
