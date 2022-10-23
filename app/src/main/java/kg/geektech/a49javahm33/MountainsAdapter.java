package kg.geektech.a49javahm33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MountainsAdapter extends RecyclerView.Adapter<MountainsViewHolder> {
    private ArrayList<String> mountainsList;

    public MountainsAdapter(ArrayList<String> mountainsList) {
        this.mountainsList = mountainsList;
    }

    @NonNull
    @Override
    public MountainsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MountainsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mountains, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MountainsViewHolder holder, int position) {
        holder.bind(mountainsList.get(position));

    }

    @Override
    public int getItemCount() {
        return mountainsList.size();
    }
}
