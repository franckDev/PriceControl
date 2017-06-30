package com.app.franck.pricecontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static com.app.franck.pricecontrol.R.menu.menu_main;

/**
 * Created by Franck on 19/02/2017.
 */
public class FisActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(menu_main, menu);

        // Masquage du menu fis
        MenuItem itemFis = menu.findItem(R.id.create);
        itemFis.setVisible(false);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.content:
                Intent intentM = new Intent(this, TabActivity.class);
                startActivity(intentM);
                finish();
                return true;
            case R.id.liste:
                Intent intentL = new Intent(this, TabListActivity.class);
                startActivity(intentL);
                finish();
                return true;
            case R.id.fermer:
                // Message
                Toast.makeText(this, "Merci au revoir", Toast.LENGTH_SHORT).show();
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
