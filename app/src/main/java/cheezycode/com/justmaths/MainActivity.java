package cheezycode.com.justmaths;

import static android.widget.Toast.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends GameActivity{

    ImageButton btnMathPlay, btnMathShare, btnMathRate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        btnMathPlay = (ImageButton) findViewById(R.id.btnMathPlay);
        btnMathShare= (ImageButton) findViewById(R.id.btnMathShare);
        btnMathRate = (ImageButton) findViewById(R.id.btnMathRate);

        btnMathPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 *  Example of Explicit Intent
                 *  When you click Play Button on the screen
                 *  Game Activity will be started
                 */

                Intent i = new Intent(MainActivity.this, GameActivity.class);
                startActivity(i);
            }

            private void startActivity(Intent i) {
            }
        });

        btnMathShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 *  Example of Implict Intent
                 *  When you click Share Button on the screen
                 *  Android will find the activities that allow to share messages.
                 */

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Just Maths - Fun way to learn Maths. http://www.play.google.com");
                startActivity(intent);
            }

            private void startActivity(Intent intent) {
            }
        });

        btnMathRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 *  Simple Toast Message To Display Message For Short Duration
                 *  Link that to your app landing page.
                 */
                makeText("You can open your Google Play landing page",MainActivity.this, LENGTH_LONG).show();
            }

            private Toast makeText(String s, MainActivity mainActivity, int lengthLong) {
                return null;
            }
        });
    }

    private Object findViewById(int btnMathPlay) {
        return null;
    }

    private void setContentView(int activity_main) {
    }
}
