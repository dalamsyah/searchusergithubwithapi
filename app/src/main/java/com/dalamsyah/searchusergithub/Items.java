package com.dalamsyah.searchusergithub;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Items {
    @SerializedName("total_count") private int total;
    @SerializedName("incomplete_results") private String result;
    @SerializedName("items") private List<User> items;

    public List<User> getUser() {
        return items;
    }

    public int getTotal() {
        return total;
    }
}
