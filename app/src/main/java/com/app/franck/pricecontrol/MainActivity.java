package com.app.franck.pricecontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

//https://openclassrooms.com/courses/creez-des-applications-pour-android/les-bases-de-donnees-5
//http://www.androidhive.info/2011/11/android-sqlite-database-tutorial/
public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Masquage du menu content
        MenuItem itemFis = menu.findItem(R.id.content);
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
