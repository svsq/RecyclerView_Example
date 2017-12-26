package tk.slaventij.recycleview_example;

import java.util.ArrayList;
import java.util.List;

class ModelItem {
    private String name;
    private int imgId;

    public String getName() {
        return name;
    }

    public int getImgId() {
        return imgId;
    }

    public ModelItem(String name, int imgId) {

        this.name = name;
        this.imgId = imgId;
    }

    public static List<ModelItem> getFakeItems() {
        ArrayList<ModelItem> itemsList = new ArrayList<>();
        itemsList.add(new ModelItem("01. Road", R.drawable.beautiful_wallpaper));
        itemsList.add(new ModelItem("02. Earth forest", R.drawable.earth_forest));
        itemsList.add(new ModelItem("03. Blue World Map", R.drawable.blue_world_map));
        itemsList.add(new ModelItem("04. City of Love", R.drawable.city_of_love));
        itemsList.add(new ModelItem("05. Dice", R.drawable.dice));
        itemsList.add(new ModelItem("06. Fall autumn red season", R.drawable.fall_autumn_red_season));
        itemsList.add(new ModelItem("07. Android motherboard", R.drawable.motherboard));
        itemsList.add(new ModelItem("08. Panda", R.drawable.panda));
        itemsList.add(new ModelItem("09. Purple sunset", R.drawable.purple_sunset_wallpaper));
        itemsList.add(new ModelItem("10. Ship", R.drawable.ship));

        return itemsList;
    }
}
