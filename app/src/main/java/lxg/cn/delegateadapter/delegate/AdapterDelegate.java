package lxg.cn.delegateadapter.delegate;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 17/12/28 17:47.
 */

public interface AdapterDelegate<T> {

    /**
     * 获取类型
     *
     * @return
     */
    int getItemViewType();

    /**
     * 判断是否为当前类型
     *
     * @param items
     * @param position
     * @return
     */
    boolean isForViewType(@NonNull T items, int position);

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
    void onBindViewHolder(@NonNull T items, int position, @NonNull RecyclerView.ViewHolder holder);
}
