package hackrice.team.drinkup;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

/**
 * Created by snyquist on 1/31/15.
 */
public class PaymentPage extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paymentpage);
    }

    public pay(View view) {
        int money_amount = (EditText)findViewByID(R.id.money_amount);
        if (money_amount.getText().toString().equals(""){
            Intent venmoIntent = VenmoLibrary.openVenmoPayment(appId, appName, recipient, amount, note, txn);
            startActivityForResult(venmoIntent, REQUEST_CODE_VENMO_APP_SWITCH);
        }
        else {
            //popup!
        }
    }
}