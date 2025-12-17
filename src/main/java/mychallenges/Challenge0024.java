package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0024", name = "Undefined behavior")
public class Challenge0024 extends ChallengeBase {

    @Override
    public void challenge() {
        args(
                v("FLY"),
                v("person"),
                v("Alice")
        );
        expected(
                error("Unknown command")
        );
    }
}

