package com.example.tictactoe2players;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GameActivity extends AppCompatActivity {

    private FbModule fbModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fbModule=new FbModule(this);

        BoardGame boardGame= new BoardGame(this);
        setContentView(boardGame);

    }

    public void setPositionToFb(int line, int col) {
        fbModule.setPositionToFireBase(new Position(line,col));
    }

    public void setPositionFromeFb(Position position) {
        Toast.makeText(this, ""+position.getCol(), Toast.LENGTH_SHORT).show();
    }
}