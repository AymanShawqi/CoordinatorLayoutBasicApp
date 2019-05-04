package com.android.coordinatorlayoutbasicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private Context mContext;
    private List<Person> mPersonList;

    public PersonAdapter(Context context, List<Person> personList) {
        mContext = context;
        mPersonList = personList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mContext);
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.idTextView.setText(String.valueOf(mPersonList.get(position).getId()));
        holder.nameTextView.setText(mPersonList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mPersonList.size();
    }

    class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView idTextView;
        TextView nameTextView;
        public PersonViewHolder(View itemView) {
            super(itemView);
            idTextView=itemView.findViewById(R.id.person_id);
            nameTextView=itemView.findViewById(R.id.person_name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position=getAdapterPosition();
            Toast.makeText(mContext,mPersonList.get(position).getName(),Toast.LENGTH_SHORT).show();
        }
    }
}
