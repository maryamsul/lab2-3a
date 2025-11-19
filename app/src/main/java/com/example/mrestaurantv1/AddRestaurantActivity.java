package com.example.mrestaurantv1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.model.Restaurant;

public class AddRestaurantActivity extends AppCompatActivity {
    private EditText editTextName;
    private Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_restaurant);

        // Apply system window insets for edge-to-edge layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextName = findViewById(R.id.editTextRestaurantName);
        buttonAdd = findViewById(R.id.buttonAddRestaurant);

        // Get shared ViewModel instance from MyApp
        MyApp app = (MyApp) getApplicationContext();
        RestaurantViewModel viewModel = app.getViewModel();

        // Handle Add button click
        buttonAdd.setOnClickListener(v -> {
            String name = editTextName.getText().toString().trim();
            if (!name.isEmpty()) {
                viewModel.addRestaurant(new Restaurant(name, "Unknown address", false, false, false));
                editTextName.setText("");
            } else {
                editTextName.setError("Name is required");
            }
        });
    }
}
