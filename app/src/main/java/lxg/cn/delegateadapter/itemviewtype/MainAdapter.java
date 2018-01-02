package lxg.cn.delegateadapter.itemviewtype;

import android.support.annotation.Nullable;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import lxg.cn.delegateadapter.bean.Animal;
import lxg.cn.delegateadapter.bean.Cat;
import lxg.cn.delegateadapter.bean.Dog;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 18/01/02 11:05.
 */

public class MainAdapter extends RecyclerView.Adapter {

    private List<Animal> mAnimals;
    private SparseArrayCompat<Adapter> mCompat;
    private static final int TYPE_CAT = 0;
    private static final int TYPE_DOG = 1;

    public MainAdapter(@Nullable List<Animal> animals) {
        mAnimals = animals;
        mCompat = new SparseArrayCompat<>();
        mCompat.put(TYPE_CAT, new CatAdapter());
        mCompat.put(TYPE_DOG, new DogAdapter());
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mCompat.get(viewType).onCreateViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Adapter adapter = mCompat.get(holder.getItemViewType());
        adapter.onBindViewHolder(mAnimals, holder, position);
    }

    @Override
    public int getItemCount() {
        return mAnimals.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mAnimals.get(position) instanceof Cat) {
            return TYPE_CAT;
        } else if (mAnimals.get(position) instanceof Dog) {
            return TYPE_DOG;
        }
        return super.getItemViewType(position);
    }
}
