package com.haxxanparhar.demostaggeredmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SponsorLogoAdapter extends RecyclerView.Adapter<SponsorLogoAdapter.ViewHolder> {

    Context context;
    List<SponsorLogo> list;

    public SponsorLogoAdapter(Context context, List<SponsorLogo> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_sponsor_logo, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SponsorLogo model = list.get(position);
        if (model != null)
            holder.imageView.setImageDrawable(ContextCompat.getDrawable(context, model.drawable));
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.ivLogo);
        }
    }
}
