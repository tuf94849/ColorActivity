import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ColorAdapter extends BaseAdapter {

    Context c;
    String[] colorsArr;


    public ColorAdapter(Context c, String[] colors){
        this.c = c;
        this.colorsArr = colors;

    }

    @Override
    public int getCount() {
        int count = colorsArr.length;
        return count;
    }

    @Override
    public Object getItem(int position) {
        return colorsArr[position];
    }

    @Override
    //can leave it as default
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv = new TextView((c));
        tv.setBackgroundColor(Color.parseColor(colorsArr[position]));
        tv.setText(colorsArr[position]);
        return tv;
    }
}
