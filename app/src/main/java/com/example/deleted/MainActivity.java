package com.example.deleted;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     RecyclerView SettingRecyclerView;
     Settings_Adapter_menu Adapter;
     List<Settings_menu_items> Settingsitemlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SettingRecyclerView=findViewById(R.id.Recyclerview);
        CreatListItems();
        Adapter= new Settings_Adapter_menu(Settingsitemlist);
        SettingRecyclerView.setAdapter(Adapter);


    }

    private void CreatListItems() {
        Settingsitemlist=new ArrayList<>();
        Settingsitemlist.add(new Settings_menu_items("facebook", R.drawable.ic_apps_24));
        Settingsitemlist.add(new Settings_menu_items("Settings", R.drawable.ic_settings_24));
        Settingsitemlist.add(new Settings_menu_items("Sacreen share", R.drawable.ic_screen_share_24));
        Settingsitemlist.add(new Settings_menu_items("wifi", R.drawable.ic_wifi_statusbar_4_bar_24));
        Settingsitemlist.add(new Settings_menu_items("launcher_foreground", R.drawable.ic_launcher_foreground));
        for (int i=0;i<30;i++){
            Settingsitemlist.add(new Settings_menu_items("launcher_foreground"+i , R.drawable.ic_screen_share_24));
        }

    }
}