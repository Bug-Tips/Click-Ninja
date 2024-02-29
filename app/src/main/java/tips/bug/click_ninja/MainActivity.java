package tips.bug.click_ninja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvNumber;
    private FloatingActionButton fabGetRandomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNumber = findViewById(R.id.tv_number);
        fabGetRandomNumber = findViewById(R.id.fab_get_random_number);
        fabGetRandomNumber.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fab_get_random_number) {
            int randomNumber = getRandomNumber();
            if (isSpecialNumber(randomNumber)) {
                tvNumber.setText(R.string.flag_ninja);
            } else {
                tvNumber.setText(String.valueOf(randomNumber));
            }
        }
    }

    private static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(10000 - 2000) + 2000;
    }

    private static boolean isSpecialNumber(int number) {
        return number == 1337;
    }
}
