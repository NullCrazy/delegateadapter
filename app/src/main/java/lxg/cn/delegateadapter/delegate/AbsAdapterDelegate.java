package lxg.cn.delegateadapter.delegate;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 17/12/28 17:52.
 */

public abstract class AbsAdapterDelegate<T> implements AdapterDelegate<T> {

    public int viewType;

    public AbsAdapterDelegate(int viewType) {
        this.viewType = viewType;
    }

    @Override
    public int getItemViewType() {
        return viewType;
    }
}
