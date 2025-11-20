package com.example.mrestaurantv1;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.mrestaurantv1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private RestaurantViewModel viewModel;   // shared ViewModel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate called");

        // Inflate layout
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Use toolbar from the layout
        setSupportActionBar(binding.toolbar);

        // Create ONE shared ViewModel
        viewModel = new ViewModelProvider(this).get(RestaurantViewModel.class);

        // Store it globally in MyApp so other activities can access it
        MyApp app = (MyApp) getApplication();
        app.setViewModel(viewModel);

        // NOTE: No arraylist here! List lives inside ViewModel
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            startActivity(new Intent(this, AddRestaurantActivity.class));
            return true;
        } 
        else if (id == R.id.nav_gallery) {
            startActivity(new Intent(this, RestaurantListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
