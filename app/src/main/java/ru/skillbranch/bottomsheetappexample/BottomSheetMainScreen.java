package ru.skillbranch.bottomsheetappexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomSheetMainScreen extends AppCompatActivity {
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.open_modal_bottom_sheet);
        fab.setOnClickListener(onClickFab);
    }

    View.OnClickListener onClickFab = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(BottomSheetMainScreen.this, "Нажата FAB", Toast.LENGTH_SHORT).show();

            final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(BottomSheetMainScreen.this,R.style.Widget_Material3_BottomSheet_Modal);
            View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottom_sheet_add_photos,
                    (LinearLayout)findViewById(R.id.modalBottomSheetContainer));
            
            bottomSheetDialog.setContentView(bottomSheetView);
            bottomSheetDialog.show();

        }
    };

}
