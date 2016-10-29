package the_darkside.monopoly_assistant;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MonopolyMenu extends AppCompatActivity {

    private Toolbar mainMenuToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_board);

        mainMenuToolbar = (Toolbar) findViewById(R.id.app_bar);
        mainMenuToolbar.setTitleTextColor(Color.rgb(255, 255, 255));
        setSupportActionBar(mainMenuToolbar);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {

        switch (menuItem.getItemId()) {

            case R.id.exit:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);

        }
    }

}
