package com.app.franck.pricecontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Franck on 30/06/2017.
 */

public class TabListActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Masquage du menu tabListe
        MenuItem itemFis = menu.findItem(R.id.liste);
        itemFis.setVisible(false);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.create:
                Intent intentC = new Intent(this, FisActivity.class);
                startActivity(intentC);
                finish();
                return true;
            case R.id.content:
                Intent intentM = new Intent(this, TabActivity.class);
                startActivity(intentM);
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
