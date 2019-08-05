package com.example.bstore;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class Main2ActivityCategory extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    GridView gridView;

    String[] values = {
            "Fantasy",
            "Science Fiction",
            "Westerns",
            "Thriller",
            "Mystery",
            "Detective Story",
            "Dystopia",
            "Horror",
            "Adventure",
            "Romance",
            "Comic Books",
            "Crime",
            "Drama"
    };

    int[] images = {
            R.drawable.fantacy,
            R.drawable.sciencefiction,
            R.drawable.westerns,
            R.drawable.thriller,
            R.drawable.mystery,
            R.drawable.detectivestory,
            R.drawable.dystopia,
            R.drawable.horror,
            R.drawable.adventures,
            R.drawable.romance,
            R.drawable.comic,
            R.drawable.crime,
            R.drawable.drama
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2category);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        gridView = (GridView) findViewById(R.id.grid);

        GridAdapter gridAdapter = new GridAdapter(this,values,images);
        gridView.setAdapter(gridAdapter);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){

            case R.id.nav_home:
                Intent h= new Intent(Main2ActivityCategory.this,Main3ActivityHome.class);
                startActivity(h);
                break;
            case R.id.nav_category:
                Intent i= new Intent(Main2ActivityCategory.this,Main2ActivityCategory.class);
                startActivity(i);
                break;
            case R.id.nav_feedback:
                Intent g= new Intent(Main2ActivityCategory.this,Main4ActivityFeedback.class);
                startActivity(g);
                break;
            case R.id.nav_tools:
                Intent s= new Intent(Main2ActivityCategory.this,Main5ActivityTools.class);
                startActivity(s);
                break;
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
