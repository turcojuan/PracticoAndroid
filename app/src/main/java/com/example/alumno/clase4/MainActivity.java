package com.example.alumno.clase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para cargar menus
        //Android Studio 2.2.3 en la facu
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        getMenuInflater().inflate(R.menu.mi_menu,menu);

        return true;

    }
     //ya tienen su listener creado, no hacer falta crear uno nuevo

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.item1) {
            Log.d("", "Click sobre la opcion 1 del menu");
        }
        if(item.getItemId() == R.id.item2) {
            Log.d("", "Click sobre la opcion 2 del menu");
        }

        return super.onOptionsItemSelected(item);
    }


}
