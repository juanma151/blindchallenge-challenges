package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0025", name = "Name matters")
public class Challenge0025 extends ChallengeBase {

    @Override
    public void challenge() {
        args(
                v("PUT"),
                v("person")
        );
        expected(
                error("Missing name")
        );
    }
}
