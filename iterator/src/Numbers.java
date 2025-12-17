import java.util.ArrayList;
import java.util.List;

public class Numbers implements collection {

   private List<Integer>numbers=new ArrayList<>();
    public Numbers(List<Integer>nums)
    {
        this.numbers.addAll(nums);
    }

    public int getSize()
    {
        return numbers.size();
    }

    public int getItem(int index)
    {
        return numbers.get(index);
    }

    @Override
    public iterator CreateIterator() {
        return new NumberIterator(this);
    }
}
