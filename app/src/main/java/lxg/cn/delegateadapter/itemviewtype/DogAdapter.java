package lxg.cn.delegateadapter.itemviewtype;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import lxg.cn.delegateadapter.R;
import lxg.cn.delegateadapter.bean.Dog;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 18/01/02 11:00.
 */

public class DogAdapter implements Adapter<List<Dog>> {


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dog, parent, false);
        return new DogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull List<Dog> items, @NonNull RecyclerView.ViewHolder holder, int position) {
        Dog dog = items.get(position);
        ((DogViewHolder) holder).mName.setText(dog.getName());
    }

    static class DogViewHolder extends RecyclerView.ViewHolder {
        TextView mName;

        public DogViewHolder(View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.tv_name);
        }
    }
}
