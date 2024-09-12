// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 173, 172);
        Worm worm =  new  Worm();
        addObject(worm, 357, 303);
        Worm worm2 =  new  Worm();
        addObject(worm2, 90, 417);
        Worm worm3 =  new  Worm();
        addObject(worm3, 293, 469);
        Worm worm4 =  new  Worm();
        addObject(worm4, 328, 66);
        Worm worm5 =  new  Worm();
        addObject(worm5, 432, 484);
        Worm worm6 =  new  Worm();
        addObject(worm6, 72, 66);
        Worm worm7 =  new  Worm();
        addObject(worm7, 472, 165);
        BigBaddie ogBigBad =  new  BigBaddie();
        addObject(ogBigBad, Greenfoot.getRandomNumber(360), Greenfoot.getRandomNumber(360));
        Worm worm8 =  new  Worm();
        addObject(worm8, 50, 285);
    }
}
