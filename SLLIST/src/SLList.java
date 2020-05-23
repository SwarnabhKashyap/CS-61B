public class SLList {
    //Sentinel node is a dummy node to prevent the null pointer exception if by mistake we create an empty list call the
    //add last method on it
    //the list starts from sentinel.next
    private IntNode sentinel;
    private IntNode temp;
    public int size;
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n)
        {
            item = i;
            next = n;
        }
    }

    //Creates a new SLList without the user needing to pass the null value.

    //empty SLList
    public SLList()
    {
        sentinel = new IntNode(57,null);
        size = 0;
    }

    public SLList(int x)
    {
        sentinel = new IntNode(57,null);
        sentinel.next = new IntNode(x,null);
        size=1;
    }

    //adds a new item to the beginning of the list
    public void addFirst(int x)
    {
        temp = sentinel.next;
        sentinel.next = new IntNode(x,temp);
        size+=1;
    }

    public int getFirst()
    {
        return sentinel.next.item;
    }

    public void addLast(int x)
    {
            IntNode p = sentinel;
            while(p.next!=null)
            {
                p = p.next;
            }

            p.next = new IntNode(x,null);
            size+=1;
    }

    public int getSize()
    {
        return this.size;
    }

    public void printList()
    {
        System.out.println(".................Printing List.......................");
        IntNode p = sentinel.next;
        while(p.next!=null)
        {
            System.out.print(p.item+">>");
            p=p.next;

        }
        System.out.print(p.item);
        System.out.println();
    }


    public static void main(String[] args)
    {
        SLList l1 = new SLList(10);
        l1.addFirst(25);
        l1.addFirst(40);
        l1.addLast(69);
        l1.addFirst(1);
        l1.addFirst(0);
        l1.addLast(99);
        l1.printList();
        System.out.println(l1.getSize());
    }
}
