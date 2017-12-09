package com.example.arn.androidgrams;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filter.FilterListener;
import android.widget.Filterable;
import com.example.arn.androidgrams.Adapter.ViewHolder;
import java.util.ArrayList;
import java.util.List;

/**
 * Skeleton of a filterable RecyclerView adapter.
 */

public class Adapter extends RecyclerView.Adapter<ViewHolder> implements Filterable {

  private final List<?> originalItems;
  private final List<?> items;
  private MyFilter filter;

  public Adapter() {
    originalItems = new ArrayList<>();
    items = new ArrayList<>();
  }

  @Override
  public int getItemCount() {
    return items.size();
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    // Inflate view.
    // Create ViewHolder.
    return null;
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    // Get item at position.
    // holder.bind();
  }

  @Override
  public Filter getFilter() {
    return filter;
  }

  public void setFilter() {
    filter.filter(null /** Constraint */, new FilterListener() {
      @Override
      public void onFilterComplete(int i) {
        notifyDataSetChanged();
      }
    });
  }

  static class ViewHolder extends RecyclerView.ViewHolder {

    public ViewHolder(View v) {
      super(v);
      // ButterKnife.bind(this, v);
    }

    public void bind() {
      // Bind the object.
    }

  }

  private class MyFilter extends Filter {

    @Override
    public CharSequence convertResultToString(Object resultValue) {
      return super.convertResultToString(resultValue);
    }

    @Override
    protected FilterResults performFiltering(CharSequence charSequence) {
      return null;
    }

    @Override
    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {

    }
  }
}
