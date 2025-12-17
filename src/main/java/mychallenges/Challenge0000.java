package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;

@Challenge(id = "0000", name = "In the beginning there was nothing")
public class Challenge0000 extends ChallengeBase {

    @Override
    public void challenge() {
        args();
        expected(
                error("No arguments")
        );
    }
}
