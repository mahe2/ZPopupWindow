package cc.ibooker.zpopupwindow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiyPopupWindow diyPopupWindow = new DiyPopupWindow(MainActivity.this);

//                diyPopupWindow.setAnimationStyle(cc.ibooker.zpopupwindowlib.R.style.TopPushPopupWindow);
//                diyPopupWindow.showTop();

                diyPopupWindow.setAnimationStyle(cc.ibooker.zpopupwindowlib.R.style.BottomPushPopupWindow);
                diyPopupWindow.showBottom();
            }
        });
    }

}