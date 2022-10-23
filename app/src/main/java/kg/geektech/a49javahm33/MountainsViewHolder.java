package kg.geektech.a49javahm33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MountainsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvMountains;

    public MountainsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMountains = itemView.findViewById(R.id.tv_mountains);
    }

    public void bind(String mountains) {
        tvMountains.setText(mountains);
    }
}
