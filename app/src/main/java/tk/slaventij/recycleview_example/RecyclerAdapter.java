package tk.slaventij.recycleview_example;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private ArrayList<ModelItem> items = new ArrayList<>();


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.bind(items.get(position));
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addAll(List<ModelItem> fakeItems) {

        int position = getItemCount();
        this.items.addAll(fakeItems);
        notifyItemRangeInserted(position, this.items.size());
    }
}
