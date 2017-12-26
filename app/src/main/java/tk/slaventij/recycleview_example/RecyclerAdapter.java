package tk.slaventij.recycleview_example;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private ArrayList<ModelItem> items = new ArrayList<>();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void addAll(List<ModelItem> fakeItems) {

        int position = getItemCount();
        this.items.addAll(fakeItems);
        notifyItemRangeInserted(position, this.items.size());
    }
}
