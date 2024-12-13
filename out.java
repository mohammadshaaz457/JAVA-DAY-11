interface out
{
    void outmeth();
    interface in
    {
        void inmeth();
    }
}
class NestedInterface implements out.in
{
    public void inmeth()
    {
        System.out.println("Hello iam inner method");
    }
    public static void main(String args[])
    {
        NestedInterface h=new NestedInterface();
        h.inmeth();
    }
}
