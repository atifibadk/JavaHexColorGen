
public  String hex()
{
    Random rnd = new Random();
    int a = rnd.nextInt(255);//generating random number in the limit of 0 to 255
    int b = rnd.nextInt(255);
    int c = rnd.nextInt(255);
    String aa = new String();
    String bb = new String();
    String cc = new String();

    aa=Integer.toHexString(a);//converting into hex
    bb= Integer.toHexString(b);
    cc=Integer.toHexString(c);

    if (a<16){
        aa="0"+aa;// appending leading zeros(ex:03 instead of 3)
    }
    if (b<16){
        bb="0"+bb;
    }
    if (c<16){
        cc="0"+cc;
    }
    String hex= new String();
    hex="#"+aa+bb+cc; //making it 6 digit hex colour file suitable for setting colour

    return hex;
}


