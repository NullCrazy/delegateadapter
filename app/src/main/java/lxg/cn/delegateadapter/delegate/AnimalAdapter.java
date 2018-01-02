package lxg.cn.delegateadapter.delegate;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import lxg.cn.delegateadapter.bean.Animal;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 17/12/29 8:59.
 */

public class AnimalAdapter extends RecyclerView.Adapter {
    private List<Animal> mAnimals;
    private AdapterDelegatesManager<List<Animal>> mDelegatesManager = new AdapterDelegatesManager<>();

    public AnimalAdapter(List<Animal> animals) {
        this.mAnimals = animals;
        mDelegatesManager.addDelegate(new DogAdapter(0));
        mDelegatesManager.addDelegate(new CatAdapter(1));
    }

    @Override
    public int getItemViewType(int position) {
        return mDelegatesManager.getItemViewType(mAnimals, position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mDelegatesManager.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        mDelegatesManager.onBindViewHolder(mAnimals, holder, position);
    }

    @Override
    public int getItemCount() {
        return mAnimals.size();
    }
}
