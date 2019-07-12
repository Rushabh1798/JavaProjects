import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Comparison implements Serializable {
    private static final long serialVersionUID = 2885606274345395894L;
    private int id;
    private int age;
    private String name;

    public Comparison() {
    }

    public Comparison(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<Comparison> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i <= 5; i++) {
            list.add(new Comparison(i + 1, rand.nextInt(100) + 1, "Rushabh " + ((char) (65 + i))));
        }

        Collections.sort(list, new Compare(1));
        System.out.println(list);
        Collections.sort(list, new Compare(2));
        System.out.println(list);
        Collections.sort(list, new Compare(3));
        System.out.println(list);

        Collections.sort(list, new Compare(1, true));
        System.out.println(list);
        Collections.sort(list, new Compare(2, true));
        System.out.println(list);
        Collections.sort(list, new Compare(3, true));
        System.out.println(list);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Comparison{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Compare implements Comparator<Comparison> {

    private Boolean order = false;
    private int params = 1;

    public Compare(int params) {
        this.params = params;
    }

    public Compare(int params, Boolean order) {
        this.order = order;
        this.params = params;
    }

    @Override
    public int compare(Comparison o1, Comparison o2) {
        switch (params) {
            case 1:
                if (!order) {
                    if (o1.getId() > o2.getId()) return 1;
                    else if (o2.getId() > o1.getId()) return -1;
                    else return 0;
                } else {
                    if (o1.getId() > o2.getId()) return -1;
                    else if (o2.getId() > o1.getId()) return 1;
                    else return 0;
                }
            case 2:
                if (!order) {
                    if (o1.getAge() > o2.getAge()) return 1;
                    else if (o1.getAge() < o2.getAge()) return -1;
                    else return 0;
                } else {
                    if (o1.getAge() > o2.getAge()) return -1;
                    else if (o1.getAge() < o2.getAge()) return 1;
                    else return 0;
                }
            case 3:
                if (!order) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return o2.getName().compareTo(o1.getName());
                }
            default:
                return 0;
        }
    }
}


