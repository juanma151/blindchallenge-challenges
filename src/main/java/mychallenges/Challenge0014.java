package mychallenges;

import blch.framework.annotations.Challenge;
import blch.framework.external.ChallengeBase;

import static blch.framework.dsl.WireDsl.*;


@Challenge(id = "0014", name = "Selective memory")
public class Challenge0014 extends ChallengeBase {

    @Override
    public void challenge() {
        args(
                v("REMOVE"),
                v("person"),
                v("Alice")
        );
        expected(
                v(true)
        );
    }
}
