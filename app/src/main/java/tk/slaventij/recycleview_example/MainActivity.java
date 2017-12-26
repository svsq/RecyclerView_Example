package tk.slaventij.recycleview_example;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public class MainActivity extends Activity {

    private RecyclerView recyclerView;
    private LinearLayoutManager verticalLinearLayoutManager;
    private LinearLayoutManager horizontalLinearLayoutManager;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        verticalLinearLayoutManager = new LinearLayoutManager((this));
        horizontalLinearLayoutManager = new LinearLayoutManager((this));

        recyclerView.setLayoutManager(verticalLinearLayoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
        adapter.addAll(ModelItem.getFakeItems());

    }

    private class RecyclerAdapter extends RecyclerView.Adapter {
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
    }
}
