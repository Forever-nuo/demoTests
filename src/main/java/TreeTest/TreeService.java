package TreeTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述：获得树形的服务实现 作者： xfz
 * <p/>
 * 时间：2016年7月2日
 * <p/>
 * 版本号：1.0
 */
public abstract class TreeService<T extends BaseTreeObj<T, ID>, ID extends Serializable> implements
        TreeInterface<T, ID> {

    public List<T> getChildTreeObjects(List<T> list, ID parentId) {
        List<T> returnList = new ArrayList<T>();
        for (T t : list) {
            if (t.getParentId().equals(parentId)){
                recursionFn(list,t);
                returnList.add(t);
            }
        }
        return returnList;
    }

    /**
     * 递归列表
     *
     * @param list
     * @param t
     * @author xfz
     * <p/>
     * 上午1:11:57
     */
    public void recursionFn(List<T> list, T t) {
        List<T> childsList = getChildList(list, t);
        t.setChildsList(childsList);
        for (T nextChild : childsList) {
            recursionFn(list, nextChild);
        }
    }

    /**
     * 获得指定节点下的所有子节点
     * @param list
     * @param t
     * @return
     */
    public List<T> getChildList(List<T> list, T t) {
        List<T> childList = new ArrayList<T>();
        for (T childT : list)
            if (childT.getParentId().equals(t.getId()))
                childList.add(childT);
        return childList;
    }

    /**
     * 判断是否还有下一个子节点
     *
     * @param list
     * @param t
     * @return
     * @author xfz
     * <p/>
     * 上午1:13:43
     */
    public boolean hasChild(List<T> list, T t) {
        return getChildList(list, t).size() > 0;
    }
}