package ru.skillbranch.bottomsheetappexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetDialog;
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
//                    final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
//                            BottomSheetMainScreen.this, R.style.Base_Theme_Material3_Dark_BottomSheetDialog
//                    );
//                    View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottom_sheet_add_photos,(LinearLayout)findViewById(R.id.modalBottomSheetContainer));
//
//                    bottomSheetView.findViewById(R.id.takePhoto).setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            Toast.makeText(BottomSheetMainScreen.this, "Сделать фото", Toast.LENGTH_SHORT).show();
//                            bottomSheetDialog.dismiss();
//                        }
//                    });
//
//                    bottomSheetView.findViewById(R.id.choseFromGallery).setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            Toast.makeText(BottomSheetMainScreen.this, "Выбрать фото из галереи", Toast.LENGTH_SHORT).show();
//                            bottomSheetDialog.dismiss();
//                        }
//                    });
//
//                    bottomSheetDialog.setContentView(bottomSheetView);
//                    bottomSheetDialog.show();
//
//
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
