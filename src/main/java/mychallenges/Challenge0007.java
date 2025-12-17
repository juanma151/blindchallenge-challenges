package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0007", name = "Age of Empires")
public class Challenge0007 extends ChallengeBase {

    @Override
    public void challenge() {
        args(
                v("PUT"),
                v("person"),
                v("Bob"),
                v("age"),
                v(30)
        );
        expected(
                v(true)
        );
    }
}
