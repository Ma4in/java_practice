class Main 
{
    public static void main(String[] args) 
    {
        Onelist linkedList = new Onelist();
        
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);

        System.out.println(linkedList.max());
        System.out.println(linkedList.min());

        System.out.println(linkedList.isEmpty());

        System.out.println(linkedList.include(1));

        linkedList.replaceAll(3, 4);

        linkedList.replaceAll(4, 66);

        System.out.println(linkedList.lenght());

        linkedList.printLinkedList();

    }
}