package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0017", name = "Second chance")
public class Challenge0017 extends ChallengeBase {

    @Override
    public void challenge() {
        args(
                v("PUT"),
                v("person"),
                v("Alice"),
                v("age"),
                v(28)
        );
        expected(
                v(true)
        );
    }
}
