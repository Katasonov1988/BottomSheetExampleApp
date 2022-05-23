package ru.skillbranch.bottomsheetappexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomSheetMainScreen extends AppCompatActivity {

    private BottomAppBar bottomAppBar;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomAppBar = findViewById(R.id.bottomAppBar);
        initialBottomAppBar();
//
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(onClickFab);

    }

    private void initialBottomAppBar() {
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.addButton) {
                    Toast.makeText(BottomSheetMainScreen.this, "Клик", Toast.LENGTH_SHORT).show();
                }
                return true;
                }
            });
        }

    View.OnClickListener onClickFab = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(BottomSheetMainScreen.this, "Нажата FAB", Toast.LENGTH_SHORT).show();
        }
    };
}
