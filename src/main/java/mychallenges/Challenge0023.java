package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0023", name = "Lost in translation")
public class Challenge0023 extends ChallengeBase {

    @Override
    public void challenge() {
        args(
                v("GET"),
                v("car"),
                v("Tesla")
        );
        expected(
                error("Unknown entity")
        );
    }
}
