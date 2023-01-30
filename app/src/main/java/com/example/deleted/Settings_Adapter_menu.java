package com.example.deleted;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Settings_Adapter_menu extends RecyclerView.Adapter<Settings_Adapter_menu.SettingsViewHolder> {
    List<Settings_menu_items> items;
    public Settings_Adapter_menu( List<Settings_menu_items> items){
        this.items=items;

    }


    @NonNull
    @Override
    public SettingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.apps_phons,parent,false);
        return new SettingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingsViewHolder holder, int position) {
        Settings_menu_items item=items.get(position);
        holder.icons.setImageResource(item.ImageView);
        holder.nameApps.setText(item.Name_Apps);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class SettingsViewHolder extends RecyclerView.ViewHolder{
        ImageView icons;
        TextView nameApps;
        public SettingsViewHolder(@NonNull View itemView) {
            super(itemView);
            icons=itemView.findViewById(R.id.icon_apps);
            nameApps=itemView.findViewById(R.id.name_app);
        }
    }
}
