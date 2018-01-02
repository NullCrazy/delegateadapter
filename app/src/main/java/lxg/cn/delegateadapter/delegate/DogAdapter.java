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
import lxg.cn.delegateadapter.bean.Dog;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 17/12/29 9:02.
 */

public class DogAdapter extends AbsAdapterDelegate<List<Animal>> {

    public DogAdapter(int viewType) {
        super(viewType);
    }

    @Override
    public boolean isForViewType(@NonNull List<Animal> items, int position) {
        return items.get(position) instanceof Dog;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dog, parent, false);
        return new DogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull List<Animal> items, int position, @NonNull RecyclerView.ViewHolder holder) {
        Dog dog = (Dog) items.get(position);
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
