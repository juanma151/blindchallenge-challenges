package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0020", name = "Vanishing act")
public class Challenge0020 extends ChallengeBase {

    @Override
    public void challenge() {
        args(
                v("REMOVE"),
                v("person"),
                v("Bob")
        );
        expected(
                error("Not found")
        );
    }
}
