package lxg.cn.delegateadapter.delegate;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import lxg.cn.delegateadapter.R;
import lxg.cn.delegateadapter.bean.Animal;
import lxg.cn.delegateadapter.bean.Cat;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 17/12/29 9:10.
 */

public class CatAdapter extends AbsAdapterDelegate<List<Animal>> {

    public CatAdapter(int viewType) {
        super(viewType);
    }

    @Override
    public boolean isForViewType(@NonNull List<Animal> items, int position) {
        return items.get(position) instanceof Cat;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cat, parent, false);
        return new CatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull List<Animal> items, int position, @NonNull RecyclerView.ViewHolder holder) {
        Cat cat = (Cat) items.get(position);
        ((CatViewHolder) holder).mName.setText(cat.getName());
    }

    static class CatViewHolder extends RecyclerView.ViewHolder {
        TextView mName;

        public CatViewHolder(View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.tv_name);
        }
    }
}
