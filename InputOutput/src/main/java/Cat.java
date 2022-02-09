import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private String sort;
    private int weight;

    public Cat(String name, String sort, int weight) {
        this.name = name;
        this.sort = sort;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", weight=" + weight +
                '}';
    }
}
