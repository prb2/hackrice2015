package hackrice.team.drinkup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Terry on 1/31/2015.
 */
public class EventPage extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_page);
    }

    public void BackToMain(View view){
        //Intent i = new Intent(EventPage.this,MainActivity.class);
        //startActivity(i);
        finish();
    }

}