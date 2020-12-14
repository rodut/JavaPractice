/**
 * https://www.youtube.com/watch?v=5gU2wrQnbJs - Generic classes and methods
 */

package com.lessons.generics;

public class Main {
    public static void main(String[] args) {

        Body body = new Body();

        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();
        Leg leg = new Leg();

        Robot<SmallHead> smallHeadRobot = new Robot<>(body, smallHead);
        Robot<BigHead> bigHeadRobot = new Robot<>(body, bigHead);

        smallHeadRobot.getHead().burn();
        bigHeadRobot.getHead().turn();

        Robot robot = new Robot(body, mediumHead);
        robot.<SmallHead, BigHead>foo(smallHead, bigHead);

        Robot<SmallHead> robot1 = new Robot(body, smallHead);
        Robot<MediumHead> robot2 = new Robot<>(body, mediumHead);
        robot1.fuu(robot2);
    }
}
