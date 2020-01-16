import java.util.Random; 

class Personaggio {
    private int life;
    private String name;
    private int power;
    private Random r;


public Personaggio (String name)
{
    this.name = name;
    this.power = 10;
    this.life = 100;
    this.r = new Random();
}

public int hit(int power)
{

this.life = this.life -(1+this.r.nextInt(power));
return this.life;
}

public int getPower()
{
    return this.power;
}

public int getLife()
{
    return this.life;
}

public int isAlive()

{
    int a;

    if(this.life <= 0)
    {      
        a=0;
       
    }else{

        a=1;
    }

    return a;

}

}
