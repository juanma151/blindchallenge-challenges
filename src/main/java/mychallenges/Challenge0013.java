package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0013", name = "Nobody home")
public class Challenge0013 extends ChallengeBase {

    @Override
    public void challenge() {
        args(
                v("GET"),
                v("person"),
                v("Mallory")
        );
        expected(
                error("Not found")
        );
    }
}

