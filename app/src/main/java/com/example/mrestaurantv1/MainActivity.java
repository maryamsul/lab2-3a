package com.example.mrestaurantv1;
import static android.content.ContentValues.TAG;

import java.util.ArrayList;
import com.example.model.Restaurant;

import com.example.model.RestaurantsListViewModel;
import com.example.mrestaurantv1.databinding.ActivityListBinding;
import com.example.mrestaurantv1.databinding.ActivitySplashBinding;
import com.google.android.material.snackbar.Snackbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;

import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.mrestaurantv1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ActivityListBinding listBinding;
    private ActivitySplashBinding splashBinding;
    private ArrayAdapter<Restaurant> adapter;
    private ArrayList<Restaurant> restaurantList = new ArrayList<>();
    private RestaurantViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate called");
        new ViewModelProvider(this).get(RestaurantsListViewModel.class);
        viewModel = new ViewModelProvider(this).get(RestaurantViewModel.class);
        MyApp app = (MyApp) getApplicationContext();
        app.setViewModel(viewModel);



        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        restaurantList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, restaurantList);
/*
        binding.listViewRestaurants.setAdapter(adapter);
        addSomeRestaurants();


        binding.btnAdd.setOnClickListener(v -> addRestaurant());
        binding.btnAdd.setOnClickListener(v -> showSplashLayout());
*/
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called");
    }
    /*
    private void showSplashLayout() {
        // Inflate splash layout
        ActivitySplashBinding splashBinding = ActivitySplashBinding.inflate(getLayoutInflater());

        // Show splash layout
        setContentView(splashBinding.getRoot());

        // Set toolbar from splash layout
        setSupportActionBar(splashBinding.toolbar);

        // Update number of restaurants
        splashBinding.nb.setText(String.valueOf(restaurantList.size()));

        // Optional: add a back button on splash to return to main layout
    }


    public void addSomeRestaurants() {
        restaurantList.add(new Restaurant("McDonald's", "Dbaye", true, false, false));
        restaurantList.add(new Restaurant("KFC", "Tripoli", true, false, false));
        restaurantList.add(new Restaurant("Deep & Deep", "Beirut", true, false, false));

    }

    private void addRestaurant() {
        String name = binding.etName.getText().toString().trim();
        String address = binding.etAddress.getText().toString().trim();
        boolean delivery = binding.cbDelivery.isChecked();
        boolean takeawy = binding.cbTakeaway.isChecked();
        boolean dineIn = binding.cbDineIn.isChecked();

        if (name.isEmpty()) {
            binding.etName.setError("Required");
            binding.etName.requestFocus();
            return;
        }

        if (address.isEmpty()) {
            binding.etAddress.setError("Required");
            binding.etAddress.requestFocus();
            return;
        }

        Restaurant restaurant = new Restaurant(name, address, delivery, takeawy, dineIn);
        restaurantList.add(restaurant);
        adapter.notifyDataSetChanged();

// Show styled confirmation
        Snackbar.make(binding.getRoot(), "Restaurant added. Total: " + restaurantList.size(), Snackbar.LENGTH_SHORT).show();

        // Reset fields
        binding.etName.setText("");
        binding.etAddress.setText("");
        binding.cbDelivery.setChecked(false);
        binding.cbTakeaway.setChecked(false);
        binding.cbDineIn.setChecked(false);

        binding.etName.requestFocus();
    }
  */
//lab2
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
            Intent intent = new Intent(this, AddRestaurantActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(this, RestaurantListActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onSaveInstanceState (Bundle b){
        super.onSaveInstanceState(b);
        Log.d("ACTIVITY_LIFECYCLE", "onSave()");
    }
    @Override
    public void onRestoreInstanceState (Bundle b){
        super.onRestoreInstanceState(b);
        Log.d("AACTIVITY_LIFECYCLE","onRestore()");
    }


 /*
    @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
            if (item.getItemId() == R.id.nav_gallery){
                // Your add menu logic here
                return true;
            } else if (item.getItemId() == R.id.nav_slideshow) {
                addRestaurant();
                Snackbar.make(binding.getRoot(), "Total Restaurants: " + restaurantList.size(), Snackbar.LENGTH_SHORT).show();
                return true;
            } else if (id == R.id.nav_home) {
                binding.etName.setText("");
                binding.etAddress.setText("");
                binding.cbDelivery.setChecked(false);
                binding.cbTakeaway.setChecked(false);
                binding.cbDineIn.setChecked(false);
                binding.etName.requestFocus();

                Snackbar.make(binding.getRoot(), "Form reset", Snackbar.LENGTH_SHORT).show();
                return true;
            }
            return super.onOptionsItemSelected(item);
        }*/


    }