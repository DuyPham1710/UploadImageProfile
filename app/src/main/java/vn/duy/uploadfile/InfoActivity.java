package vn.duy.uploadfile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class InfoActivity extends AppCompatActivity {
    private ImageView imageAvatar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        imageAvatar = findViewById(R.id.imgAvatar);
        String avatar = MainActivity.avatar;
        if (avatar != null) {
            updateInfo(avatar);
        }

        imageAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void updateInfo(String avatar) {
        Glide.with(this)
                .load(avatar)
                .into(imageAvatar);
    }
}
