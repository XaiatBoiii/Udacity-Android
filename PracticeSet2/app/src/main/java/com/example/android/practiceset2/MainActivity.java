import android.os.Bundle;
import  android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v7.app.ActionBar;

import com.example.android.practiceset2.R;

public  class MainActivity extends ActionBar
{
    @Override
    protected void onCreate (Bundle savedInstanceState)
  {
    int weekday = 5;
    int weekend = 9;
    int optimalHours = 7 * 8;

    int actualHours = weekday;
    actualHours = actualHours + weekend * 2;
    int solution = optimalHours - actualHours;
    display(solution);

  }


public void display (int i) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(""+i);
        }
}
