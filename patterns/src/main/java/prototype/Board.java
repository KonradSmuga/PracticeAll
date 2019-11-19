package prototype;





import java.util.HashSet;
import java.util.Set;



public class Board extends Prototype {

    private String name;
    private Set<TaskList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Set<TaskList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for (TaskList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return (Board) super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLists(Set<TaskList> lists) {
        this.lists = lists;
    }
}
//
//    public Board deepCopy() throws CloneNotSupportedException {
//        Board cloneBoard = (Board)super.clone();
//        cloneBoard.lists = new HashSet<>();
//    }
//}


