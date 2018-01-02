package lxg.cn.delegateadapter.itemviewtype;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import lxg.cn.delegateadapter.R;
import lxg.cn.delegateadapter.bean.Cat;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 18/01/02 11:04.
 */

public class CatAdapter implements Adapter<List<Cat>> {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cat, parent, false);
        return new CatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull List<Cat> items, @NonNull RecyclerView.ViewHolder holder, int position) {
        Cat cat = items.get(position);
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
