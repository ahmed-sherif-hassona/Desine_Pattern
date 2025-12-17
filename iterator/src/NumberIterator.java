import java.util.List;

public class NumberIterator implements iterator{
    private Numbers numbers;
    private int index=0;
    public NumberIterator(Numbers nums)
    {
        this.numbers=nums;
    }

    @Override
    public boolean hasNext() {
        return index<numbers.getSize();

    }

    @Override
    public Object Next() {
        return numbers.getItem(index++);
    }
}