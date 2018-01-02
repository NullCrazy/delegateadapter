package lxg.cn.delegateadapter.itemviewtype;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 18/01/02 10:59.
 */

public interface Adapter<T> {


    /**
     * 创建适配器
     *
     * @param parent
     * @return
     */
    @NonNull
    RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent);

    /**
     * 绑定数据
     */
    void onBindViewHolder(@NonNull T items, @NonNull RecyclerView.ViewHolder holder, int position);
}
