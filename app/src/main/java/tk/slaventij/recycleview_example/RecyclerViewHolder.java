package tk.slaventij.recycleview_example;

import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private ImageView image;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        image = itemView.findViewById(R.id.image);
    }

    public void bind(ModelItem modelItem) {
        image.setImageBitmap(BitmapFactory.decodeResource(itemView.getResources(), modelItem.getImgId()));
        name.setText(modelItem.getName());
    }
}
