package com.dalamsyah.searchusergithub;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    public List<User> users;

    public UserAdapter(List<User> user) {
        users = user;
    }

    public UserAdapter() {
    }

    @NonNull
    @Override
    public UserAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.MyViewHolder myViewHolder, int i) {
        User user = users.get(i);
        myViewHolder.username.setText(user.getLogin());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView username;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            username = (TextView) itemView.findViewById(R.id.name);

        }
    }

    public void refresh(List<User> n){
        //users.clear();
        users = n;
        notifyDataSetChanged();
    }
}
