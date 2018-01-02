package lxg.cn.delegateadapter.bean;

/**
 * <p/>作者： lxg
 * <p/>创建时间: 17/12/29 8:58.
 */

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

