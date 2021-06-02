class A
{
    void abc()
    {
        class B
        {
            void def()
            {
                class Local
                {
                    void ghi()
                    {
                        System.out.println(4);

                    }
                }
                Local l =new Local(){
                    void ghi()
                    {
                        System.out.println("inside anonymous");
                    }
                };
                System.out.println(3);
                l.ghi();
                
            }
        }
        B b=new B();
        System.out.println(2);
        b.def();

    }
}
class Test
{
    public static void main(String ar[])
    {
        A a=new A();

        System.out.println(1);
        a.abc();

    }
}

// test also updated
/*

config 
init
status 
add 
commit
log
checkout
.gitignore
Repository
push 
remote
clone
fork 
pull request

*/