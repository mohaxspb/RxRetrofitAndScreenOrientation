package ru.kuchanov.rx.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ru.kuchanov.rx.R;
import ru.kuchanov.rx.model.Model;

public class RecyclerAdapterHotelsList extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private ArrayList<Model> models;

    public RecyclerAdapterHotelsList(ArrayList<Model> models)
    {
        this.models = models;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_hotel_in_list, parent, false);
        return new ViewHolderHotel(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {
        final ViewHolderHotel holderHotel = (ViewHolderHotel) holder;
        Model model = models.get(position);

        holderHotel.title.setText(model.getTitle());
        holderHotel.text.setText(model.getText());
    }

    @Override
    public int getItemCount()
    {
        return models.size();
    }

    public static class ViewHolderHotel extends RecyclerView.ViewHolder
    {
        public View root;
        public TextView title, text;

        public ViewHolderHotel(View v)
        {
            super(v);
            root = v.findViewById(R.id.root);
            title = (TextView) v.findViewById(R.id.title);
            text = (TextView) v.findViewById(R.id.text);
        }
    }
}