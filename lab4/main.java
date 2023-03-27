class Main 
{
    public static void main(String[] args) 
    {
        Onelist linkedList = new Onelist();
        
        linkedList.insertFirst(1);
        linkedList.insertFirst(1);
        linkedList.insertFirst(4);
        linkedList.insertFirst(4);
        linkedList.insertFirst(1);
        linkedList.insertFirst(1);



        System.out.println(linkedList.isSymetric());

        linkedList.printLinkedList();

    }
}