class prex_opr
{
    //associativity and precidence
    public static void main(String[] agrs)
    {
        int a= 6*5-34/2;
        /* highest precidence gose to * and /. they are then evaluated on the basis of left to right assosiativity
           =30-34/2
           =30-17
           =13 */
        int b= 60/5-34*2;
        /* =12-34*2
           =12-68
           =-56   */
        System.out.println(a);
        System.out.println(b);
    }
}