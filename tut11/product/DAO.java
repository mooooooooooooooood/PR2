package PR2.tut11.product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

abstract class DAO<Entity extends Serializable> {
    protected List<Entity> dataList;

    public DAO() {
        this.dataList = new ArrayList<>();
    }

    public void add(Entity entity) {
        dataList.add(entity);
    }

    public void remove(Entity entity) {
        dataList.remove(entity);
    }

    public abstract void update(Entity entity); //update in4 of object already in the list

    public abstract Entity find(Serializable id); //search, return object from list based on unique key(id)

    public List<Entity> getList() {
        return dataList;
    }
}
