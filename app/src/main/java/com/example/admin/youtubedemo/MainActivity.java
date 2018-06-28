package com.example.admin.youtubedemo;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    showLeft();
  }

  private void showLeft() {


    LeftMenuFragment leftMenuFragment = new LeftMenuFragment();

    leftMenuFragment.setOnItemSelectedListener(new LeftMenuFragment.OnClickItemSelectedListener() {
      @Override
      public void onClickListener(int id) {
        if (id == 1) {
          Toast.makeText(MainActivity.this, "Trang chủ", Toast.LENGTH_SHORT).show();
        } else if (id == 2) {
          Toast.makeText(MainActivity.this, "Đề Xuất", Toast.LENGTH_SHORT).show();
        } else {
          Toast.makeText(MainActivity.this, "Thịnh Hành", Toast.LENGTH_SHORT).show();
          Toast.makeText(MainActivity.this, "Âm Nhạc", Toast.LENGTH_SHORT).show();
          Toast.makeText(MainActivity.this, "Giải Trí", Toast.LENGTH_SHORT).show();
        }
      }
    });
    getSupportFragmentManager().beginTransaction()
        .add(R.id.fragment_menu_left, leftMenuFragment)
        .commit();

    final ContenFragment contenFragment = new ContenFragment();
    getSupportFragmentManager().beginTransaction().add(R.id.fragment_content, contenFragment).commit();

    LeftMenuIconFragment leftMenuIconFragment = new LeftMenuIconFragment();
    getSupportFragmentManager().beginTransaction().add(R.id.fragment_menu_icon,leftMenuIconFragment).commit();
  }
}
